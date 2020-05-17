package typingsSlinky.lwip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BufferCallback = js.Function2[/* err */ js.Any, /* buffer */ typingsSlinky.node.Buffer, scala.Unit]
  type ImageCallback = js.Function2[/* err */ js.Any, /* image */ typingsSlinky.lwip.mod.Image, scala.Unit]
}
