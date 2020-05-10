package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointInTimeRecoveryDescription extends js.Object {
  /**
    * Specifies the earliest point in time you can restore your table to. You can restore your table to any point in time during the last 35 days. 
    */
  var EarliestRestorableDateTime: js.UndefOr[js.Date] = js.native
  /**
    *  LatestRestorableDateTime is typically 5 minutes before the current time. 
    */
  var LatestRestorableDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The current state of point in time recovery:    ENABLING - Point in time recovery is being enabled.    ENABLED - Point in time recovery is enabled.    DISABLED - Point in time recovery is disabled.  
    */
  var PointInTimeRecoveryStatus: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.PointInTimeRecoveryStatus] = js.native
}

object PointInTimeRecoveryDescription {
  @scala.inline
  def apply(): PointInTimeRecoveryDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointInTimeRecoveryDescription]
  }
  @scala.inline
  implicit class PointInTimeRecoveryDescriptionOps[Self <: PointInTimeRecoveryDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEarliestRestorableDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EarliestRestorableDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEarliestRestorableDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EarliestRestorableDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestRestorableDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestRestorableDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestRestorableDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestRestorableDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPointInTimeRecoveryStatus(value: PointInTimeRecoveryStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PointInTimeRecoveryStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointInTimeRecoveryStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PointInTimeRecoveryStatus")(js.undefined)
        ret
    }
  }
  
}

