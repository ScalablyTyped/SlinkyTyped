package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a remarketing list. Remarketing enables you to
  * create lists of users who have performed specific actions on a site, then
  * target ads to members of those lists. This resource can be used to manage
  * remarketing lists that are owned by your advertisers. To see all
  * remarketing lists that are visible to your advertisers, including those
  * that are shared to your advertiser or account, use the
  * TargetableRemarketingLists resource.
  */
@js.native
trait SchemaRemarketingList extends js.Object {
  /**
    * Account ID of this remarketing list. This is a read-only, auto-generated
    * field that is only returned in GET requests.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Whether this remarketing list is active.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Dimension value for the advertiser ID that owns this remarketing list.
    * This is a required field.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the advertiser. This is a read-only,
    * auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Remarketing list description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Remarketing list ID. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#remarketingList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Number of days that a user should remain in the remarketing list without
    * an impression. Acceptable values are 1 to 540, inclusive.
    */
  var lifeSpan: js.UndefOr[String] = js.native
  /**
    * Rule used to populate the remarketing list with users.
    */
  var listPopulationRule: js.UndefOr[SchemaListPopulationRule] = js.native
  /**
    * Number of users currently in the list. This is a read-only field.
    */
  var listSize: js.UndefOr[String] = js.native
  /**
    * Product from which this remarketing list was originated.
    */
  var listSource: js.UndefOr[String] = js.native
  /**
    * Name of the remarketing list. This is a required field. Must be no
    * greater than 128 characters long.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Subaccount ID of this remarketing list. This is a read-only,
    * auto-generated field that is only returned in GET requests.
    */
  var subaccountId: js.UndefOr[String] = js.native
}

object SchemaRemarketingList {
  @scala.inline
  def apply(): SchemaRemarketingList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemarketingList]
  }
  @scala.inline
  implicit class SchemaRemarketingListOps[Self <: SchemaRemarketingList] (val x: Self) extends AnyVal {
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
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
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
    def withLifeSpan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifeSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifeSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifeSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withListPopulationRule(value: SchemaListPopulationRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPopulationRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListPopulationRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPopulationRule")(js.undefined)
        ret
    }
    @scala.inline
    def withListSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listSize")(js.undefined)
        ret
    }
    @scala.inline
    def withListSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listSource")(js.undefined)
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
  }
  
}

