package typingsSlinky.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObbFile extends StObject {
  
  /** Required. Opaque Binary Blob (OBB) file(s) to install on the device. */
  var obb: js.UndefOr[FileReference] = js.native
  
  /**
    * Required. OBB file name which must conform to the format as specified by Android e.g. [main|patch].0300110.com.example.android.obb which will be installed into \/Android/obb/\/ on
    * the device.
    */
  var obbFileName: js.UndefOr[String] = js.native
}
object ObbFile {
  
  @scala.inline
  def apply(): ObbFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObbFile]
  }
  
  @scala.inline
  implicit class ObbFileMutableBuilder[Self <: ObbFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObb(value: FileReference): Self = StObject.set(x, "obb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObbFileName(value: String): Self = StObject.set(x, "obbFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObbFileNameUndefined: Self = StObject.set(x, "obbFileName", js.undefined)
    
    @scala.inline
    def setObbUndefined: Self = StObject.set(x, "obb", js.undefined)
  }
}
