package typingsSlinky.pizzip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pizzipMod {
  import typingsSlinky.node.Buffer

  type Data = String | scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.Uint8Array | Buffer
  type LoadData = Data | js.Array[Double]
}
