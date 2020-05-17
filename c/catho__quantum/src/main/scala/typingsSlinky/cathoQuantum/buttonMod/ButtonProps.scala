package typingsSlinky.cathoQuantum.buttonMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.cathoQuantum.anon.Breakpoints
import typingsSlinky.cathoQuantum.cathoQuantumStrings.button
import typingsSlinky.cathoQuantum.cathoQuantumStrings.error
import typingsSlinky.cathoQuantum.cathoQuantumStrings.large
import typingsSlinky.cathoQuantum.cathoQuantumStrings.medium
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.reset
import typingsSlinky.cathoQuantum.cathoQuantumStrings.secondary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.small
import typingsSlinky.cathoQuantum.cathoQuantumStrings.submit
import typingsSlinky.cathoQuantum.cathoQuantumStrings.success
import typingsSlinky.cathoQuantum.cathoQuantumStrings.warning
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xlarge
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xsmall
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonProps extends js.Object {
  @JSName("$as")
  var $as: js.UndefOr[ReactElement | String] = js.native
  var center: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[js.Array[TagMod[Any]] | TagMod[Any]] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var full: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var size: js.UndefOr[xsmall | small | medium | large | xlarge] = js.native
  var skin: js.UndefOr[neutral | primary | secondary | success | warning | error] = js.native
  var stroked: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[Breakpoints] = js.native
  var `type`: js.UndefOr[button | reset | submit] = js.native
}

object ButtonProps {
  @scala.inline
  def apply(): ButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProps]
  }
  @scala.inline
  implicit class ButtonPropsOps[Self <: ButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$asReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$as(value: ReactElement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$as: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$as")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[TagMod[Any]] | TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
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
    def withOnClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: xsmall | small | medium | large | xlarge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSkin(value: neutral | primary | secondary | success | warning | error): Self = {
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
    def withStroked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroked")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: Breakpoints): Self = {
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
    @scala.inline
    def withType(value: button | reset | submit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

