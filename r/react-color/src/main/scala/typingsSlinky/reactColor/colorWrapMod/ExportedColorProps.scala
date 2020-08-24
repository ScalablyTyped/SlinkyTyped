package typingsSlinky.reactColor.colorWrapMod

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.mod.ChangeEvent
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setOnChange(value: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnChangeComplete(value: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): Self = this.set("onChangeComplete", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChangeComplete: Self = this.set("onChangeComplete", js.undefined)
  }
  
}

