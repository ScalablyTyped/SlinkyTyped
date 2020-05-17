package typingsSlinky.reactVirtualKeyboard.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardProps extends js.Object {
  var callbackParent: js.UndefOr[kbEvents] = js.native
  var name: js.UndefOr[String] = js.native
  var onAccepted: js.UndefOr[kbEvents] = js.native
  var onChange: js.UndefOr[kbEvents] = js.native
  var options: js.UndefOr[ReactKeyboardOptions] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
}

object KeyboardProps {
  @scala.inline
  def apply(): KeyboardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardProps]
  }
  @scala.inline
  implicit class KeyboardPropsOps[Self <: KeyboardProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallbackParent(
      value: (/* event */ js.UndefOr[String | Event], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackParent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCallbackParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackParent")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAccepted(
      value: (/* event */ js.UndefOr[String | Event], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccepted")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnAccepted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccepted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(
      value: (/* event */ js.UndefOr[String | Event], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: ReactKeyboardOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

