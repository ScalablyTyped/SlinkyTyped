package typingsSlinky.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerVersionContentInput extends StObject {
  
  /**
    * The Amazon S3 bucket of the layer archive.
    */
  var S3Bucket: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.S3Bucket] = js.native
  
  /**
    * The Amazon S3 key of the layer archive.
    */
  var S3Key: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.S3Key] = js.native
  
  /**
    * For versioned objects, the version of the layer archive object to use.
    */
  var S3ObjectVersion: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.S3ObjectVersion] = js.native
  
  /**
    * The base64-encoded contents of the layer archive. AWS SDK and AWS CLI clients handle the encoding for you.
    */
  var ZipFile: js.UndefOr[_Blob] = js.native
}
object LayerVersionContentInput {
  
  @scala.inline
  def apply(): LayerVersionContentInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerVersionContentInput]
  }
  
  @scala.inline
  implicit class LayerVersionContentInputMutableBuilder[Self <: LayerVersionContentInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
    
    @scala.inline
    def setS3Key(value: S3Key): Self = StObject.set(x, "S3Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyUndefined: Self = StObject.set(x, "S3Key", js.undefined)
    
    @scala.inline
    def setS3ObjectVersion(value: S3ObjectVersion): Self = StObject.set(x, "S3ObjectVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ObjectVersionUndefined: Self = StObject.set(x, "S3ObjectVersion", js.undefined)
    
    @scala.inline
    def setZipFile(value: _Blob): Self = StObject.set(x, "ZipFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZipFileUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ZipFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZipFileUndefined: Self = StObject.set(x, "ZipFile", js.undefined)
  }
}
