package typingsSlinky.antdMobile

import slinky.core.TagMod
import typingsSlinky.antdMobile.anon.Close
import typingsSlinky.antdMobile.modalPropsTypeMod.CallbackOrActions
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/lib/modal/prompt", JSImport.Namespace)
@js.native
object promptMod extends js.Object {
  def default(title: TagMod[Any], message: TagMod[Any], callbackOrActions: CallbackOrActions[CSSProperties]): Close = js.native
  def default(
    title: TagMod[Any],
    message: TagMod[Any],
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: String
  ): Close = js.native
  def default(
    title: TagMod[Any],
    message: TagMod[Any],
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: String,
    defaultValue: String
  ): Close = js.native
  def default(
    title: TagMod[Any],
    message: TagMod[Any],
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: String,
    defaultValue: String,
    placeholders: js.Array[String]
  ): Close = js.native
  def default(
    title: TagMod[Any],
    message: TagMod[Any],
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: String,
    defaultValue: String,
    placeholders: js.Array[String],
    platform: String
  ): Close = js.native
}

