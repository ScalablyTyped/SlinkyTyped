package typingsSlinky.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlStatementResult extends js.Object {
  /**
    * The number of records updated by a SQL statement.
    */
  var numberOfRecordsUpdated: js.UndefOr[RecordsUpdated] = js.native
  /**
    * The result set of the SQL statement.
    */
  var resultFrame: js.UndefOr[ResultFrame] = js.native
}

object SqlStatementResult {
  @scala.inline
  def apply(): SqlStatementResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlStatementResult]
  }
  @scala.inline
  implicit class SqlStatementResultOps[Self <: SqlStatementResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumberOfRecordsUpdated(value: RecordsUpdated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfRecordsUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfRecordsUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfRecordsUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withResultFrame(value: ResultFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultFrame")(js.undefined)
        ret
    }
  }
  
}

