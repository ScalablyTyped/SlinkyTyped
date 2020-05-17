package typingsSlinky.kdbush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Get[T] = js.Function1[/* point */ T, scala.Double]
  type Points = js.Array[js.Array[scala.Double]]
}
