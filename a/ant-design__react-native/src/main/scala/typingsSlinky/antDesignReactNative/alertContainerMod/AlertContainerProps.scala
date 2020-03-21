package typingsSlinky.antDesignReactNative.alertContainerMod

import slinky.core.TagMod
import typingsSlinky.antDesignReactNative.modalPropsTypeMod.Action
import typingsSlinky.antDesignReactNative.modalPropsTypeMod.CallbackOnBackHandler
import typingsSlinky.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertContainerProps extends js.Object {
  var actions: js.Array[Action[TextStyle]]
  var content: TagMod[Any]
  var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var onBackHandler: js.UndefOr[CallbackOnBackHandler] = js.undefined
  var title: TagMod[Any]
}

object AlertContainerProps {
  @scala.inline
  def apply(
    actions: js.Array[Action[TextStyle]],
    content: TagMod[Any],
    title: TagMod[Any],
    onAnimationEnd: /* visible */ Boolean => Unit = null,
    onBackHandler: () => Boolean = null
  ): AlertContainerProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onBackHandler != null) __obj.updateDynamic("onBackHandler")(js.Any.fromFunction0(onBackHandler))
    __obj.asInstanceOf[AlertContainerProps]
  }
}

