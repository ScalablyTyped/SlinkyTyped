package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportsConfiguration extends js.Object {
  var exposureToConversionEnabled: js.UndefOr[Boolean] = js.native
  var lookbackConfiguration: js.UndefOr[LookbackConfiguration] = js.native
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

