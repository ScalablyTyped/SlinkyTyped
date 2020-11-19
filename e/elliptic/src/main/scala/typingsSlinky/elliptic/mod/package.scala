package typingsSlinky.elliptic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BNInput = java.lang.String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | scala.Double | typingsSlinky.node.Buffer | js.typedarray.Uint8Array | js.Array[scala.Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.elliptic.mod.ec.Signature
    - typingsSlinky.elliptic.mod.ec.SignatureOptions
    - typingsSlinky.std.Uint8Array
    - js.Array[scala.Double]
    - java.lang.String
  */
  type SignatureInput = typingsSlinky.elliptic.mod._SignatureInput | js.Array[scala.Double] | js.typedarray.Uint8Array | java.lang.String
  
  type ec = typingsSlinky.elliptic.mod.ec_
  
  type eddsa = typingsSlinky.elliptic.mod.eddsa_
}
