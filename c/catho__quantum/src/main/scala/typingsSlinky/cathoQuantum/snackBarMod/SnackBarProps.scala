package typingsSlinky.cathoQuantum.snackBarMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.cathoQuantum.anon.BaseFontSizeBreakpoints
import typingsSlinky.cathoQuantum.anon.CallbackFn
import typingsSlinky.cathoQuantum.cathoQuantumStrings.error
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.success
import typingsSlinky.cathoQuantum.cathoQuantumStrings.warning
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnackBarProps extends js.Object {
  var actionTrigger: js.UndefOr[CallbackFn] = js.native
  var closeButtonAriaLabel: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var inverted: js.UndefOr[Boolean] = js.native
  var onClose: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var secondsToClose: js.UndefOr[Double] = js.native
  var skin: js.UndefOr[primary | success | error | neutral | warning] = js.native
  var text: js.UndefOr[String] = js.native
  var theme: js.UndefOr[BaseFontSizeBreakpoints] = js.native
}

object SnackBarProps {
  @scala.inline
  def apply(): SnackBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnackBarProps]
  }
  @scala.inline
  implicit class SnackBarPropsOps[Self <: SnackBarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionTrigger(value: CallbackFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionTrigger")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseButtonAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButtonAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseButtonAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButtonAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInverted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInverted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondsToClose(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondsToClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondsToClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondsToClose")(js.undefined)
        ret
    }
    @scala.inline
    def withSkin(value: primary | success | error | neutral | warning): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skin")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: BaseFontSizeBreakpoints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

