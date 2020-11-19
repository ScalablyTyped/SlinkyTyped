package typingsSlinky.rootAsn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ArrBuffer = js.Tuple2[
    scala.Double, 
    js.typedarray.Uint8Array | (js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @root/asn1.@root/asn1.ArrBuffer */ js.Object
    ])
  ]
  
  type ArrInput = js.Tuple2[
    java.lang.String | scala.Double, 
    java.lang.String | js.typedarray.Uint8Array | (js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @root/asn1.@root/asn1.ArrInput */ js.Object
    ])
  ]
  
  type ArrJson = js.Tuple2[
    java.lang.String, 
    java.lang.String | (js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @root/asn1.@root/asn1.ArrJson */ js.Object
    ])
  ]
  
  type ElementBuffer = typingsSlinky.rootAsn1.mod.Element[js.typedarray.Uint8Array]
  
  type ElementHex = typingsSlinky.rootAsn1.mod.Element[java.lang.String]
}
