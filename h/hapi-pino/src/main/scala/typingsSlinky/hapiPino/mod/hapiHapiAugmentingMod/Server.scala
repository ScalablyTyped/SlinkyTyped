package typingsSlinky.hapiPino.mod.hapiHapiAugmentingMod

import typingsSlinky.pino.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  var logger: Logger
}

object Server {
  @scala.inline
  def apply(logger: Logger): Server = {
    val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Server]
  }
}

