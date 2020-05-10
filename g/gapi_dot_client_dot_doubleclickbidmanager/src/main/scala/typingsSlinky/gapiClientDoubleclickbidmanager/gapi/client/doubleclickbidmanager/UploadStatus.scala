package typingsSlinky.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadStatus extends js.Object {
  /** Reasons why upload can't be completed. */
  var errors: js.UndefOr[js.Array[String]] = js.native
  /** Per-row upload status. */
  var rowStatus: js.UndefOr[js.Array[RowStatus]] = js.native
}

object UploadStatus {
  @scala.inline
  def apply(): UploadStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadStatus]
  }
  @scala.inline
  implicit class UploadStatusOps[Self <: UploadStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[String]): Self = {
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
    @scala.inline
    def withRowStatus(value: js.Array[RowStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowStatus")(js.undefined)
        ret
    }
  }
  
}

