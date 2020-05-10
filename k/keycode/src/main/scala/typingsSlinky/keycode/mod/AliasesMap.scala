package typingsSlinky.keycode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasesMap extends js.Object {
  @JSName("\u2325")
  var Optionkey: Double = js.native
  @JSName("\u2318")
  var Placeofinterestsign: Double = js.native
  @JSName("\u2303")
  var Uparrowhead: Double = js.native
  @JSName("\u21E7")
  var Upwardswhitearrow: Double = js.native
  var break: Double = js.native
  var caps: Double = js.native
  var cmd: Double = js.native
  var control: Double = js.native
  var ctl: Double = js.native
  var del: Double = js.native
  var escape: Double = js.native
  var ins: Double = js.native
  var option: Double = js.native
  var pause: Double = js.native
  var pgdn: Double = js.native
  var pgup: Double = js.native
  var `return`: Double = js.native
  var spacebar: Double = js.native
  var spc: Double = js.native
  var windows: Double = js.native
}

object AliasesMap {
  @scala.inline
  def apply(
    Optionkey: Double,
    Placeofinterestsign: Double,
    Uparrowhead: Double,
    Upwardswhitearrow: Double,
    break: Double,
    caps: Double,
    cmd: Double,
    control: Double,
    ctl: Double,
    del: Double,
    escape: Double,
    ins: Double,
    option: Double,
    pause: Double,
    pgdn: Double,
    pgup: Double,
    `return`: Double,
    spacebar: Double,
    spc: Double,
    windows: Double
  ): AliasesMap = {
    val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], caps = caps.asInstanceOf[js.Any], cmd = cmd.asInstanceOf[js.Any], control = control.asInstanceOf[js.Any], ctl = ctl.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], escape = escape.asInstanceOf[js.Any], ins = ins.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], pgdn = pgdn.asInstanceOf[js.Any], pgup = pgup.asInstanceOf[js.Any], spacebar = spacebar.asInstanceOf[js.Any], spc = spc.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
    __obj.updateDynamic("\u2325")(Optionkey.asInstanceOf[js.Any])
    __obj.updateDynamic("\u2318")(Placeofinterestsign.asInstanceOf[js.Any])
    __obj.updateDynamic("\u2303")(Uparrowhead.asInstanceOf[js.Any])
    __obj.updateDynamic("\u21E7")(Upwardswhitearrow.asInstanceOf[js.Any])
    __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasesMap]
  }
  @scala.inline
  implicit class AliasesMapOps[Self <: AliasesMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptionkey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("\u2325")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceofinterestsign(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("\u2318")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUparrowhead(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("\u2303")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpwardswhitearrow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("\u21E7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBreak(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("break")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCmd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("del")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEscape(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOption(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPause(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPgdn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pgdn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPgup(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pgup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpacebar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacebar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

