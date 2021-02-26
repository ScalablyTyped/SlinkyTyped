package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CelebrityDetail extends StObject {
  
  /**
    * Bounding box around the body of a celebrity.
    */
  var BoundingBox: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.BoundingBox] = js.native
  
  /**
    * The confidence, in percentage, that Amazon Rekognition has that the recognized face is the celebrity. 
    */
  var Confidence: js.UndefOr[Percent] = js.native
  
  /**
    * Face details for the recognized celebrity.
    */
  var Face: js.UndefOr[FaceDetail] = js.native
  
  /**
    * The unique identifier for the celebrity. 
    */
  var Id: js.UndefOr[RekognitionUniqueId] = js.native
  
  /**
    * The name of the celebrity.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * An array of URLs pointing to additional celebrity information. 
    */
  var Urls: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Urls] = js.native
}
object CelebrityDetail {
  
  @scala.inline
  def apply(): CelebrityDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CelebrityDetail]
  }
  
  @scala.inline
  implicit class CelebrityDetailMutableBuilder[Self <: CelebrityDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingBox(value: BoundingBox): Self = StObject.set(x, "BoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingBoxUndefined: Self = StObject.set(x, "BoundingBox", js.undefined)
    
    @scala.inline
    def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    @scala.inline
    def setFace(value: FaceDetail): Self = StObject.set(x, "Face", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceUndefined: Self = StObject.set(x, "Face", js.undefined)
    
    @scala.inline
    def setId(value: RekognitionUniqueId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setUrls(value: Urls): Self = StObject.set(x, "Urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsUndefined: Self = StObject.set(x, "Urls", js.undefined)
    
    @scala.inline
    def setUrlsVarargs(value: Url*): Self = StObject.set(x, "Urls", js.Array(value :_*))
  }
}
