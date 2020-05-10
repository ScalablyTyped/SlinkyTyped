package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObbFile extends js.Object {
  /**
    * Opaque Binary Blob (OBB) file(s) to install on the device
    * Required
    */
  var obb: js.UndefOr[FileReference] = js.native
  /**
    * OBB file name which must conform to the format as specified by
    * Android
    * e.g. [main|patch].0300110.com.example.android.obb
    * which will be installed into
    * <shared-storage>/Android/obb/<package-name>/
    * on the device
    * Required
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
  implicit class ObbFileOps[Self <: ObbFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObb(value: FileReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obb")(js.undefined)
        ret
    }
    @scala.inline
    def withObbFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obbFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObbFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obbFileName")(js.undefined)
        ret
    }
  }
  
}

