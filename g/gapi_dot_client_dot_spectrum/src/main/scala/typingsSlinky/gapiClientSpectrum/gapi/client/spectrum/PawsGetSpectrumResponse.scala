package typingsSlinky.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PawsGetSpectrumResponse extends js.Object {
  /**
    * A database may include the databaseChange parameter to notify a device of a change to its database URI, providing one or more alternate database URIs.
    * The device should use this information to update its list of pre-configured databases by (only) replacing its entry for the responding database with
    * the list of alternate URIs.
    */
  var databaseChange: js.UndefOr[DbUpdateSpec] = js.native
  /**
    * The database must return, in its available spectrum response, the device descriptor information it received in the master device's available spectrum
    * request.
    */
  var deviceDesc: js.UndefOr[DeviceDescriptor] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "spectrum#pawsGetSpectrumResponse". */
  var kind: js.UndefOr[String] = js.native
  /**
    * The database may return a constraint on the allowed maximum contiguous bandwidth (in Hertz). A regulatory domain may require the database to return
    * this parameter. When this parameter is present in the response, the device must apply this constraint to its spectrum-selection logic to ensure that no
    * single block of spectrum has bandwidth that exceeds this value.
    */
  var maxContiguousBwHz: js.UndefOr[Double] = js.native
  /**
    * The database may return a constraint on the allowed maximum total bandwidth (in Hertz), which need not be contiguous. A regulatory domain may require
    * the database to return this parameter. When this parameter is present in the available spectrum response, the device must apply this constraint to its
    * spectrum-selection logic to ensure that total bandwidth does not exceed this value.
    */
  var maxTotalBwHz: js.UndefOr[Double] = js.native
  /**
    * For regulatory domains that require a spectrum-usage report from devices, the database must return true for this parameter if the spectrum schedule
    * list is not empty; otherwise, the database will either return false or omit this parameter. If this parameter is present and its value is true, the
    * device must send a spectrum use notify message to the database; otherwise, the device must not send the notification.
    */
  var needsSpectrumReport: js.UndefOr[Boolean] = js.native
  /**
    * The database should return ruleset information, which identifies the applicable regulatory authority and ruleset for the available spectrum response.
    * If included, the device must use the corresponding ruleset to interpret the response. Values provided in the returned ruleset information, such as
    * maxLocationChange, take precedence over any conflicting values provided in the ruleset information returned in a prior initialization response sent by
    * the database to the device.
    */
  var rulesetInfo: js.UndefOr[RulesetInfo] = js.native
  /**
    * The available spectrum response must contain a spectrum schedule list. The list may be empty if spectrum is not available. The database may return more
    * than one spectrum schedule to represent future changes to the available spectrum. How far in advance a schedule may be provided depends on the
    * applicable regulatory domain.
    */
  var spectrumSchedules: js.UndefOr[js.Array[SpectrumSchedule]] = js.native
  /**
    * The database includes a timestamp of the form YYYY-MM-DDThh:mm:ssZ (Internet timestamp format per RFC3339) in its available spectrum response. The
    * timestamp should be used by the device as a reference for the start and stop times specified in the response spectrum schedules.
    */
  var timestamp: js.UndefOr[String] = js.native
  /**
    * The message type (e.g., INIT_REQ, AVAIL_SPECTRUM_REQ, ...).
    *
    * Required field.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The PAWS version. Must be exactly 1.0.
    *
    * Required field.
    */
  var version: js.UndefOr[String] = js.native
}

object PawsGetSpectrumResponse {
  @scala.inline
  def apply(): PawsGetSpectrumResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PawsGetSpectrumResponse]
  }
  @scala.inline
  implicit class PawsGetSpectrumResponseOps[Self <: PawsGetSpectrumResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabaseChange(value: DbUpdateSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseChange")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceDesc(value: DeviceDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceDesc")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxContiguousBwHz(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxContiguousBwHz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxContiguousBwHz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxContiguousBwHz")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTotalBwHz(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTotalBwHz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTotalBwHz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTotalBwHz")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedsSpectrumReport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsSpectrumReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedsSpectrumReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsSpectrumReport")(js.undefined)
        ret
    }
    @scala.inline
    def withRulesetInfo(value: RulesetInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesetInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRulesetInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesetInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withSpectrumSchedules(value: js.Array[SpectrumSchedule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectrumSchedules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpectrumSchedules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectrumSchedules")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

