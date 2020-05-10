package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InboxPlacementTrackingOption extends js.Object {
  /**
    * Specifies whether inbox placement data is being tracked for the domain.
    */
  var Global: js.UndefOr[Enabled] = js.native
  /**
    * An array of strings, one for each major email provider that the inbox placement data applies to.
    */
  var TrackedIsps: js.UndefOr[IspNameList] = js.native
}

object InboxPlacementTrackingOption {
  @scala.inline
  def apply(): InboxPlacementTrackingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InboxPlacementTrackingOption]
  }
  @scala.inline
  implicit class InboxPlacementTrackingOptionOps[Self <: InboxPlacementTrackingOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobal(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Global")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackedIsps(value: IspNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrackedIsps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackedIsps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrackedIsps")(js.undefined)
        ret
    }
  }
  
}

