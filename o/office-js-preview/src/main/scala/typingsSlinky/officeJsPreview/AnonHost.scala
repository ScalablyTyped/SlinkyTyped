package typingsSlinky.officeJsPreview

import typingsSlinky.officeJsPreview.Office.HostType
import typingsSlinky.officeJsPreview.Office.PlatformType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHost extends js.Object {
  var host: HostType = js.native
  var platform: PlatformType = js.native
}

object AnonHost {
  @scala.inline
  def apply(host: HostType, platform: PlatformType): AnonHost = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHost]
  }
  @scala.inline
  implicit class AnonHostOps[Self <: AnonHost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: HostType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: PlatformType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

