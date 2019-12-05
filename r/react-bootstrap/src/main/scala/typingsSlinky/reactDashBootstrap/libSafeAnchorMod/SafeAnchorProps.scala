package typingsSlinky.reactDashBootstrap.libSafeAnchorMod

import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.reactMod.AllHTMLAttributes
import typingsSlinky.react.reactMod.ClassAttributes
import typingsSlinky.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafeAnchorProps
  extends AllHTMLAttributes[SafeAnchor]
     with ClassAttributes[SafeAnchor] {
  var componentClass: js.UndefOr[ReactComponentClass[_]] = js.undefined
  @JSName("onClick")
  var onClick_SafeAnchorProps: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
}

object SafeAnchorProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[SafeAnchor] = null,
    ClassAttributes: ClassAttributes[SafeAnchor] = null,
    componentClass: ReactComponentClass[_] = null,
    onClick: SyntheticMouseEvent[js.Object] => Unit = null
  ): SafeAnchorProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[SafeAnchorProps]
  }
}

