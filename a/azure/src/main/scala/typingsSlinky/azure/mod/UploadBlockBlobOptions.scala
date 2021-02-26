package typingsSlinky.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadBlockBlobOptions extends UploadBlobOptions {
  
  var blockIdPrefix: js.UndefOr[String] = js.native
}
object UploadBlockBlobOptions {
  
  @scala.inline
  def apply(): UploadBlockBlobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadBlockBlobOptions]
  }
  
  @scala.inline
  implicit class UploadBlockBlobOptionsMutableBuilder[Self <: UploadBlockBlobOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockIdPrefix(value: String): Self = StObject.set(x, "blockIdPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockIdPrefixUndefined: Self = StObject.set(x, "blockIdPrefix", js.undefined)
  }
}
