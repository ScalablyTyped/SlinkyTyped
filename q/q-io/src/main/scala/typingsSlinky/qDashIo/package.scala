package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object qDashIo {
  import typingsSlinky.node.Buffer
  import typingsSlinky.qDashIo.Qio.Stream

  type QioBufferStream = js.Function2[/* buffer */ Buffer, /* encoding */ String, Stream]
}
