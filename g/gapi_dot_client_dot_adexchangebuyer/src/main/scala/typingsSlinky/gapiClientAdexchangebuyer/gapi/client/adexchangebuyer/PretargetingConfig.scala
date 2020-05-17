package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiClientAdexchangebuyer.anon.AspectRatio
import typingsSlinky.gapiClientAdexchangebuyer.anon.Token
import typingsSlinky.gapiClientAdexchangebuyer.anon.Width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PretargetingConfig extends js.Object {
  /** The id for billing purposes, provided for reference. Leave this field blank for insert requests; the id will be generated automatically. */
  var billingId: js.UndefOr[String] = js.native
  /** The config id; generated automatically. Leave this field blank for insert requests. */
  var configId: js.UndefOr[String] = js.native
  /** The name of the config. Must be unique. Required for all requests. */
  var configName: js.UndefOr[String] = js.native
  /** List must contain exactly one of PRETARGETING_CREATIVE_TYPE_HTML or PRETARGETING_CREATIVE_TYPE_VIDEO. */
  var creativeType: js.UndefOr[js.Array[String]] = js.native
  /** Requests which allow one of these (width, height) pairs will match. All pairs must be supported ad dimensions. */
  var dimensions: js.UndefOr[js.Array[Width]] = js.native
  /** Requests with any of these content labels will not match. Values are from content-labels.txt in the downloadable files section. */
  var excludedContentLabels: js.UndefOr[js.Array[String]] = js.native
  /** Requests containing any of these geo criteria ids will not match. */
  var excludedGeoCriteriaIds: js.UndefOr[js.Array[String]] = js.native
  /** Requests containing any of these placements will not match. */
  var excludedPlacements: js.UndefOr[js.Array[Token]] = js.native
  /** Requests containing any of these users list ids will not match. */
  var excludedUserLists: js.UndefOr[js.Array[String]] = js.native
  /** Requests containing any of these vertical ids will not match. Values are from the publisher-verticals.txt file in the downloadable files section. */
  var excludedVerticals: js.UndefOr[js.Array[String]] = js.native
  /** Requests containing any of these geo criteria ids will match. */
  var geoCriteriaIds: js.UndefOr[js.Array[String]] = js.native
  /** Whether this config is active. Required for all requests. */
  var isActive: js.UndefOr[Boolean] = js.native
  /** The kind of the resource, i.e. "adexchangebuyer#pretargetingConfig". */
  var kind: js.UndefOr[String] = js.native
  /** Request containing any of these language codes will match. */
  var languages: js.UndefOr[js.Array[String]] = js.native
  /**
    * Requests where the predicted viewability is below the specified decile will not match. E.g. if the buyer sets this value to 5, requests from slots
    * where the predicted viewability is below 50% will not match. If the predicted viewability is unknown this field will be ignored.
    */
  var minimumViewabilityDecile: js.UndefOr[Double] = js.native
  /** Requests containing any of these mobile carrier ids will match. Values are from mobile-carriers.csv in the downloadable files section. */
  var mobileCarriers: js.UndefOr[js.Array[String]] = js.native
  /** Requests containing any of these mobile device ids will match. Values are from mobile-devices.csv in the downloadable files section. */
  var mobileDevices: js.UndefOr[js.Array[String]] = js.native
  /** Requests containing any of these mobile operating system version ids will match. Values are from mobile-os.csv in the downloadable files section. */
  var mobileOperatingSystemVersions: js.UndefOr[js.Array[String]] = js.native
  /** Requests containing any of these placements will match. */
  var placements: js.UndefOr[js.Array[Token]] = js.native
  /**
    * Requests matching any of these platforms will match. Possible values are PRETARGETING_PLATFORM_MOBILE, PRETARGETING_PLATFORM_DESKTOP, and
    * PRETARGETING_PLATFORM_TABLET.
    */
  var platforms: js.UndefOr[js.Array[String]] = js.native
  /**
    * Creative attributes should be declared here if all creatives corresponding to this pretargeting configuration have that creative attribute. Values are
    * from pretargetable-creative-attributes.txt in the downloadable files section.
    */
  var supportedCreativeAttributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Requests containing the specified type of user data will match. Possible values are HOSTED_MATCH_DATA, which means the request is cookie-targetable and
    * has a match in the buyer's hosted match table, and COOKIE_OR_IDFA, which means the request has either a targetable cookie or an iOS IDFA.
    */
  var userIdentifierDataRequired: js.UndefOr[js.Array[String]] = js.native
  /** Requests containing any of these user list ids will match. */
  var userLists: js.UndefOr[js.Array[String]] = js.native
  /** Requests that allow any of these vendor ids will match. Values are from vendors.txt in the downloadable files section. */
  var vendorTypes: js.UndefOr[js.Array[String]] = js.native
  /** Requests containing any of these vertical ids will match. */
  var verticals: js.UndefOr[js.Array[String]] = js.native
  /** Video requests satisfying any of these player size constraints will match. */
  var videoPlayerSizes: js.UndefOr[js.Array[AspectRatio]] = js.native
}

object PretargetingConfig {
  @scala.inline
  def apply(): PretargetingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PretargetingConfig]
  }
  @scala.inline
  implicit class PretargetingConfigOps[Self <: PretargetingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBillingId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingId")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configId")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configName")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeType(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeType")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensions(value: js.Array[Width]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludedContentLabels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedContentLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedContentLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedContentLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludedGeoCriteriaIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedGeoCriteriaIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedGeoCriteriaIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedGeoCriteriaIds")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludedPlacements(value: js.Array[Token]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedPlacements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedPlacements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedPlacements")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludedUserLists(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedUserLists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedUserLists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedUserLists")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludedVerticals(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedVerticals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedVerticals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedVerticals")(js.undefined)
        ret
    }
    @scala.inline
    def withGeoCriteriaIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoCriteriaIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeoCriteriaIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoCriteriaIds")(js.undefined)
        ret
    }
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.undefined)
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
    def withLanguages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumViewabilityDecile(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumViewabilityDecile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumViewabilityDecile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumViewabilityDecile")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileCarriers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileCarriers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileCarriers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileCarriers")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileDevices(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileOperatingSystemVersions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileOperatingSystemVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileOperatingSystemVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileOperatingSystemVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacements(value: js.Array[Token]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placements")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatforms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platforms")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedCreativeAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedCreativeAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedCreativeAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedCreativeAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withUserIdentifierDataRequired(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIdentifierDataRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserIdentifierDataRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIdentifierDataRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withUserLists(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserLists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLists")(js.undefined)
        ret
    }
    @scala.inline
    def withVendorTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVendorTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticals(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticals")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoPlayerSizes(value: js.Array[AspectRatio]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoPlayerSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoPlayerSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoPlayerSizes")(js.undefined)
        ret
    }
  }
  
}

