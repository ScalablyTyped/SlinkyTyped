package typingsSlinky.k6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cryptoMod {
  type BinaryEncoding = typingsSlinky.k6.k6Strings.binary
  type Output[OE /* <: typingsSlinky.k6.cryptoMod.OutputEncoding */] = typingsSlinky.k6.mod.bytes | java.lang.String
  type OutputEncoding = typingsSlinky.k6.cryptoMod.StringEncoding | typingsSlinky.k6.cryptoMod.BinaryEncoding
}
