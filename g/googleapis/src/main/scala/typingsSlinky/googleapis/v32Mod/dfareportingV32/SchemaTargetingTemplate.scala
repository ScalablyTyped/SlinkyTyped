package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a targeting template. A targeting template
  * encapsulates targeting information which can be reused across multiple ads.
  */
@js.native
trait SchemaTargetingTemplate extends js.Object {
  /**
    * Account ID of this targeting template. This field, if left unset, will be
    * auto-generated on insert and is read-only after insert.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Advertiser ID of this targeting template. This is a required field on
    * insert and is read-only after insert.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the advertiser. This is a read-only,
    * auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Time and day targeting criteria.
    */
  var dayPartTargeting: js.UndefOr[SchemaDayPartTargeting] = js.native
  /**
    * Geographical targeting criteria.
    */
  var geoTargeting: js.UndefOr[SchemaGeoTargeting] = js.native
  /**
    * ID of this targeting template. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Key-value targeting criteria.
    */
  var keyValueTargetingExpression: js.UndefOr[SchemaKeyValueTargetingExpression] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#targetingTemplate&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Language targeting criteria.
    */
  var languageTargeting: js.UndefOr[SchemaLanguageTargeting] = js.native
  /**
    * Remarketing list targeting criteria.
    */
  var listTargetingExpression: js.UndefOr[SchemaListTargetingExpression] = js.native
  /**
    * Name of this targeting template. This field is required. It must be less
    * than 256 characters long and unique within an advertiser.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Subaccount ID of this targeting template. This field, if left unset, will
    * be auto-generated on insert and is read-only after insert.
    */
  var subaccountId: js.UndefOr[String] = js.native
  /**
    * Technology platform targeting criteria.
    */
  var technologyTargeting: js.UndefOr[SchemaTechnologyTargeting] = js.native
}

object SchemaTargetingTemplate {
  @scala.inline
  def apply(): SchemaTargetingTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingTemplate]
  }
  @scala.inline
  implicit class SchemaTargetingTemplateOps[Self <: SchemaTargetingTemplate] (val x: Self) extends AnyVal {
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
    def withDayPartTargeting(value: SchemaDayPartTargeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPartTargeting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayPartTargeting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPartTargeting")(js.undefined)
        ret
    }
    @scala.inline
    def withGeoTargeting(value: SchemaGeoTargeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoTargeting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeoTargeting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoTargeting")(js.undefined)
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
    def withKeyValueTargetingExpression(value: SchemaKeyValueTargetingExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyValueTargetingExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyValueTargetingExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyValueTargetingExpression")(js.undefined)
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
    def withLanguageTargeting(value: SchemaLanguageTargeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageTargeting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageTargeting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageTargeting")(js.undefined)
        ret
    }
    @scala.inline
    def withListTargetingExpression(value: SchemaListTargetingExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listTargetingExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListTargetingExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listTargetingExpression")(js.undefined)
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
    def withTechnologyTargeting(value: SchemaTechnologyTargeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("technologyTargeting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTechnologyTargeting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("technologyTargeting")(js.undefined)
        ret
    }
  }
  
}

