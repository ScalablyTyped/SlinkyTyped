package typingsSlinky.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RulesetInfo extends js.Object {
  /**
    * The regulatory domain to which the ruleset belongs is required. It must be a 2-letter country code. The device should use this to determine additional
    * device behavior required by the associated regulatory domain.
    */
  var authority: js.UndefOr[String] = js.native
  /**
    * The maximum location change in meters is required in the initialization response, but optional otherwise. When the device changes location by more than
    * this specified distance, it must contact the database to get the available spectrum for the new location. If the device is using spectrum that is no
    * longer available, it must immediately cease use of the spectrum under rules for database-managed spectrum. If this value is provided within the context
    * of an available-spectrum response, it takes precedence over the value within the initialization response.
    */
  var maxLocationChange: js.UndefOr[Double] = js.native
  /**
    * The maximum duration, in seconds, between requests for available spectrum. It is required in the initialization response, but optional otherwise. The
    * device must contact the database to get available spectrum no less frequently than this duration. If the new spectrum information indicates that the
    * device is using spectrum that is no longer available, it must immediately cease use of those frequencies under rules for database-managed spectrum. If
    * this value is provided within the context of an available-spectrum response, it takes precedence over the value within the initialization response.
    */
  var maxPollingSecs: js.UndefOr[Double] = js.native
  /**
    * The identifiers of the rulesets supported for the device's location. The database should include at least one applicable ruleset in the initialization
    * response. The device may use the ruleset identifiers to determine parameters to include in subsequent requests. Within the context of the
    * available-spectrum responses, the database should include the identifier of the ruleset that it used to determine the available-spectrum response. If
    * included, the device must use the specified ruleset to interpret the response. If the device does not support the indicated ruleset, it must not
    * operate in the spectrum governed by the ruleset.
    */
  var rulesetIds: js.UndefOr[js.Array[String]] = js.native
}

object RulesetInfo {
  @scala.inline
  def apply(): RulesetInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RulesetInfo]
  }
  @scala.inline
  implicit class RulesetInfoOps[Self <: RulesetInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthority(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authority")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLocationChange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLocationChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLocationChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLocationChange")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPollingSecs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPollingSecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPollingSecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPollingSecs")(js.undefined)
        ret
    }
    @scala.inline
    def withRulesetIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRulesetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesetIds")(js.undefined)
        ret
    }
  }
  
}

