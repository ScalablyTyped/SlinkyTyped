package typingsSlinky.antdMobileRn.alertContainerNativeMod

import slinky.core.TagMod
import typingsSlinky.antdMobileRn.modalPropsTypeMod.Action
import typingsSlinky.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertContainerProps extends js.Object {
  var actions: js.Array[Action[TextStyle]]
  var content: TagMod[Any]
  var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var title: TagMod[Any]
}

object AlertContainerProps {
  @scala.inline
  def apply(
    actions: js.Array[Action[TextStyle]],
    content: TagMod[Any] = null,
    onAnimationEnd: /* visible */ Boolean => Unit = null,
    title: TagMod[Any] = null
  ): AlertContainerProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertContainerProps]
  }
}

