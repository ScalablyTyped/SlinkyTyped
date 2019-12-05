package typingsSlinky.antdDashMobile.libModalModalMod

import slinky.core.TagMod
import typingsSlinky.antdDashMobile.Anon_Close
import typingsSlinky.antdDashMobile.antdDashMobileStrings.`login-password`
import typingsSlinky.antdDashMobile.antdDashMobileStrings.`secure-text`
import typingsSlinky.antdDashMobile.libModalPropsTypeMod.Action
import typingsSlinky.antdDashMobile.libModalPropsTypeMod.CallbackOrActions
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/lib/modal/Modal", "ModalComponent")
@js.native
abstract class ModalComponent[P, S] ()
  extends Component[P, S, js.Any]

/* static members */
@JSImport("antd-mobile/lib/modal/Modal", "ModalComponent")
@js.native
object ModalComponent extends js.Object {
  def alert(title: TagMod[Any], message: TagMod[Any]): Anon_Close = js.native
  def alert(title: TagMod[Any], message: TagMod[Any], actions: js.Array[Action[CSSProperties]]): Anon_Close = js.native
  def alert(
    title: TagMod[Any],
    message: TagMod[Any],
    actions: js.Array[Action[CSSProperties]],
    platform: String
  ): Anon_Close = js.native
  def operation(): Anon_Close = js.native
  def operation(actions: js.Array[Action[CSSProperties]]): Anon_Close = js.native
  def operation(actions: js.Array[Action[CSSProperties]], platform: String): Anon_Close = js.native
  def prompt(title: TagMod[Any], message: TagMod[Any], callbackOrActions: CallbackOrActions[CSSProperties]): Anon_Close = js.native
  @JSName("prompt")
  def prompt_default(
    title: TagMod[Any],
    message: TagMod[Any],
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: typingsSlinky.antdDashMobile.antdDashMobileStrings.default
  ): Anon_Close = js.native
  @JSName("prompt")
  def prompt_default(
    title: TagMod[Any],
    message: TagMod[Any],
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: typingsSlinky.antdDashMobile.antdDashMobileStrings.default,
    defaultValue: String
  ): Anon_Close = js.native
  @JSName("prompt")
  def prompt_default(
    title: TagMod[Any],
    message: TagMod[Any],
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: typingsSlinky.antdDashMobile.antdDashMobileStrings.default,
    defaultValue: String,
    placeholders: js.Array[String]
  ): Anon_Close = js.native
  @JSName("prompt")
  def prompt_default(
    title: TagMod[Any],
    message: TagMod[Any],
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: typingsSlinky.antdDashMobile.antdDashMobileStrings.default,
    defaultValue: String,
    placeholders: js.Array[String],
    platform: String
  ): Anon_Close = js.native
  @JSName("prompt")
  def prompt_loginpassword(
    title: TagMod[Any],
    message: TagMod[Any],
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `login-password`
  ): Anon_Close = js.native
  @JSName("prompt")
  def prompt_loginpassword(
    title: TagMod[Any],
    message: TagMod[Any],
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `login-password`,
    defaultValue: String
  ): Anon_Close = js.native
  @JSName("prompt")
  def prompt_loginpassword(
    title: TagMod[Any],
    message: TagMod[Any],
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `login-password`,
    defaultValue: String,
    placeholders: js.Array[String]
  ): Anon_Close = js.native
  @JSName("prompt")
  def prompt_loginpassword(
    title: TagMod[Any],
    message: TagMod[Any],
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `login-password`,
    defaultValue: String,
    placeholders: js.Array[String],
    platform: String
  ): Anon_Close = js.native
  @JSName("prompt")
  def prompt_securetext(
    title: TagMod[Any],
    message: TagMod[Any],
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `secure-text`
  ): Anon_Close = js.native
  @JSName("prompt")
  def prompt_securetext(
    title: TagMod[Any],
    message: TagMod[Any],
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `secure-text`,
    defaultValue: String
  ): Anon_Close = js.native
  @JSName("prompt")
  def prompt_securetext(
    title: TagMod[Any],
    message: TagMod[Any],
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `secure-text`,
    defaultValue: String,
    placeholders: js.Array[String]
  ): Anon_Close = js.native
  @JSName("prompt")
  def prompt_securetext(
    title: TagMod[Any],
    message: TagMod[Any],
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `secure-text`,
    defaultValue: String,
    placeholders: js.Array[String],
    platform: String
  ): Anon_Close = js.native
}

