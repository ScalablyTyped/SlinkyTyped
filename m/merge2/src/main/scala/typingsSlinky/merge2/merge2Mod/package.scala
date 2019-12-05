package typingsSlinky.merge2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object merge2Mod {
  import typingsSlinky.node.NodeJS.ReadableStream

  type StreamType = ReadableStream | Merge2Stream
  type Streams = StreamType | js.Array[StreamType]
}
