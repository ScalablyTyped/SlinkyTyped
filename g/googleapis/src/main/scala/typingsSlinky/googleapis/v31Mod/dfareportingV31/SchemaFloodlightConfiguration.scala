package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a Floodlight configuration.
  */
@js.native
trait SchemaFloodlightConfiguration extends js.Object {
  /**
    * Account ID of this floodlight configuration. This is a read-only field
    * that can be left blank.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Advertiser ID of the parent advertiser of this floodlight configuration.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the advertiser. This is a read-only,
    * auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Whether advertiser data is shared with Google Analytics.
    */
  var analyticsDataSharingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the exposure-to-conversion report is enabled. This report shows
    * detailed pathway information on up to 10 of the most recent ad exposures
    * seen by a user before converting.
    */
  var exposureToConversionEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Day that will be counted as the first day of the week in reports. This is
    * a required field.
    */
  var firstDayOfWeek: js.UndefOr[String] = js.native
  /**
    * ID of this floodlight configuration. This is a read-only, auto-generated
    * field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of this floodlight configuration. This is a
    * read-only, auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Whether in-app attribution tracking is enabled.
    */
  var inAppAttributionTrackingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#floodlightConfiguration&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Lookback window settings for this floodlight configuration.
    */
  var lookbackConfiguration: js.UndefOr[SchemaLookbackConfiguration] = js.native
  /**
    * Types of attribution options for natural search conversions.
    */
  var naturalSearchConversionAttributionOption: js.UndefOr[String] = js.native
  /**
    * Settings for Campaign Manager Omniture integration.
    */
  var omnitureSettings: js.UndefOr[SchemaOmnitureSettings] = js.native
  /**
    * Subaccount ID of this floodlight configuration. This is a read-only field
    * that can be left blank.
    */
  var subaccountId: js.UndefOr[String] = js.native
  /**
    * Configuration settings for dynamic and image floodlight tags.
    */
  var tagSettings: js.UndefOr[SchemaTagSettings] = js.native
  /**
    * List of third-party authentication tokens enabled for this configuration.
    */
  var thirdPartyAuthenticationTokens: js.UndefOr[js.Array[SchemaThirdPartyAuthenticationToken]] = js.native
  /**
    * List of user defined variables enabled for this configuration.
    */
  var userDefinedVariableConfigurations: js.UndefOr[js.Array[SchemaUserDefinedVariableConfiguration]] = js.native
}

object SchemaFloodlightConfiguration {
  @scala.inline
  def apply(): SchemaFloodlightConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloodlightConfiguration]
  }
  @scala.inline
  implicit class SchemaFloodlightConfigurationOps[Self <: SchemaFloodlightConfiguration] (val x: Self) extends AnyVal {
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
    def withAdvertiserIdDimensionValue(value: SchemaDimensionValue): Self = {
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
    def withIdDimensionValue(value: SchemaDimensionValue): Self = {
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
    def withOmnitureSettings(value: SchemaOmnitureSettings): Self = {
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
    def withTagSettings(value: SchemaTagSettings): Self = {
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
    def withThirdPartyAuthenticationTokens(value: js.Array[SchemaThirdPartyAuthenticationToken]): Self = {
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
    def withUserDefinedVariableConfigurations(value: js.Array[SchemaUserDefinedVariableConfiguration]): Self = {
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

