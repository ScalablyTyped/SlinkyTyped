package typingsSlinky.amazonProductApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IItemLookupOptions extends js.Object {
  var condition: js.UndefOr[String] = js.native
  var domain: js.UndefOr[String] = js.native
  var idType: js.UndefOr[String] = js.native
  var includeReviewsSummary: js.UndefOr[Boolean] = js.native
  var itemId: js.UndefOr[String | js.Array[String]] = js.native
  var request: js.UndefOr[js.Function] = js.native
  var responseGroup: js.UndefOr[String] = js.native
  var searchIndex: js.UndefOr[String] = js.native
  var truncateReviewsAt: js.UndefOr[Double] = js.native
  var variationPage: js.UndefOr[String] = js.native
}

object IItemLookupOptions {
  @scala.inline
  def apply(): IItemLookupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IItemLookupOptions]
  }
  @scala.inline
  implicit class IItemLookupOptionsOps[Self <: IItemLookupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withIdType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idType")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeReviewsSummary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeReviewsSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeReviewsSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeReviewsSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withItemId(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncateReviewsAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncateReviewsAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncateReviewsAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncateReviewsAt")(js.undefined)
        ret
    }
    @scala.inline
    def withVariationPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variationPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariationPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variationPage")(js.undefined)
        ret
    }
  }
  
}

