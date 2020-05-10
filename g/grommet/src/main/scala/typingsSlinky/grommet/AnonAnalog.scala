package typingsSlinky.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnalog extends js.Object {
  var analog: js.UndefOr[AnonHour] = js.native
  var digital: js.UndefOr[AnonText] = js.native
}

object AnonAnalog {
  @scala.inline
  def apply(): AnonAnalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAnalog]
  }
  @scala.inline
  implicit class AnonAnalogOps[Self <: AnonAnalog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalog(value: AnonHour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analog")(js.undefined)
        ret
    }
    @scala.inline
    def withDigital(value: AnonText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digital")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigital: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digital")(js.undefined)
        ret
    }
  }
  
}

