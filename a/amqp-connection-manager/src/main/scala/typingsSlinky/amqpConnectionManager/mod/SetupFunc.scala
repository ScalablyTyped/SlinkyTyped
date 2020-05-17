package typingsSlinky.amqpConnectionManager.mod

import typingsSlinky.amqplib.mod.ConfirmChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function2[
/ * channel * / typingsSlinky.amqplib.mod.ConfirmChannel, 
/ * callback * / js.Function1[/ * error * / js.UndefOr[typingsSlinky.std.Error], scala.Unit], 
scala.Unit]
  - js.Function1[/ * channel * / typingsSlinky.amqplib.mod.ConfirmChannel, js.Promise[scala.Unit]]
*/
trait SetupFunc extends js.Object

object SetupFunc {
  @scala.inline
  implicit def apply(value: js.Function1[/* channel */ ConfirmChannel, js.Promise[Unit]]): SetupFunc = value.asInstanceOf[SetupFunc]
  @scala.inline
  implicit def apply(
    value: js.Function2[
      /* channel */ ConfirmChannel, 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error], Unit], 
      Unit
    ]
  ): SetupFunc = value.asInstanceOf[SetupFunc]
}

