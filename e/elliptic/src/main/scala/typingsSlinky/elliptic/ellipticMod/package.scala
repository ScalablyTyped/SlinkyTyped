package typingsSlinky.elliptic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ellipticMod {
  import typingsSlinky.node.Buffer

  type BNInput = String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | Double | Buffer | scala.scalajs.js.typedarray.Uint8Array | js.Array[Double]
  type ec = ec_
  type eddsa = eddsa_
}
