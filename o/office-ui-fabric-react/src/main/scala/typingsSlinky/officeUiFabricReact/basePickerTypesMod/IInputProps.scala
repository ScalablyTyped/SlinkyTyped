package typingsSlinky.officeUiFabricReact.basePickerTypesMod

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.mod.InputHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInputProps extends InputHTMLAttributes[HTMLInputElement] {
  /**
    * The default value to be visible when the autofill first created.
    * This is different than placeholder text because the placeholder text will disappear and re-appear. This
    * text persists until deleted or changed.
    */
  var defaultVisibleValue: js.UndefOr[String] = js.native
}

object IInputProps {
  @scala.inline
  def apply(): IInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInputProps]
  }
  @scala.inline
  implicit class IInputPropsOps[Self <: IInputProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultVisibleValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVisibleValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultVisibleValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVisibleValue")(js.undefined)
        ret
    }
  }
  
}

