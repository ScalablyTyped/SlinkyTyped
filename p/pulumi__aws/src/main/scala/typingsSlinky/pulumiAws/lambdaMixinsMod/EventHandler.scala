package typingsSlinky.pulumiAws.lambdaMixinsMod

import typingsSlinky.pulumiAws.lambdaFunctionMod.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pulumiAws.lambdaMixinsMod.Callback[E, R]
  - typingsSlinky.pulumiAws.lambdaFunctionMod.Function
*/
trait EventHandler[E, R] extends js.Object

object EventHandler {
  @scala.inline
  implicit def apply[E, R](value: Callback[E, R]): EventHandler[E, R] = value.asInstanceOf[EventHandler[E, R]]
  @scala.inline
  implicit def apply[E, R](value: Function): EventHandler[E, R] = value.asInstanceOf[EventHandler[E, R]]
}

