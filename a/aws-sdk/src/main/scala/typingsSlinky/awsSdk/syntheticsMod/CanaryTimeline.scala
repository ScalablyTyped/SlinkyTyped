package typingsSlinky.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanaryTimeline extends js.Object {
  /**
    * The date and time the canary was created.
    */
  var Created: js.UndefOr[js.Date] = js.native
  /**
    * The date and time the canary was most recently modified.
    */
  var LastModified: js.UndefOr[js.Date] = js.native
  /**
    * The date and time that the canary's most recent run started.
    */
  var LastStarted: js.UndefOr[js.Date] = js.native
  /**
    * The date and time that the canary's most recent run ended.
    */
  var LastStopped: js.UndefOr[js.Date] = js.native
}

object CanaryTimeline {
  @scala.inline
  def apply(
    Created: js.Date = null,
    LastModified: js.Date = null,
    LastStarted: js.Date = null,
    LastStopped: js.Date = null
  ): CanaryTimeline = {
    val __obj = js.Dynamic.literal()
    if (Created != null) __obj.updateDynamic("Created")(Created.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (LastStarted != null) __obj.updateDynamic("LastStarted")(LastStarted.asInstanceOf[js.Any])
    if (LastStopped != null) __obj.updateDynamic("LastStopped")(LastStopped.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanaryTimeline]
  }
}

