package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProductInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The tags to add to the product.
    */
  var AddTags: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AddTags] = js.native
  /**
    * The updated description of the product.
    */
  var Description: js.UndefOr[ProductViewShortDescription] = js.native
  /**
    * The updated distributor of the product.
    */
  var Distributor: js.UndefOr[ProductViewOwner] = js.native
  /**
    * The product identifier.
    */
  var Id: typingsSlinky.awsSdk.servicecatalogMod.Id = js.native
  /**
    * The updated product name.
    */
  var Name: js.UndefOr[ProductViewName] = js.native
  /**
    * The updated owner of the product.
    */
  var Owner: js.UndefOr[ProductViewOwner] = js.native
  /**
    * The tags to remove from the product.
    */
  var RemoveTags: js.UndefOr[TagKeys] = js.native
  /**
    * The updated support description for the product.
    */
  var SupportDescription: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.SupportDescription] = js.native
  /**
    * The updated support email for the product.
    */
  var SupportEmail: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.SupportEmail] = js.native
  /**
    * The updated support URL for the product.
    */
  var SupportUrl: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.SupportUrl] = js.native
}

object UpdateProductInput {
  @scala.inline
  def apply(Id: Id): UpdateProductInput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProductInput]
  }
  @scala.inline
  implicit class UpdateProductInputOps[Self <: UpdateProductInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAcceptLanguage(value: AcceptLanguage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withAddTags(value: AddTags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddTags")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: ProductViewShortDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withDistributor(value: ProductViewOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Distributor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistributor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Distributor")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ProductViewName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: ProductViewOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveTags(value: TagKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveTags")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportDescription(value: SupportDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportEmail(value: SupportEmail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportUrl(value: SupportUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportUrl")(js.undefined)
        ret
    }
  }
  
}

