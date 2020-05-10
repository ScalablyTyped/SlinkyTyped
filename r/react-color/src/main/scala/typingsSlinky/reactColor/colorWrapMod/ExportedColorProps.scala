package typingsSlinky.reactColor.colorWrapMod

import typingsSlinky.reactColor.mod.Color
import typingsSlinky.reactColor.mod.ColorChangeHandler
import typingsSlinky.reactColor.mod.ColorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportedColorProps extends js.Object {
  var color: js.UndefOr[Color] = js.native
  var onChange: js.UndefOr[ColorChangeHandler] = js.native
  var onChangeComplete: js.UndefOr[ColorChangeHandler] = js.native
}

object ExportedColorProps {
  @scala.inline
  def apply(): ExportedColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportedColorProps]
  }
  @scala.inline
  implicit class ExportedColorPropsOps[Self <: ExportedColorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Color): Self = {
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
    def withOnChange(value: /* color */ ColorResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChangeComplete(value: /* color */ ColorResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChangeComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeComplete")(js.undefined)
        ret
    }
  }
  
}

