package typingsSlinky.facebookJsSdk.facebook

import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.canvas_editor
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionAdsDialogParams extends InstantExperiencesAdsDialogParams {
  var account_id: String = js.native
  @JSName("canvas_id")
  var canvas_id_CollectionAdsDialogParams: js.UndefOr[scala.Nothing] = js.native
  var product_catalog_id: js.UndefOr[String] = js.native
  var product_set_id: js.UndefOr[String] = js.native
  var template_id: String = js.native
}

object CollectionAdsDialogParams {
  @scala.inline
  def apply(
    account_id: String,
    business_id: String,
    display: popup,
    method: canvas_editor,
    page_id: String,
    template_id: String
  ): CollectionAdsDialogParams = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any], business_id = business_id.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], page_id = page_id.asInstanceOf[js.Any], template_id = template_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionAdsDialogParams]
  }
  @scala.inline
  implicit class CollectionAdsDialogParamsOps[Self <: CollectionAdsDialogParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProduct_catalog_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product_catalog_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct_catalog_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product_catalog_id")(js.undefined)
        ret
    }
    @scala.inline
    def withProduct_set_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product_set_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct_set_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product_set_id")(js.undefined)
        ret
    }
  }
  
}

