package typingsSlinky.grommet.keyboardMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.grommet.grommetStrings.component
import typingsSlinky.grommet.grommetStrings.document
import typingsSlinky.grommet.utilsMod.KeyboardType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardProps extends js.Object {
  var onBackspace: js.UndefOr[KeyboardType] = js.native
  var onComma: js.UndefOr[KeyboardType] = js.native
  var onDown: js.UndefOr[KeyboardType] = js.native
  var onEnter: js.UndefOr[KeyboardType] = js.native
  var onEsc: js.UndefOr[KeyboardType] = js.native
  var onKeyDown: js.UndefOr[KeyboardType] = js.native
  var onLeft: js.UndefOr[KeyboardType] = js.native
  var onRight: js.UndefOr[KeyboardType] = js.native
  var onShift: js.UndefOr[KeyboardType] = js.native
  var onSpace: js.UndefOr[KeyboardType] = js.native
  var onTab: js.UndefOr[KeyboardType] = js.native
  var onUp: js.UndefOr[KeyboardType] = js.native
  var target: js.UndefOr[component | document] = js.native
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
    def withOnBackspace(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackspace")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBackspace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackspace")(js.undefined)
        ret
    }
    @scala.inline
    def withOnComma(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComma")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnComma: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComma")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDown(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnter(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEsc(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEsc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEsc")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLeft(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRight(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRight")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShift(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShift")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShift")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSpace(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSpace")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTab(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTab")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTab")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUp(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUp")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: component | document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

