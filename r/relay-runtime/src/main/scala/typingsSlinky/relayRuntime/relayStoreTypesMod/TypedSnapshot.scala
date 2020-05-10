package typingsSlinky.relayRuntime.relayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedSnapshot[TData] extends js.Object {
  val data: TData = js.native
  val isMissingData: Boolean = js.native
  val seenRecords: RecordMap = js.native
  val selector: SingularReaderSelector = js.native
}

object TypedSnapshot {
  @scala.inline
  def apply[TData](data: TData, isMissingData: Boolean, seenRecords: RecordMap, selector: SingularReaderSelector): TypedSnapshot[TData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isMissingData = isMissingData.asInstanceOf[js.Any], seenRecords = seenRecords.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedSnapshot[TData]]
  }
  @scala.inline
  implicit class TypedSnapshotOps[Self[tdata] <: TypedSnapshot[tdata], TData] (val x: Self[TData]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TData] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TData]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TData] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TData] with Other]
    @scala.inline
    def withData(value: TData): Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMissingData(value: Boolean): Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMissingData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeenRecords(value: RecordMap): Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seenRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: SingularReaderSelector): Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

