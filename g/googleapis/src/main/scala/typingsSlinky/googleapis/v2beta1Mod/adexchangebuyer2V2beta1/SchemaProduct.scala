package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Note: this resource requires whitelisting for access. Please contact your
  * account manager for access to Marketplace resources.  A product is a
  * segment of inventory that a seller wishes to sell. It is associated with
  * certain terms and targeting information which helps the buyer know more
  * about the inventory.
  */
@js.native
trait SchemaProduct extends js.Object {
  /**
    * The proposed end time for the deal. The field will be truncated to the
    * order of seconds during serving.
    */
  var availableEndTime: js.UndefOr[String] = js.native
  /**
    * Inventory availability dates. The start time will be truncated to seconds
    * during serving. Thus, a field specified as 3:23:34.456 (HH:mm:ss.SSS)
    * will be truncated to 3:23:34 when serving.
    */
  var availableStartTime: js.UndefOr[String] = js.native
  /**
    * Creation time.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Optional contact information for the creator of this product.
    */
  var creatorContacts: js.UndefOr[js.Array[SchemaContactInformation]] = js.native
  /**
    * The display name for this product as set by the seller.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * If the creator has already signed off on the product, then the buyer can
    * finalize the deal by accepting the product as is. When copying to a
    * proposal, if any of the terms are changed, then auto_finalize is
    * automatically set to false.
    */
  var hasCreatorSignedOff: js.UndefOr[Boolean] = js.native
  /**
    * The unique ID for the product.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * The revision number of the product (auto-assigned by Marketplace).
    */
  var productRevision: js.UndefOr[String] = js.native
  /**
    * An ID which can be used by the Publisher Profile API to get more
    * information about the seller that created this product.
    */
  var publisherProfileId: js.UndefOr[String] = js.native
  /**
    * Information about the seller that created this product.
    */
  var seller: js.UndefOr[SchemaSeller] = js.native
  /**
    * The syndication product associated with the deal.
    */
  var syndicationProduct: js.UndefOr[String] = js.native
  /**
    * Targeting that is shared between the buyer and the seller. Each targeting
    * criterion has a specified key and for each key there is a list of
    * inclusion value or exclusion values.
    */
  var targetingCriterion: js.UndefOr[js.Array[SchemaTargetingCriteria]] = js.native
  /**
    * The negotiable terms of the deal.
    */
  var terms: js.UndefOr[SchemaDealTerms] = js.native
  /**
    * Time of last update.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * The web-property code for the seller. This needs to be copied as is when
    * adding a new deal to a proposal.
    */
  var webPropertyCode: js.UndefOr[String] = js.native
}

object SchemaProduct {
  @scala.inline
  def apply(): SchemaProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProduct]
  }
  @scala.inline
  implicit class SchemaProductOps[Self <: SchemaProduct] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableEndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailableStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatorContacts(value: js.Array[SchemaContactInformation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatorContacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatorContacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatorContacts")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withHasCreatorSignedOff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCreatorSignedOff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasCreatorSignedOff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCreatorSignedOff")(js.undefined)
        ret
    }
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(js.undefined)
        ret
    }
    @scala.inline
    def withProductRevision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productRevision")(js.undefined)
        ret
    }
    @scala.inline
    def withPublisherProfileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherProfileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublisherProfileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherProfileId")(js.undefined)
        ret
    }
    @scala.inline
    def withSeller(value: SchemaSeller): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seller")(js.undefined)
        ret
    }
    @scala.inline
    def withSyndicationProduct(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syndicationProduct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyndicationProduct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syndicationProduct")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetingCriterion(value: js.Array[SchemaTargetingCriteria]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetingCriterion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetingCriterion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetingCriterion")(js.undefined)
        ret
    }
    @scala.inline
    def withTerms(value: SchemaDealTerms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terms")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withWebPropertyCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebPropertyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyCode")(js.undefined)
        ret
    }
  }
  
}

