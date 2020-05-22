package typingsSlinky.antDesignReactNative.promptContainerMod

import slinky.core.TagMod
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`login-password`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`secure-text`
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.antDesignReactNative.modalPropsTypeMod.CallbackOnBackHandler
import typingsSlinky.antDesignReactNative.modalPropsTypeMod.CallbackOrActions
import typingsSlinky.antDesignReactNative.stylePromptMod.PromptStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropmptContainerProps extends WithThemeStyles[PromptStyle] {
  var actions: CallbackOrActions[TextStyle]
  var defaultValue: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[TagMod[Any]] = js.undefined
  var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var onBackHandler: js.UndefOr[CallbackOnBackHandler] = js.undefined
  var placeholders: js.UndefOr[js.Array[String]] = js.undefined
  var title: TagMod[Any]
  var `type`: js.UndefOr[
    typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.default | `login-password` | `secure-text`
  ] = js.undefined
}

object PropmptContainerProps {
  @scala.inline
  def apply(
    actions: CallbackOrActions[TextStyle],
    defaultValue: String = null,
    message: TagMod[Any] = null,
    onAnimationEnd: /* visible */ Boolean => Unit = null,
    onBackHandler: () => Boolean = null,
    placeholders: js.Array[String] = null,
    styles: Partial[PromptStyle] = null,
    title: TagMod[Any] = null,
    `type`: typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.default | `login-password` | `secure-text` = null
  ): PropmptContainerProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onBackHandler != null) __obj.updateDynamic("onBackHandler")(js.Any.fromFunction0(onBackHandler))
    if (placeholders != null) __obj.updateDynamic("placeholders")(placeholders.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropmptContainerProps]
  }
}

