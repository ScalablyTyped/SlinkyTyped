package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportsConfiguration extends js.Object {
  /**
    * Whether the exposure to conversion report is enabled. This report shows detailed pathway information on up to 10 of the most recent ad exposures seen
    * by a user before converting.
    */
  var exposureToConversionEnabled: js.UndefOr[Boolean] = js.native
  /** Default lookback windows for new advertisers in this account. */
  var lookbackConfiguration: js.UndefOr[LookbackConfiguration] = js.native
  /**
    * Report generation time zone ID of this account. This is a required field that can only be changed by a superuser.
    * Acceptable values are:
    *
    * - "1" for "America/New_York"
    * - "2" for "Europe/London"
    * - "3" for "Europe/Paris"
    * - "4" for "Africa/Johannesburg"
    * - "5" for "Asia/Jerusalem"
    * - "6" for "Asia/Shanghai"
    * - "7" for "Asia/Hong_Kong"
    * - "8" for "Asia/Tokyo"
    * - "9" for "Australia/Sydney"
    * - "10" for "Asia/Dubai"
    * - "11" for "America/Los_Angeles"
    * - "12" for "Pacific/Auckland"
    * - "13" for "America/Sao_Paulo"
    */
  var reportGenerationTimeZoneId: js.UndefOr[String] = js.native
}

object ReportsConfiguration {
  @scala.inline
  def apply(): ReportsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportsConfiguration]
  }
  @scala.inline
  implicit class ReportsConfigurationOps[Self <: ReportsConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExposureToConversionEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureToConversionEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposureToConversionEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureToConversionEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLookbackConfiguration(value: LookbackConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookbackConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookbackConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookbackConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withReportGenerationTimeZoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportGenerationTimeZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportGenerationTimeZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportGenerationTimeZoneId")(js.undefined)
        ret
    }
  }
  
}

