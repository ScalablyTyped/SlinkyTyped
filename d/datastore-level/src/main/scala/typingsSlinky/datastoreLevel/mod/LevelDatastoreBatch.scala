package typingsSlinky.datastoreLevel.mod

import typingsSlinky.abstractLeveldown.mod.AbstractBatch
import typingsSlinky.interfaceDatastore.mod.Batch
import typingsSlinky.interfaceDatastore.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevelDatastoreBatch[Value] extends Batch[Value] {
  var ops: js.Array[AbstractBatch[String, Value]] = js.native
}

object LevelDatastoreBatch {
  @scala.inline
  def apply[Value](
    commit: () => js.Promise[Unit],
    delete: Key => Unit,
    ops: js.Array[AbstractBatch[String, Value]],
    put: (Key, Value) => Unit
  ): LevelDatastoreBatch[Value] = {
    val __obj = js.Dynamic.literal(commit = js.Any.fromFunction0(commit), delete = js.Any.fromFunction1(delete), ops = ops.asInstanceOf[js.Any], put = js.Any.fromFunction2(put))
    __obj.asInstanceOf[LevelDatastoreBatch[Value]]
  }
  @scala.inline
  implicit class LevelDatastoreBatchOps[Self[value] <: LevelDatastoreBatch[value], Value] (val x: Self[Value]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Value] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Value]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Value] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Value] with Other]
    @scala.inline
    def withOps(value: js.Array[AbstractBatch[String, Value]]): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ops")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

