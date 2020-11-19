package typingsSlinky.decorum.mod

import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("decorum", "Required")
@js.native
object Required extends js.Object {
  
  def apply(): PropertyDecorator = js.native
  def apply(message: String): PropertyDecorator = js.native
  def apply(message: MessageHandler[RequiredFieldValidator]): PropertyDecorator = js.native
}
