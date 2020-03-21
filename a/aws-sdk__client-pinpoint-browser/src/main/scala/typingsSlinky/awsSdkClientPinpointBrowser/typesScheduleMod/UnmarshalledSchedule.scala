package typingsSlinky.awsSdkClientPinpointBrowser.typesScheduleMod

import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DAILY
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.HOURLY
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.MONTHLY
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ONCE
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.WEEKLY
import typingsSlinky.awsSdkClientPinpointBrowser.typesQuietTimeMod.UnmarshalledQuietTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSchedule extends Schedule {
  /**
    * The time during which the campaign sends no messages.
    */
  @JSName("QuietTime")
  var QuietTime_UnmarshalledSchedule: js.UndefOr[UnmarshalledQuietTime] = js.undefined
}

object UnmarshalledSchedule {
  @scala.inline
  def apply(
    EndTime: String = null,
    Frequency: ONCE | HOURLY | DAILY | WEEKLY | MONTHLY | String = null,
    IsLocalTime: js.UndefOr[Boolean] = js.undefined,
    QuietTime: UnmarshalledQuietTime = null,
    StartTime: String = null,
    Timezone: String = null
  ): UnmarshalledSchedule = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (Frequency != null) __obj.updateDynamic("Frequency")(Frequency.asInstanceOf[js.Any])
    if (!js.isUndefined(IsLocalTime)) __obj.updateDynamic("IsLocalTime")(IsLocalTime.asInstanceOf[js.Any])
    if (QuietTime != null) __obj.updateDynamic("QuietTime")(QuietTime.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSchedule]
  }
}

