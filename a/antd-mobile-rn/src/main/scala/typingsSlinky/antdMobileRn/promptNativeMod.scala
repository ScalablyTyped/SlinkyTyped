package typingsSlinky.antdMobileRn

import slinky.core.facade.ReactElement
import typingsSlinky.antdMobileRn.modalPropsTypeMod.CallbackOrActions
import typingsSlinky.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile-rn/lib/modal/prompt.native", JSImport.Namespace)
@js.native
object promptNativeMod extends js.Object {
  def default(title: ReactElement, message: ReactElement, callbackOrActions: CallbackOrActions[TextStyle]): Unit = js.native
  def default(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: js.UndefOr[scala.Nothing],
    defaultValue: js.UndefOr[scala.Nothing],
    placeholders: js.Array[String]
  ): Unit = js.native
  def default(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: js.UndefOr[scala.Nothing],
    defaultValue: String
  ): Unit = js.native
  def default(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: js.UndefOr[scala.Nothing],
    defaultValue: String,
    placeholders: js.Array[String]
  ): Unit = js.native
  def default(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: String
  ): Unit = js.native
  def default(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: String,
    defaultValue: js.UndefOr[scala.Nothing],
    placeholders: js.Array[String]
  ): Unit = js.native
  def default(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: String,
    defaultValue: String
  ): Unit = js.native
  def default(
    title: ReactElement,
    message: ReactElement,
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: String,
    defaultValue: String,
    placeholders: js.Array[String]
  ): Unit = js.native
}

