package typingsSlinky.amqpDashConnectionDashManager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object amqpDashConnectionDashManagerMod {
  import typingsSlinky.amqplib.amqplibMod.ConfirmChannel

  type SetupFunc = (js.Function2[
    /* channel */ ConfirmChannel, 
    /* callback */ js.Function1[/* error */ js.UndefOr[js.Error], Unit], 
    Unit
  ]) | (js.Function1[/* channel */ ConfirmChannel, js.Promise[Unit]])
}
