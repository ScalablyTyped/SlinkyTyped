package typingsSlinky.dataloader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dataloader", JSImport.Namespace)
@js.native
class ^[K, V] protected () extends DataLoader[K, V] {
  def this(batchLoadFn: BatchLoadFn[K, V]) = this()
  def this(batchLoadFn: BatchLoadFn[K, V], options: Options[K, V]) = this()
}

