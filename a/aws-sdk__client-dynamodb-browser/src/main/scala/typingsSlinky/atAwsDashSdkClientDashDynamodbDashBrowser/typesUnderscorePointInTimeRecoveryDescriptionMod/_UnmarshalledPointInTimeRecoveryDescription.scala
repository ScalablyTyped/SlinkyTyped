package typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscorePointInTimeRecoveryDescriptionMod

import typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.DISABLED
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.ENABLED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledPointInTimeRecoveryDescription extends _PointInTimeRecoveryDescription {
  /**
    * <p>Specifies the earliest point in time you can restore your table to. It You can restore your table to any point in time during the last 35 days. </p>
    */
  @JSName("EarliestRestorableDateTime")
  var EarliestRestorableDateTime__UnmarshalledPointInTimeRecoveryDescription: js.UndefOr[js.Date] = js.undefined
  /**
    * <p> <code>LatestRestorableDateTime</code> is typically 5 minutes before the current time. </p>
    */
  @JSName("LatestRestorableDateTime")
  var LatestRestorableDateTime__UnmarshalledPointInTimeRecoveryDescription: js.UndefOr[js.Date] = js.undefined
}

object _UnmarshalledPointInTimeRecoveryDescription {
  @scala.inline
  def apply(
    EarliestRestorableDateTime: js.Date = null,
    LatestRestorableDateTime: js.Date = null,
    PointInTimeRecoveryStatus: ENABLED | DISABLED | String = null
  ): _UnmarshalledPointInTimeRecoveryDescription = {
    val __obj = js.Dynamic.literal()
    if (EarliestRestorableDateTime != null) __obj.updateDynamic("EarliestRestorableDateTime")(EarliestRestorableDateTime.asInstanceOf[js.Any])
    if (LatestRestorableDateTime != null) __obj.updateDynamic("LatestRestorableDateTime")(LatestRestorableDateTime.asInstanceOf[js.Any])
    if (PointInTimeRecoveryStatus != null) __obj.updateDynamic("PointInTimeRecoveryStatus")(PointInTimeRecoveryStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledPointInTimeRecoveryDescription]
  }
}

