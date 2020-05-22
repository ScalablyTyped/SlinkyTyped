package typingsSlinky.pizzip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Data = java.lang.String | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array | typingsSlinky.node.Buffer
  type LoadData = typingsSlinky.pizzip.mod.Data | js.Array[scala.Double]
}
