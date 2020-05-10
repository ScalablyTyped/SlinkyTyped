package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON request template for moving ChromeOs Device to given OU in Directory
  * Devices API.
  */
@js.native
trait SchemaChromeOsMoveDevicesToOu extends js.Object {
  /**
    * ChromeOs Devices to be moved to OU
    */
  var deviceIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaChromeOsMoveDevicesToOu {
  @scala.inline
  def apply(): SchemaChromeOsMoveDevicesToOu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChromeOsMoveDevicesToOu]
  }
  @scala.inline
  implicit class SchemaChromeOsMoveDevicesToOuOps[Self <: SchemaChromeOsMoveDevicesToOu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceIds")(js.undefined)
        ret
    }
  }
  
}

