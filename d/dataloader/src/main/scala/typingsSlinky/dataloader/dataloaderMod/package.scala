package typingsSlinky.dataloader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dataloaderMod {
  type BatchLoadFn[K, V] = js.Function1[/* keys */ js.Array[K], js.Promise[js.Array[V | js.Error]]]
}
