package typingsSlinky.rlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  import typingsSlinky.bnDotJs.bnDotJsMod.^
  import typingsSlinky.node.Buffer

  /* Rewritten from type alias, can be one of: 
    - typings.node.Buffer
    - java.lang.String
    - scala.Double
    - typings.std.Uint8Array
    - typings.bnDotJs.bnDotJsMod.^
    - typings.rlp.distTypesMod.Dictionary
    - typings.rlp.distTypesMod.List
    - scala.Null
  */
  type Input = _Input | Buffer | String | Double | scala.scalajs.js.typedarray.Uint8Array | ^  | Null
}
