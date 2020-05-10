package typingsSlinky.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultFrame extends js.Object {
  /**
    * The records in the result set.
    */
  var records: js.UndefOr[Records] = js.native
  /**
    * The result-set metadata in the result set.
    */
  var resultSetMetadata: js.UndefOr[ResultSetMetadata] = js.native
}

object ResultFrame {
  @scala.inline
  def apply(): ResultFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultFrame]
  }
  @scala.inline
  implicit class ResultFrameOps[Self <: ResultFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecords(value: Records): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("records")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("records")(js.undefined)
        ret
    }
    @scala.inline
    def withResultSetMetadata(value: ResultSetMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSetMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultSetMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSetMetadata")(js.undefined)
        ret
    }
  }
  
}

