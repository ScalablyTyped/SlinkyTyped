package typingsSlinky.k6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cryptoMod {
  import typingsSlinky.k6.k6Mod.bytes
  import typingsSlinky.k6.k6Strings.binary

  type BinaryEncoding = binary
  type Output[OE /* <: OutputEncoding */] = bytes | String
  type OutputEncoding = StringEncoding | BinaryEncoding
}
