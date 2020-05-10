package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloodlightActivity extends js.Object {
  /** Account ID of this floodlight activity. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Advertiser ID of this floodlight activity. If this field is left blank, the value will be copied over either from the activity group's advertiser or
    * the existing activity's advertiser.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /** Dimension value for the ID of the advertiser. This is a read-only, auto-generated field. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  /**
    * Code type used for cache busting in the generated tag. Applicable only when floodlightActivityGroupType is COUNTER and countingMethod is
    * STANDARD_COUNTING or UNIQUE_COUNTING.
    */
  var cacheBustingType: js.UndefOr[String] = js.native
  /** Counting method for conversions for this floodlight activity. This is a required field. */
  var countingMethod: js.UndefOr[String] = js.native
  /** Dynamic floodlight tags. */
  var defaultTags: js.UndefOr[js.Array[FloodlightActivityDynamicTag]] = js.native
  /** URL where this tag will be deployed. If specified, must be less than 256 characters long. */
  var expectedUrl: js.UndefOr[String] = js.native
  /** Floodlight activity group ID of this floodlight activity. This is a required field. */
  var floodlightActivityGroupId: js.UndefOr[String] = js.native
  /** Name of the associated floodlight activity group. This is a read-only field. */
  var floodlightActivityGroupName: js.UndefOr[String] = js.native
  /** Tag string of the associated floodlight activity group. This is a read-only field. */
  var floodlightActivityGroupTagString: js.UndefOr[String] = js.native
  /** Type of the associated floodlight activity group. This is a read-only field. */
  var floodlightActivityGroupType: js.UndefOr[String] = js.native
  /**
    * Floodlight configuration ID of this floodlight activity. If this field is left blank, the value will be copied over either from the activity group's
    * floodlight configuration or from the existing activity's floodlight configuration.
    */
  var floodlightConfigurationId: js.UndefOr[String] = js.native
  /** Dimension value for the ID of the floodlight configuration. This is a read-only, auto-generated field. */
  var floodlightConfigurationIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  /** Whether this activity is archived. */
  var hidden: js.UndefOr[Boolean] = js.native
  /** ID of this floodlight activity. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.native
  /** Dimension value for the ID of this floodlight activity. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  /** Whether the image tag is enabled for this activity. */
  var imageTagEnabled: js.UndefOr[Boolean] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#floodlightActivity". */
  var kind: js.UndefOr[String] = js.native
  /** Name of this floodlight activity. This is a required field. Must be less than 129 characters long and cannot contain quotes. */
  var name: js.UndefOr[String] = js.native
  /** General notes or implementation instructions for the tag. */
  var notes: js.UndefOr[String] = js.native
  /** Publisher dynamic floodlight tags. */
  var publisherTags: js.UndefOr[js.Array[FloodlightActivityPublisherDynamicTag]] = js.native
  /** Whether this tag should use SSL. */
  var secure: js.UndefOr[Boolean] = js.native
  /** Whether the floodlight activity is SSL-compliant. This is a read-only field, its value detected by the system from the floodlight tags. */
  var sslCompliant: js.UndefOr[Boolean] = js.native
  /** Whether this floodlight activity must be SSL-compliant. */
  var sslRequired: js.UndefOr[Boolean] = js.native
  /** Subaccount ID of this floodlight activity. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[String] = js.native
  /** Tag format type for the floodlight activity. If left blank, the tag format will default to HTML. */
  var tagFormat: js.UndefOr[String] = js.native
  /**
    * Value of the cat= parameter in the floodlight tag, which the ad servers use to identify the activity. This is optional: if empty, a new tag string will
    * be generated for you. This string must be 1 to 8 characters long, with valid characters being [a-z][A-Z][0-9][-][ _ ]. This tag string must also be
    * unique among activities of the same activity group. This field is read-only after insertion.
    */
  var tagString: js.UndefOr[String] = js.native
  /**
    * List of the user-defined variables used by this conversion tag. These map to the "u[1-100]=" in the tags. Each of these can have a user defined type.
    * Acceptable values are U1 to U100, inclusive.
    */
  var userDefinedVariableTypes: js.UndefOr[js.Array[String]] = js.native
}

object FloodlightActivity {
  @scala.inline
  def apply(): FloodlightActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightActivity]
  }
  @scala.inline
  implicit class FloodlightActivityOps[Self <: FloodlightActivity] (val x: Self) extends AnyVal {
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
    def withCacheBustingType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheBustingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheBustingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheBustingType")(js.undefined)
        ret
    }
    @scala.inline
    def withCountingMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countingMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountingMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countingMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTags(value: js.Array[FloodlightActivityDynamicTag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTags")(js.undefined)
        ret
    }
    @scala.inline
    def withExpectedUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectedUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodlightActivityGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightActivityGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodlightActivityGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightActivityGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodlightActivityGroupTagString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityGroupTagString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightActivityGroupTagString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityGroupTagString")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodlightActivityGroupType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityGroupType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightActivityGroupType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityGroupType")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodlightConfigurationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightConfigurationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightConfigurationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightConfigurationId")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodlightConfigurationIdDimensionValue(value: DimensionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightConfigurationIdDimensionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightConfigurationIdDimensionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightConfigurationIdDimensionValue")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
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
    def withImageTagEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTagEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageTagEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTagEnabled")(js.undefined)
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
        ret
    }
    @scala.inline
    def withPublisherTags(value: js.Array[FloodlightActivityPublisherDynamicTag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublisherTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherTags")(js.undefined)
        ret
    }
    @scala.inline
    def withSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(js.undefined)
        ret
    }
    @scala.inline
    def withSslCompliant(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCompliant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslCompliant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCompliant")(js.undefined)
        ret
    }
    @scala.inline
    def withSslRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslRequired")(js.undefined)
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
    def withTagFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTagString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagString")(js.undefined)
        ret
    }
    @scala.inline
    def withUserDefinedVariableTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDefinedVariableTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDefinedVariableTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDefinedVariableTypes")(js.undefined)
        ret
    }
  }
  
}

