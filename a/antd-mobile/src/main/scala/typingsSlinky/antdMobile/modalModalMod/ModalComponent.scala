package typingsSlinky.antdMobile.modalModalMod

import slinky.core.facade.ReactElement
import typingsSlinky.antdMobile.anon.Close
import typingsSlinky.antdMobile.antdMobileStrings.`login-password`
import typingsSlinky.antdMobile.antdMobileStrings.`secure-text`
import typingsSlinky.antdMobile.modalPropsTypeMod.Action
import typingsSlinky.antdMobile.modalPropsTypeMod.CallbackOrActions
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile/lib/modal/Modal", "ModalComponent")
@js.native
abstract class ModalComponent[P, S] ()
  extends Component[P, S, js.Any]
/* static members */
@JSImport("antd-mobile/lib/modal/Modal", "ModalComponent")
@js.native
object ModalComponent extends js.Object {
  
  def alert(title: ReactElement, message: ReactElement): Close = js.native
  def alert(title: ReactElement, message: ReactElement, actions: js.UndefOr[scala.Nothing], platform: String): Close = js.native
  def alert(title: ReactElement, message: ReactElement, actions: js.Array[Action[CSSProperties]]): Close = js.native
  def alert(
    title: ReactElement,
    message: ReactElement,
    actions: js.Array[Action[CSSProperties]],
    platform: String
  ): Close = js.native
  
  def operation(): Close = js.native
  def operation(actions: js.UndefOr[scala.Nothing], platform: String): Close = js.native
  def operation(actions: js.Array[Action[CSSProperties]]): Close = js.native
  def operation(actions: js.Array[Action[CSSProperties]], platform: String): Close = js.native
  
  def prompt(title: ReactElement, message: ReactElement, callbackOrActions: CallbackOrActions[CSSProperties]): Close = js.native
  def prompt(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: js.UndefOr[scala.Nothing],
    defaultValue: js.UndefOr[scala.Nothing],
    placeholders: js.UndefOr[scala.Nothing],
    platform: String
  ): Close = js.native
  def prompt(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: js.UndefOr[scala.Nothing],
    defaultValue: js.UndefOr[scala.Nothing],
    placeholders: js.Array[String]
  ): Close = js.native
  def prompt(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: js.UndefOr[scala.Nothing],
    defaultValue: js.UndefOr[scala.Nothing],
    placeholders: js.Array[String],
    platform: String
  ): Close = js.native
  def prompt(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: js.UndefOr[scala.Nothing],
    defaultValue: String
  ): Close = js.native
  def prompt(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: js.UndefOr[scala.Nothing],
    defaultValue: String,
    placeholders: js.UndefOr[scala.Nothing],
    platform: String
  ): Close = js.native
  def prompt(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: js.UndefOr[scala.Nothing],
    defaultValue: String,
    placeholders: js.Array[String]
  ): Close = js.native
  def prompt(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: js.UndefOr[scala.Nothing],
    defaultValue: String,
    placeholders: js.Array[String],
    platform: String
  ): Close = js.native
  @JSName("prompt")
  def prompt_default(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: typingsSlinky.antdMobile.antdMobileStrings.default
  ): Close = js.native
  @JSName("prompt")
  def prompt_default(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: typingsSlinky.antdMobile.antdMobileStrings.default,
    defaultValue: js.UndefOr[scala.Nothing],
    placeholders: js.UndefOr[scala.Nothing],
    platform: String
  ): Close = js.native
  @JSName("prompt")
  def prompt_default(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: typingsSlinky.antdMobile.antdMobileStrings.default,
    defaultValue: js.UndefOr[scala.Nothing],
    placeholders: js.Array[String]
  ): Close = js.native
  @JSName("prompt")
  def prompt_default(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: typingsSlinky.antdMobile.antdMobileStrings.default,
    defaultValue: js.UndefOr[scala.Nothing],
    placeholders: js.Array[String],
    platform: String
  ): Close = js.native
  @JSName("prompt")
  def prompt_default(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: typingsSlinky.antdMobile.antdMobileStrings.default,
    defaultValue: String
  ): Close = js.native
  @JSName("prompt")
  def prompt_default(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: typingsSlinky.antdMobile.antdMobileStrings.default,
    defaultValue: String,
    placeholders: js.UndefOr[scala.Nothing],
    platform: String
  ): Close = js.native
  @JSName("prompt")
  def prompt_default(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: typingsSlinky.antdMobile.antdMobileStrings.default,
    defaultValue: String,
    placeholders: js.Array[String]
  ): Close = js.native
  @JSName("prompt")
  def prompt_default(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: typingsSlinky.antdMobile.antdMobileStrings.default,
    defaultValue: String,
    placeholders: js.Array[String],
    platform: String
  ): Close = js.native
  @JSName("prompt")
  def prompt_loginpassword(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `login-password`
  ): Close = js.native
  @JSName("prompt")
  def prompt_loginpassword(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `login-password`,
    defaultValue: js.UndefOr[scala.Nothing],
    placeholders: js.UndefOr[scala.Nothing],
    platform: String
  ): Close = js.native
  @JSName("prompt")
  def prompt_loginpassword(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `login-password`,
    defaultValue: js.UndefOr[scala.Nothing],
    placeholders: js.Array[String]
  ): Close = js.native
  @JSName("prompt")
  def prompt_loginpassword(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `login-password`,
    defaultValue: js.UndefOr[scala.Nothing],
    placeholders: js.Array[String],
    platform: String
  ): Close = js.native
  @JSName("prompt")
  def prompt_loginpassword(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `login-password`,
    defaultValue: String
  ): Close = js.native
  @JSName("prompt")
  def prompt_loginpassword(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `login-password`,
    defaultValue: String,
    placeholders: js.UndefOr[scala.Nothing],
    platform: String
  ): Close = js.native
  @JSName("prompt")
  def prompt_loginpassword(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `login-password`,
    defaultValue: String,
    placeholders: js.Array[String]
  ): Close = js.native
  @JSName("prompt")
  def prompt_loginpassword(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `login-password`,
    defaultValue: String,
    placeholders: js.Array[String],
    platform: String
  ): Close = js.native
  @JSName("prompt")
  def prompt_securetext(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `secure-text`
  ): Close = js.native
  @JSName("prompt")
  def prompt_securetext(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `secure-text`,
    defaultValue: js.UndefOr[scala.Nothing],
    placeholders: js.UndefOr[scala.Nothing],
    platform: String
  ): Close = js.native
  @JSName("prompt")
  def prompt_securetext(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `secure-text`,
    defaultValue: js.UndefOr[scala.Nothing],
    placeholders: js.Array[String]
  ): Close = js.native
  @JSName("prompt")
  def prompt_securetext(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `secure-text`,
    defaultValue: js.UndefOr[scala.Nothing],
    placeholders: js.Array[String],
    platform: String
  ): Close = js.native
  @JSName("prompt")
  def prompt_securetext(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `secure-text`,
    defaultValue: String
  ): Close = js.native
  @JSName("prompt")
  def prompt_securetext(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `secure-text`,
    defaultValue: String,
    placeholders: js.UndefOr[scala.Nothing],
    platform: String
  ): Close = js.native
  @JSName("prompt")
  def prompt_securetext(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `secure-text`,
    defaultValue: String,
    placeholders: js.Array[String]
  ): Close = js.native
  @JSName("prompt")
  def prompt_securetext(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `secure-text`,
    defaultValue: String,
    placeholders: js.Array[String],
    platform: String
  ): Close = js.native
}
