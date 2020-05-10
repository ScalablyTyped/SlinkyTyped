package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloodlightConfiguration extends js.Object {
  var accountId: js.UndefOr[String] = js.native
  var advertiserId: js.UndefOr[String] = js.native
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  var analyticsDataSharingEnabled: js.UndefOr[Boolean] = js.native
  var customViewabilityMetric: js.UndefOr[CustomViewabilityMetric] = js.native
  var exposureToConversionEnabled: js.UndefOr[Boolean] = js.native
  var firstDayOfWeek: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  var inAppAttributionTrackingEnabled: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[String] = js.native
  var lookbackConfiguration: js.UndefOr[LookbackConfiguration] = js.native
  var naturalSearchConversionAttributionOption: js.UndefOr[String] = js.native
  var omnitureSettings: js.UndefOr[OmnitureSettings] = js.native
  var subaccountId: js.UndefOr[String] = js.native
  var tagSettings: js.UndefOr[TagSettings] = js.native
  var thirdPartyAuthenticationTokens: js.UndefOr[js.Array[ThirdPartyAuthenticationToken]] = js.native
  var userDefinedVariableConfigurations: js.UndefOr[js.Array[UserDefinedVariableConfiguration]] = js.native
}

object FloodlightConfiguration {
  @scala.inline
  def apply(): FloodlightConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightConfiguration]
  }
  @scala.inline
  implicit class FloodlightConfigurationOps[Self <: FloodlightConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withAdvertiserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertiserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserId")(js.undefined)
        ret
    }
    @scala.inline
    def withAdvertiserIdDimensionValue(value: DimensionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserIdDimensionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertiserIdDimensionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserIdDimensionValue")(js.undefined)
        ret
    }
    @scala.inline
    def withAnalyticsDataSharingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyticsDataSharingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalyticsDataSharingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyticsDataSharingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomViewabilityMetric(value: CustomViewabilityMetric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customViewabilityMetric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomViewabilityMetric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customViewabilityMetric")(js.undefined)
        ret
    }
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
    def withFirstDayOfWeek(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstDayOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIdDimensionValue(value: DimensionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idDimensionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdDimensionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idDimensionValue")(js.undefined)
        ret
    }
    @scala.inline
    def withInAppAttributionTrackingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inAppAttributionTrackingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInAppAttributionTrackingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inAppAttributionTrackingEnabled")(js.undefined)
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
    def withNaturalSearchConversionAttributionOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("naturalSearchConversionAttributionOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNaturalSearchConversionAttributionOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("naturalSearchConversionAttributionOption")(js.undefined)
        ret
    }
    @scala.inline
    def withOmnitureSettings(value: OmnitureSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omnitureSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOmnitureSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omnitureSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSubaccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subaccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubaccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subaccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withTagSettings(value: TagSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withThirdPartyAuthenticationTokens(value: js.Array[ThirdPartyAuthenticationToken]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thirdPartyAuthenticationTokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThirdPartyAuthenticationTokens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thirdPartyAuthenticationTokens")(js.undefined)
        ret
    }
    @scala.inline
    def withUserDefinedVariableConfigurations(value: js.Array[UserDefinedVariableConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDefinedVariableConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDefinedVariableConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDefinedVariableConfigurations")(js.undefined)
        ret
    }
  }
  
}

