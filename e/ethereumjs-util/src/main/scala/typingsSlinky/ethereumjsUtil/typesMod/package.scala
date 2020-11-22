package typingsSlinky.ethereumjsUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type AddressLike = typingsSlinky.ethereumjsUtil.addressMod.Address | typingsSlinky.node.Buffer | java.lang.String
  
  type BNLike = typingsSlinky.bnJs.mod.^  | java.lang.String | scala.Double
  
  type BufferLike = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | js.Array[scala.Double] | scala.Double | typingsSlinky.bnJs.mod.^  | typingsSlinky.ethereumjsUtil.typesMod.TransformableToBuffer | typingsSlinky.ethereumjsUtil.typesMod.PrefixedHexString
  
  type PrefixedHexString = java.lang.String
}
