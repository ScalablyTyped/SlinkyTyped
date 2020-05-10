package typingsSlinky.jsforce.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryResult[T] extends js.Object {
  var done: Boolean = js.native
  var nextRecordsUrl: js.UndefOr[String] = js.native
  var records: js.Array[T] = js.native
  var totalSize: Double = js.native
}

object QueryResult {
  @scala.inline
  def apply[T](done: Boolean, records: js.Array[T], totalSize: Double): QueryResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any], totalSize = totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult[T]]
  }
  @scala.inline
  implicit class QueryResultOps[Self[t] <: QueryResult[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDone(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecords(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("records")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalSize(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextRecordsUrl(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextRecordsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextRecordsUrl: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextRecordsUrl")(js.undefined)
        ret
    }
  }
  
}

