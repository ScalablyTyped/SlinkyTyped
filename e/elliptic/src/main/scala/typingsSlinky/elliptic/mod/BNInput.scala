package typingsSlinky.elliptic.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN * / js.Any
  - scala.Double
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - js.Array[scala.Double]
*/
trait BNInput extends js.Object

object BNInput {
  @scala.inline
  implicit def apply(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
  ): BNInput = value.asInstanceOf[BNInput]
  @scala.inline
  implicit def apply(value: js.Array[Double]): BNInput = value.asInstanceOf[BNInput]
  @scala.inline
  implicit def apply(value: Buffer): BNInput = value.asInstanceOf[BNInput]
  @scala.inline
  implicit def apply(value: Double): BNInput = value.asInstanceOf[BNInput]
  @scala.inline
  implicit def apply(value: String): BNInput = value.asInstanceOf[BNInput]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): BNInput = value.asInstanceOf[BNInput]
}

