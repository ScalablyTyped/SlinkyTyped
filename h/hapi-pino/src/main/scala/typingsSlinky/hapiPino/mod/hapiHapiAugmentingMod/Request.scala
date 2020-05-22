package typingsSlinky.hapiPino.mod.hapiHapiAugmentingMod

import typingsSlinky.pino.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var logger: Logger
}

object Request {
  @scala.inline
  def apply(logger: Logger): Request = {
    val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

