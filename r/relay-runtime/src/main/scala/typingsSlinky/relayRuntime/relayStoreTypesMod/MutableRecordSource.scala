package typingsSlinky.relayRuntime.relayStoreTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.relayRuntime.relayRecordStateMod.RecordState
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.DataID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutableRecordSource extends RecordSource {
  def clear(): Unit = js.native
  def delete(dataID: DataID): Unit = js.native
  def remove(dataID: DataID): Unit = js.native
  def set(dataID: DataID, record: Record): Unit = js.native
}

object MutableRecordSource {
  @scala.inline
  def apply(
    clear: () => Unit,
    delete: DataID => Unit,
    get: DataID => js.UndefOr[Record | Null],
    getRecordIDs: () => js.Array[DataID],
    getStatus: DataID => RecordState,
    has: DataID => Boolean,
    remove: DataID => Unit,
    set: (DataID, Record) => Unit,
    size: () => Double,
    toJSON: () => StringDictionary[Record]
  ): MutableRecordSource = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getRecordIDs = js.Any.fromFunction0(getRecordIDs), getStatus = js.Any.fromFunction1(getStatus), has = js.Any.fromFunction1(has), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), size = js.Any.fromFunction0(size), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[MutableRecordSource]
  }
  @scala.inline
  implicit class MutableRecordSourceOps[Self <: MutableRecordSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDelete(value: DataID => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: DataID => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: (DataID, Record) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

