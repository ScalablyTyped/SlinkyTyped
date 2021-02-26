package typingsSlinky.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadListElement extends StObject {
  
  /**
    * The description of the archive that was specified in the Initiate Multipart Upload request.
    */
  var ArchiveDescription: js.UndefOr[String] = js.native
  
  /**
    * The UTC time at which the multipart upload was initiated.
    */
  var CreationDate: js.UndefOr[String] = js.native
  
  /**
    * The ID of a multipart upload.
    */
  var MultipartUploadId: js.UndefOr[String] = js.native
  
  /**
    * The part size, in bytes, specified in the Initiate Multipart Upload request. This is the size of all the parts in the upload except the last part, which may be smaller than this size.
    */
  var PartSizeInBytes: js.UndefOr[long] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the vault that contains the archive.
    */
  var VaultARN: js.UndefOr[String] = js.native
}
object UploadListElement {
  
  @scala.inline
  def apply(): UploadListElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadListElement]
  }
  
  @scala.inline
  implicit class UploadListElementMutableBuilder[Self <: UploadListElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchiveDescription(value: String): Self = StObject.set(x, "ArchiveDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveDescriptionUndefined: Self = StObject.set(x, "ArchiveDescription", js.undefined)
    
    @scala.inline
    def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setMultipartUploadId(value: String): Self = StObject.set(x, "MultipartUploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipartUploadIdUndefined: Self = StObject.set(x, "MultipartUploadId", js.undefined)
    
    @scala.inline
    def setPartSizeInBytes(value: long): Self = StObject.set(x, "PartSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartSizeInBytesUndefined: Self = StObject.set(x, "PartSizeInBytes", js.undefined)
    
    @scala.inline
    def setVaultARN(value: String): Self = StObject.set(x, "VaultARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultARNUndefined: Self = StObject.set(x, "VaultARN", js.undefined)
  }
}
