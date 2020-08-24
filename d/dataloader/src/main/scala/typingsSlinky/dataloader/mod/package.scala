package typingsSlinky.dataloader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BatchLoadFn[K, V] = js.Function1[/* keys */ js.Array[K], js.Thenable[typingsSlinky.std.ArrayLike[V | js.Error]]]
}
