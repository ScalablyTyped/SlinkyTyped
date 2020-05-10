package typingsSlinky.relayRuntime.relayStoreTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.relayRuntime.relayRecordStateMod.RecordState
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.DataID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordSource extends js.Object {
  def get(dataID: DataID): js.UndefOr[Record | Null] = js.native
  def getRecordIDs(): js.Array[DataID] = js.native
  def getStatus(dataID: DataID): RecordState = js.native
  def has(dataID: DataID): Boolean = js.native
  def size(): Double = js.native
  def toJSON(): StringDictionary[Record] = js.native
}

object RecordSource {
  @scala.inline
  def apply(
    get: DataID => js.UndefOr[Record | Null],
    getRecordIDs: () => js.Array[DataID],
    getStatus: DataID => RecordState,
    has: DataID => Boolean,
    size: () => Double,
    toJSON: () => StringDictionary[Record]
  ): RecordSource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getRecordIDs = js.Any.fromFunction0(getRecordIDs), getStatus = js.Any.fromFunction1(getStatus), has = js.Any.fromFunction1(has), size = js.Any.fromFunction0(size), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[RecordSource]
  }
  @scala.inline
  implicit class RecordSourceOps[Self <: RecordSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: DataID => js.UndefOr[Record | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRecordIDs(value: () => js.Array[DataID]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecordIDs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStatus(value: DataID => RecordState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHas(value: DataID => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => StringDictionary[Record]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

