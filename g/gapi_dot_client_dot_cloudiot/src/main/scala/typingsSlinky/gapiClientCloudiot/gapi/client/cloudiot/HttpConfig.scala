package typingsSlinky.gapiClientCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpConfig extends js.Object {
  /**
    * If enabled, allows devices to use DeviceService via the HTTP protocol.
    * Otherwise, any requests to DeviceService will fail for this registry.
    */
  var httpEnabledState: js.UndefOr[String] = js.native
}

object HttpConfig {
  @scala.inline
  def apply(): HttpConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpConfig]
  }
  @scala.inline
  implicit class HttpConfigOps[Self <: HttpConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpEnabledState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpEnabledState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpEnabledState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpEnabledState")(js.undefined)
        ret
    }
  }
  
}

