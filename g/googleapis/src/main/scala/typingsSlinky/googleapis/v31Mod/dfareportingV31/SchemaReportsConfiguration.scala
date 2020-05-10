package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reporting Configuration
  */
@js.native
trait SchemaReportsConfiguration extends js.Object {
  /**
    * Whether the exposure to conversion report is enabled. This report shows
    * detailed pathway information on up to 10 of the most recent ad exposures
    * seen by a user before converting.
    */
  var exposureToConversionEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Default lookback windows for new advertisers in this account.
    */
  var lookbackConfiguration: js.UndefOr[SchemaLookbackConfiguration] = js.native
  /**
    * Report generation time zone ID of this account. This is a required field
    * that can only be changed by a superuser. Acceptable values are:  -
    * &quot;1&quot; for &quot;America/New_York&quot;  - &quot;2&quot; for
    * &quot;Europe/London&quot;  - &quot;3&quot; for &quot;Europe/Paris&quot;
    * - &quot;4&quot; for &quot;Africa/Johannesburg&quot;  - &quot;5&quot; for
    * &quot;Asia/Jerusalem&quot;  - &quot;6&quot; for &quot;Asia/Shanghai&quot;
    * - &quot;7&quot; for &quot;Asia/Hong_Kong&quot;  - &quot;8&quot; for
    * &quot;Asia/Tokyo&quot;  - &quot;9&quot; for &quot;Australia/Sydney&quot;
    * - &quot;10&quot; for &quot;Asia/Dubai&quot;  - &quot;11&quot; for
    * &quot;America/Los_Angeles&quot;  - &quot;12&quot; for
    * &quot;Pacific/Auckland&quot;  - &quot;13&quot; for
    * &quot;America/Sao_Paulo&quot;
    */
  var reportGenerationTimeZoneId: js.UndefOr[String] = js.native
}

object SchemaReportsConfiguration {
  @scala.inline
  def apply(): SchemaReportsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportsConfiguration]
  }
  @scala.inline
  implicit class SchemaReportsConfigurationOps[Self <: SchemaReportsConfiguration] (val x: Self) extends AnyVal {
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
    def withLookbackConfiguration(value: SchemaLookbackConfiguration): Self = {
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

