package typingsSlinky.grommet.anon

import typingsSlinky.grommet.baseMod.ExtendType
import typingsSlinky.grommet.utilsMod.BackgroundType
import typingsSlinky.grommet.utilsMod.ColorType
import typingsSlinky.grommet.utilsMod.MarginType
import typingsSlinky.grommet.utilsMod.PadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Margin extends js.Object {
  var active: js.UndefOr[BackgroundBackgroundType] = js.native
  var background: js.UndefOr[BackgroundType] = js.native
  var border: js.UndefOr[Hover] = js.native
  var color: js.UndefOr[ColorType] = js.native
  var extend: js.UndefOr[ExtendType] = js.native
  var hover: js.UndefOr[BackgroundColorExtend] = js.native
  var margin: js.UndefOr[MarginType] = js.native
  var pad: js.UndefOr[PadType] = js.native
}

object Margin {
  @scala.inline
  def apply(): Margin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Margin]
  }
  @scala.inline
  implicit class MarginOps[Self <: Margin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: BackgroundBackgroundType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: BackgroundType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: Hover): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: ColorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendFunction1(value: /* args */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExtend(value: ExtendType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.undefined)
        ret
    }
    @scala.inline
    def withHover(value: BackgroundColorExtend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: MarginType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withPad(value: PadType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pad")(js.undefined)
        ret
    }
  }
  
}

