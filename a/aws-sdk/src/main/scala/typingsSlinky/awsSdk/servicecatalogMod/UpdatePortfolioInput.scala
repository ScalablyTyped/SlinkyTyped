package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePortfolioInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The tags to add.
    */
  var AddTags: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AddTags] = js.native
  /**
    * The updated description of the portfolio.
    */
  var Description: js.UndefOr[PortfolioDescription] = js.native
  /**
    * The name to use for display purposes.
    */
  var DisplayName: js.UndefOr[PortfolioDisplayName] = js.native
  /**
    * The portfolio identifier.
    */
  var Id: typingsSlinky.awsSdk.servicecatalogMod.Id = js.native
  /**
    * The updated name of the portfolio provider.
    */
  var ProviderName: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProviderName] = js.native
  /**
    * The tags to remove.
    */
  var RemoveTags: js.UndefOr[TagKeys] = js.native
}

object UpdatePortfolioInput {
  @scala.inline
  def apply(Id: Id): UpdatePortfolioInput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePortfolioInput]
  }
  @scala.inline
  implicit class UpdatePortfolioInputOps[Self <: UpdatePortfolioInput] (val x: Self) extends AnyVal {
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
    def withDescription(value: PortfolioDescription): Self = {
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
    def withDisplayName(value: PortfolioDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderName(value: ProviderName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderName")(js.undefined)
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
  }
  
}

