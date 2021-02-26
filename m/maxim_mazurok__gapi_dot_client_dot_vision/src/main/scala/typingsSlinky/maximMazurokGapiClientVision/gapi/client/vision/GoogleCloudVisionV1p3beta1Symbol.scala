package typingsSlinky.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p3beta1Symbol extends StObject {
  
  /**
    * The bounding box for the symbol. The vertices are in the order of top-left, top-right, bottom-right, bottom-left. When a rotation of the bounding box is detected the rotation is
    * represented as around the top-left corner as defined when the text is read in the 'natural' orientation. For example: * when the text is horizontal it might look like: 0----1 | |
    * 3----2 * when it's rotated 180 degrees around the top-left corner it becomes: 2----3 | | 1----0 and the vertex order will still be (0, 1, 2, 3).
    */
  var boundingBox: js.UndefOr[GoogleCloudVisionV1p3beta1BoundingPoly] = js.native
  
  /** Confidence of the OCR results for the symbol. Range [0, 1]. */
  var confidence: js.UndefOr[Double] = js.native
  
  /** Additional information detected for the symbol. */
  var property: js.UndefOr[GoogleCloudVisionV1p3beta1TextAnnotationTextProperty] = js.native
  
  /** The actual UTF-8 representation of the symbol. */
  var text: js.UndefOr[String] = js.native
}
object GoogleCloudVisionV1p3beta1Symbol {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p3beta1Symbol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p3beta1Symbol]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p3beta1SymbolMutableBuilder[Self <: GoogleCloudVisionV1p3beta1Symbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingBox(value: GoogleCloudVisionV1p3beta1BoundingPoly): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingBoxUndefined: Self = StObject.set(x, "boundingBox", js.undefined)
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setProperty(value: GoogleCloudVisionV1p3beta1TextAnnotationTextProperty): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
