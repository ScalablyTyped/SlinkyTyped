package typingsSlinky.appBuilderLib.yarnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DesktopFrameworkInfo extends js.Object {
  var useCustomDist: Boolean = js.native
  var version: String = js.native
}

object DesktopFrameworkInfo {
  @scala.inline
  def apply(useCustomDist: Boolean, version: String): DesktopFrameworkInfo = {
    val __obj = js.Dynamic.literal(useCustomDist = useCustomDist.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesktopFrameworkInfo]
  }
  @scala.inline
  implicit class DesktopFrameworkInfoOps[Self <: DesktopFrameworkInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseCustomDist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCustomDist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

