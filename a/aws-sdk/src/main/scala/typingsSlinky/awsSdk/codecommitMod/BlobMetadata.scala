package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlobMetadata extends StObject {
  
  /**
    * The full ID of the blob.
    */
  var blobId: js.UndefOr[ObjectId] = js.native
  
  /**
    * The file mode permissions of the blob. File mode permission codes include:    100644 indicates read/write    100755 indicates read/write/execute    160000 indicates a submodule    120000 indicates a symlink  
    */
  var mode: js.UndefOr[Mode] = js.native
  
  /**
    * The path to the blob and associated file name, if any.
    */
  var path: js.UndefOr[Path] = js.native
}
object BlobMetadata {
  
  @scala.inline
  def apply(): BlobMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlobMetadata]
  }
  
  @scala.inline
  implicit class BlobMetadataMutableBuilder[Self <: BlobMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlobId(value: ObjectId): Self = StObject.set(x, "blobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobIdUndefined: Self = StObject.set(x, "blobId", js.undefined)
    
    @scala.inline
    def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
