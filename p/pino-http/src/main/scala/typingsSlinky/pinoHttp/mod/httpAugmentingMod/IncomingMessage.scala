package typingsSlinky.pinoHttp.mod.httpAugmentingMod

import typingsSlinky.pino.mod.Logger
import typingsSlinky.pinoHttp.mod.ReqId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingMessage extends js.Object {
  var id: ReqId
  var log: Logger
}

object IncomingMessage {
  @scala.inline
  def apply(id: ReqId, log: Logger): IncomingMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingMessage]
  }
}

