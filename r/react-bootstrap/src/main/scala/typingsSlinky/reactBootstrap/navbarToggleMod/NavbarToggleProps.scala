package typingsSlinky.reactBootstrap.navbarToggleMod

import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarToggleProps
  extends AllHTMLAttributes[NavbarToggle]
     with ClassAttributes[NavbarToggle] {
  @JSName("onClick")
  var onClick_NavbarToggleProps: js.UndefOr[MouseEventHandler[_]] = js.undefined
}

object NavbarToggleProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[NavbarToggle] = null,
    ClassAttributes: ClassAttributes[NavbarToggle] = null,
    onClick: SyntheticMouseEvent[_] => Unit = null
  ): NavbarToggleProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[NavbarToggleProps]
  }
}

