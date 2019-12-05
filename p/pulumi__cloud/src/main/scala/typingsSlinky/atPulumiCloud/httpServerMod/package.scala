package typingsSlinky.atPulumiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpServerMod {
  import typingsSlinky.node.httpMod.IncomingMessage
  import typingsSlinky.node.httpMod.ServerResponse

  type RequestListenerFactory = js.Function0[js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, Unit]]
}
