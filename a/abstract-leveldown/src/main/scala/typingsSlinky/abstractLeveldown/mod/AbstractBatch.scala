package typingsSlinky.abstractLeveldown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.abstractLeveldown.mod.PutBatch[K, V]
  - typingsSlinky.abstractLeveldown.mod.DelBatch[K, V]
*/
trait AbstractBatch[K, V] extends js.Object

object AbstractBatch {
  @scala.inline
  implicit def apply[K, V](value: DelBatch[K, V]): AbstractBatch[K, V] = value.asInstanceOf[AbstractBatch[K, V]]
  @scala.inline
  implicit def apply[K, V](value: PutBatch[K, V]): AbstractBatch[K, V] = value.asInstanceOf[AbstractBatch[K, V]]
}

