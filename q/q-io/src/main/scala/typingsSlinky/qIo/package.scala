package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object qIo {
  type QioBufferStream = js.Function2[
    /* buffer */ typingsSlinky.node.Buffer, 
    /* encoding */ java.lang.String, 
    typingsSlinky.qIo.Qio.Stream
  ]
}
