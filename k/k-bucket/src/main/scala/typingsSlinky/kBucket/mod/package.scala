package typingsSlinky.kBucket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Arbiter[T /* <: typingsSlinky.kBucket.mod.Contact */] = js.Function2[/* incumbent */ T, /* candidate */ T, T]
  
  type Distance = js.Function2[
    /* firstId */ js.typedarray.Uint8Array, 
    /* secondId */ js.typedarray.Uint8Array, 
    scala.Double
  ]
}
