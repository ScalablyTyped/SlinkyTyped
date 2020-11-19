package typingsSlinky.dataloader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BatchLoadFn[K, V] = js.Function1[/* keys */ js.Array[K], js.Thenable[typingsSlinky.std.ArrayLike[V | js.Error]]]
}
