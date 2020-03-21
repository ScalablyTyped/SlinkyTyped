package typingsSlinky.rlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.node.Buffer
    - java.lang.String
    - scala.Double
    - typingsSlinky.std.Uint8Array
    - typingsSlinky.bnJs.mod.^
    - typingsSlinky.rlp.typesMod.Dictionary
    - typingsSlinky.rlp.typesMod.List
    - scala.Null
  */
  type Input = typingsSlinky.rlp.typesMod._Input | typingsSlinky.node.Buffer | java.lang.String | scala.Double | scala.scalajs.js.typedarray.Uint8Array | typingsSlinky.bnJs.mod.^  | scala.Null
}
