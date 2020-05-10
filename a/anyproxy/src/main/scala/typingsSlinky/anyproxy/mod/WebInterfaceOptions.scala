package typingsSlinky.anyproxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebInterfaceOptions extends js.Object {
  /** If enable web interface, default to false */
  var enable: js.UndefOr[Boolean] = js.native
  /** Port number for web interface */
  var webPort: js.UndefOr[Double] = js.native
}

object WebInterfaceOptions {
  @scala.inline
  def apply(): WebInterfaceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebInterfaceOptions]
  }
  @scala.inline
  implicit class WebInterfaceOptionsOps[Self <: WebInterfaceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withWebPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPort")(js.undefined)
        ret
    }
  }
  
}

