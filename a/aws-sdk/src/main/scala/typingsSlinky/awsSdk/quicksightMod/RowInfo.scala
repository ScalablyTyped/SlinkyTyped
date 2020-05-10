package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowInfo extends js.Object {
  /**
    * The number of rows that were not ingested.
    */
  var RowsDropped: js.UndefOr[long] = js.native
  /**
    * The number of rows that were ingested.
    */
  var RowsIngested: js.UndefOr[long] = js.native
}

object RowInfo {
  @scala.inline
  def apply(): RowInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowInfo]
  }
  @scala.inline
  implicit class RowInfoOps[Self <: RowInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRowsDropped(value: long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowsDropped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowsDropped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowsDropped")(js.undefined)
        ret
    }
    @scala.inline
    def withRowsIngested(value: long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowsIngested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowsIngested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowsIngested")(js.undefined)
        ret
    }
  }
  
}

