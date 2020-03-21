package typingsSlinky.consul.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends IncomingMessage {
  var body: js.UndefOr[js.Object | String | Buffer] = js.native
}

