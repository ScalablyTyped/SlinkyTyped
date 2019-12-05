package typingsSlinky.memorystream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object memorystreamMod {
  import typingsSlinky.node.Buffer
  import typingsSlinky.node.streamMod.Duplex
  import typingsSlinky.node.streamMod.Stream

  type DataType = String | Buffer | Stream
  type MemoryStream = Duplex
}
