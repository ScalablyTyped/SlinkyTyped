package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceFile extends js.Object {
  /** A reference to an opaque binary blob file */
  var obbFile: js.UndefOr[ObbFile] = js.native
}

object DeviceFile {
  @scala.inline
  def apply(): DeviceFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceFile]
  }
  @scala.inline
  implicit class DeviceFileOps[Self <: DeviceFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObbFile(value: ObbFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obbFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObbFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obbFile")(js.undefined)
        ret
    }
  }
  
}

