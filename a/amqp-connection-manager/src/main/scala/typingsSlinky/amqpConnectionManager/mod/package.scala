package typingsSlinky.amqpConnectionManager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SetupFunc = (js.Function2[
    /* channel */ typingsSlinky.amqplib.mod.ConfirmChannel, 
    /* callback */ js.Function1[/* error */ js.UndefOr[js.Error], scala.Unit], 
    scala.Unit
  ]) | (js.Function1[/* channel */ typingsSlinky.amqplib.mod.ConfirmChannel, js.Promise[scala.Unit]])
}
