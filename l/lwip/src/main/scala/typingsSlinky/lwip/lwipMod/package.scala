package typingsSlinky.lwip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lwipMod {
  import typingsSlinky.node.Buffer

  type BufferCallback = js.Function2[/* err */ js.Any, /* buffer */ Buffer, Unit]
  type Color = String | (js.Tuple4[Double, Double, Double, Double]) | ColorObject
  type ImageCallback = js.Function2[/* err */ js.Any, /* image */ Image, Unit]
}
