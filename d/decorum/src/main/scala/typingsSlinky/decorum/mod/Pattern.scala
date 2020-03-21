package typingsSlinky.decorum.mod

import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decorum", "Pattern")
@js.native
object Pattern extends js.Object {
  def apply(regex: js.RegExp): PropertyDecorator = js.native
  def apply(regex: js.RegExp, message: String): PropertyDecorator = js.native
  def apply(regex: js.RegExp, message: MessageHandler[PatternValidator]): PropertyDecorator = js.native
}

