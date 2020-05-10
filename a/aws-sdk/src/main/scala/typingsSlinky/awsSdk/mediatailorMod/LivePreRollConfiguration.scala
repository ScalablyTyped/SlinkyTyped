package typingsSlinky.awsSdk.mediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LivePreRollConfiguration extends js.Object {
  /**
    * The URL for the ad decision server (ADS) for pre-roll ads. This includes the specification of static parameters and placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as needed when calling the ADS. Alternately, for testing, you can provide a static VAST URL. The maximum length is 25,000 characters.
    */
  var AdDecisionServerUrl: js.UndefOr[string] = js.native
  /**
    * The maximum allowed duration for the pre-roll ad avail. AWS Elemental MediaTailor won't play pre-roll ads to exceed this duration, regardless of the total duration of ads that the ADS returns.
    */
  var MaxDurationSeconds: js.UndefOr[integer] = js.native
}

object LivePreRollConfiguration {
  @scala.inline
  def apply(): LivePreRollConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LivePreRollConfiguration]
  }
  @scala.inline
  implicit class LivePreRollConfigurationOps[Self <: LivePreRollConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdDecisionServerUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdDecisionServerUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdDecisionServerUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdDecisionServerUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDurationSeconds(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxDurationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDurationSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxDurationSeconds")(js.undefined)
        ret
    }
  }
  
}

