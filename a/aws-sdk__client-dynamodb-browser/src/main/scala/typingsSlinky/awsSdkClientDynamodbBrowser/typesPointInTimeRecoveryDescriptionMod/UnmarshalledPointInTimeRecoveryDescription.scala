package typingsSlinky.awsSdkClientDynamodbBrowser.typesPointInTimeRecoveryDescriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledPointInTimeRecoveryDescription extends PointInTimeRecoveryDescription {
  /**
    * <p>Specifies the earliest point in time you can restore your table to. It You can restore your table to any point in time during the last 35 days. </p>
    */
  @JSName("EarliestRestorableDateTime")
  var EarliestRestorableDateTime_UnmarshalledPointInTimeRecoveryDescription: js.UndefOr[js.Date] = js.native
  /**
    * <p> <code>LatestRestorableDateTime</code> is typically 5 minutes before the current time. </p>
    */
  @JSName("LatestRestorableDateTime")
  var LatestRestorableDateTime_UnmarshalledPointInTimeRecoveryDescription: js.UndefOr[js.Date] = js.native
}

object UnmarshalledPointInTimeRecoveryDescription {
  @scala.inline
  def apply(): UnmarshalledPointInTimeRecoveryDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledPointInTimeRecoveryDescription]
  }
  @scala.inline
  implicit class UnmarshalledPointInTimeRecoveryDescriptionOps[Self <: UnmarshalledPointInTimeRecoveryDescription] (val x: Self) extends AnyVal {
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
  }
  
}

