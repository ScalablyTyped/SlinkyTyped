package typingsSlinky.ethereumjsDashTx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  import typingsSlinky.node.Buffer

  type BufferLike = Buffer | TransformableToBuffer | PrefixedHexString | Double
  type PrefixedHexString = String
}
