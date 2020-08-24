package typingsSlinky.pgProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object parserMod {
  type MessageCallback = js.Function1[/* msg */ typingsSlinky.pgProtocol.messagesMod.BackendMessage, scala.Unit]
}
