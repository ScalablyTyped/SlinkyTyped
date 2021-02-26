package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomLabel extends StObject {
  
  /**
    * The confidence that the model has in the detection of the custom label. The range is 0-100. A higher value indicates a higher confidence.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  
  /**
    * The location of the detected object on the image that corresponds to the custom label. Includes an axis aligned coarse bounding box surrounding the object and a finer grain polygon for more accurate spatial information.
    */
  var Geometry: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Geometry] = js.native
  
  /**
    * The name of the custom label.
    */
  var Name: js.UndefOr[String] = js.native
}
object CustomLabel {
  
  @scala.inline
  def apply(): CustomLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomLabel]
  }
  
  @scala.inline
  implicit class CustomLabelMutableBuilder[Self <: CustomLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    @scala.inline
    def setGeometry(value: Geometry): Self = StObject.set(x, "Geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryUndefined: Self = StObject.set(x, "Geometry", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
