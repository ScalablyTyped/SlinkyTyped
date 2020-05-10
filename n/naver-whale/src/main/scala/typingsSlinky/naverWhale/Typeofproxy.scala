package typingsSlinky.naverWhale

import typingsSlinky.chrome.chrome.proxy.ProxyErrorEvent
import typingsSlinky.chrome.chrome.types.ChromeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofproxy extends js.Object {
  var onProxyError: ProxyErrorEvent = js.native
  var settings: ChromeSetting = js.native
}

object Typeofproxy {
  @scala.inline
  def apply(onProxyError: ProxyErrorEvent, settings: ChromeSetting): Typeofproxy = {
    val __obj = js.Dynamic.literal(onProxyError = onProxyError.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofproxy]
  }
  @scala.inline
  implicit class TypeofproxyOps[Self <: Typeofproxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnProxyError(value: ProxyErrorEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProxyError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettings(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

