package typingsSlinky.elliptic.mod

import typingsSlinky.elliptic.mod.ec.Signature
import typingsSlinky.elliptic.mod.ec.SignatureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.elliptic.mod.ec.Signature
  - typingsSlinky.elliptic.mod.ec.SignatureOptions
  - typingsSlinky.std.Uint8Array
  - js.Array[scala.Double]
  - java.lang.String
*/
trait SignatureInput extends js.Object

object SignatureInput {
  @scala.inline
  implicit def apply(value: js.Array[Double]): SignatureInput = value.asInstanceOf[SignatureInput]
  @scala.inline
  implicit def apply(value: Signature): SignatureInput = value.asInstanceOf[SignatureInput]
  @scala.inline
  implicit def apply(value: SignatureOptions): SignatureInput = value.asInstanceOf[SignatureInput]
  @scala.inline
  implicit def apply(value: String): SignatureInput = value.asInstanceOf[SignatureInput]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): SignatureInput = value.asInstanceOf[SignatureInput]
}

