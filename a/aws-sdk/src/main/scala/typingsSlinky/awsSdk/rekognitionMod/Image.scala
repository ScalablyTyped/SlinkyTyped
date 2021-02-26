package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image extends StObject {
  
  /**
    * Blob of image bytes up to 5 MBs.
    */
  var Bytes: js.UndefOr[ImageBlob] = js.native
  
  /**
    * Identifies an S3 object as the image source.
    */
  var S3Object: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.S3Object] = js.native
}
object Image {
  
  @scala.inline
  def apply(): Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytes(value: ImageBlob): Self = StObject.set(x, "Bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesUndefined: Self = StObject.set(x, "Bytes", js.undefined)
    
    @scala.inline
    def setS3Object(value: S3Object): Self = StObject.set(x, "S3Object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ObjectUndefined: Self = StObject.set(x, "S3Object", js.undefined)
  }
}
