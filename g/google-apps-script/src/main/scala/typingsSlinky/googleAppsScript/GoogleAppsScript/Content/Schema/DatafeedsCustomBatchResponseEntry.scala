package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatafeedsCustomBatchResponseEntry extends js.Object {
  var batchId: js.UndefOr[Double] = js.native
  var datafeed: js.UndefOr[Datafeed] = js.native
  var errors: js.UndefOr[Errors] = js.native
}

object DatafeedsCustomBatchResponseEntry {
  @scala.inline
  def apply(): DatafeedsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatafeedsCustomBatchResponseEntry]
  }
  @scala.inline
  implicit class DatafeedsCustomBatchResponseEntryOps[Self <: DatafeedsCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchId")(js.undefined)
        ret
    }
    @scala.inline
    def withDatafeed(value: Datafeed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datafeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatafeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datafeed")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: Errors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
  }
  
}

