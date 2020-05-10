package typingsSlinky.nodeHueApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCheckforupdate extends js.Object {
  var checkforupdate: Boolean = js.native
  var devicetypes: AnonBridge = js.native
  @JSName("notify")
  var notify_FAnonCheckforupdate: Boolean = js.native
  var text: String = js.native
  var updatestate: Double = js.native
  var url: String = js.native
}

object AnonCheckforupdate {
  @scala.inline
  def apply(
    checkforupdate: Boolean,
    devicetypes: AnonBridge,
    notify: Boolean,
    text: String,
    updatestate: Double,
    url: String
  ): AnonCheckforupdate = {
    val __obj = js.Dynamic.literal(checkforupdate = checkforupdate.asInstanceOf[js.Any], devicetypes = devicetypes.asInstanceOf[js.Any], notify = notify.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], updatestate = updatestate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCheckforupdate]
  }
  @scala.inline
  implicit class AnonCheckforupdateOps[Self <: AnonCheckforupdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckforupdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkforupdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevicetypes(value: AnonBridge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicetypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatestate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatestate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

