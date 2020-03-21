package typingsSlinky.cometd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function1[/* data */ js.Any, scala.Unit]
  type HandshakeListener = js.Function1[/* message */ typingsSlinky.cometd.mod.HandshakeMessage, scala.Unit]
  type Listener = js.Function1[/* message */ typingsSlinky.cometd.mod.Message, scala.Unit]
  type SubscribeListener = js.Function1[/* message */ typingsSlinky.cometd.mod.SubscribeMessage, scala.Unit]
}
