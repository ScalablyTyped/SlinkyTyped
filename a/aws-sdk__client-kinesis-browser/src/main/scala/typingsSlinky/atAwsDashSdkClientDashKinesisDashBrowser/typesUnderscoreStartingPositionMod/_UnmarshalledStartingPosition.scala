package typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreStartingPositionMod

import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.AFTER_SEQUENCE_NUMBER
import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.AT_SEQUENCE_NUMBER
import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.AT_TIMESTAMP
import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.LATEST
import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.TRIM_HORIZON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledStartingPosition extends _StartingPosition {
  /**
    * _Timestamp shape
    */
  @JSName("Timestamp")
  var Timestamp__UnmarshalledStartingPosition: js.UndefOr[js.Date] = js.undefined
}

object _UnmarshalledStartingPosition {
  @scala.inline
  def apply(
    Type: AT_SEQUENCE_NUMBER | AFTER_SEQUENCE_NUMBER | TRIM_HORIZON | LATEST | AT_TIMESTAMP | String,
    SequenceNumber: String = null,
    Timestamp: js.Date = null
  ): _UnmarshalledStartingPosition = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (SequenceNumber != null) __obj.updateDynamic("SequenceNumber")(SequenceNumber.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledStartingPosition]
  }
}

