package typingsSlinky.grommet.anon

import typingsSlinky.grommet.baseMod.ExtendType
import typingsSlinky.grommet.utilsMod.BackgroundType
import typingsSlinky.grommet.utilsMod.PadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderExtend extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.native
  var border: js.UndefOr[String | ColorSideSize] = js.native
  var extend: js.UndefOr[ExtendType] = js.native
  var pad: js.UndefOr[PadType] = js.native
}

object BorderExtend {
  @scala.inline
  def apply(): BorderExtend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderExtend]
  }
  @scala.inline
  implicit class BorderExtendOps[Self <: BorderExtend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBorder(value: String | ColorSideSize): Self = {
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

