package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PowerRex extends js.Object {
  @JSName("PowerPoint.PowerRex_typekey")
  var PowerPointDotPowerRex_typekey: PowerRex = js.native
  def OnAsfEncoderEvent(erorCode: js.Any, bstrErrorDesc: js.Any): Unit = js.native
}

object PowerRex {
  @scala.inline
  def apply(OnAsfEncoderEvent: (js.Any, js.Any) => Unit, PowerPointDotPowerRex_typekey: PowerRex): PowerRex = {
    val __obj = js.Dynamic.literal(OnAsfEncoderEvent = js.Any.fromFunction2(OnAsfEncoderEvent))
    __obj.updateDynamic("PowerPoint.PowerRex_typekey")(PowerPointDotPowerRex_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PowerRex]
  }
  @scala.inline
  implicit class PowerRexOps[Self <: PowerRex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnAsfEncoderEvent(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnAsfEncoderEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPowerPointDotPowerRex_typekey(value: PowerRex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.PowerRex_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

