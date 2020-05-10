package typingsSlinky.facebookPixel.facebook.Pixel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddToWishlistParameters extends js.Object {
  var content_category: js.UndefOr[String] = js.native
  var content_ids: js.UndefOr[js.Array[String]] = js.native
  var content_name: js.UndefOr[String] = js.native
  var currency: js.UndefOr[String] = js.native
  var value: js.UndefOr[Double] = js.native
}

object AddToWishlistParameters {
  @scala.inline
  def apply(): AddToWishlistParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddToWishlistParameters]
  }
  @scala.inline
  implicit class AddToWishlistParametersOps[Self <: AddToWishlistParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent_category(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_category: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_category")(js.undefined)
        ret
    }
    @scala.inline
    def withContent_ids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withContent_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_name")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

