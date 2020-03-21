package typingsSlinky.memorystream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DataType = java.lang.String | typingsSlinky.node.Buffer | typingsSlinky.node.streamMod.Stream
  type MemoryStream = typingsSlinky.node.streamMod.Duplex
}
