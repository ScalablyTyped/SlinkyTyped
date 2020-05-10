package typingsSlinky.awsSdkClientDynamodbNode.typesPointInTimeRecoveryDescriptionMod

import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DISABLED
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ENABLED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointInTimeRecoveryDescription extends js.Object {
  /**
    * <p>Specifies the earliest point in time you can restore your table to. It You can restore your table to any point in time during the last 35 days. </p>
    */
  var EarliestRestorableDateTime: js.UndefOr[js.Date | String | Double] = js.native
  /**
    * <p> <code>LatestRestorableDateTime</code> is typically 5 minutes before the current time. </p>
    */
  var LatestRestorableDateTime: js.UndefOr[js.Date | String | Double] = js.native
  /**
    * <p>The current state of point in time recovery:</p> <ul> <li> <p> <code>ENABLING</code> - Point in time recovery is being enabled.</p> </li> <li> <p> <code>ENABLED</code> - Point in time recovery is enabled.</p> </li> <li> <p> <code>DISABLED</code> - Point in time recovery is disabled.</p> </li> </ul>
    */
  var PointInTimeRecoveryStatus: js.UndefOr[ENABLED | DISABLED | String] = js.native
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
    def withEarliestRestorableDateTimeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EarliestRestorableDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEarliestRestorableDateTime(value: js.Date | String | Double): Self = {
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
    def withLatestRestorableDateTimeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestRestorableDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestRestorableDateTime(value: js.Date | String | Double): Self = {
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
    def withPointInTimeRecoveryStatus(value: ENABLED | DISABLED | String): Self = {
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

