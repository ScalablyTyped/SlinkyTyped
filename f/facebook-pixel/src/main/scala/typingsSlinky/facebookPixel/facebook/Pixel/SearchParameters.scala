package typingsSlinky.facebookPixel.facebook.Pixel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchParameters extends js.Object {
  var content_category: js.UndefOr[String] = js.native
  var content_ids: js.UndefOr[js.Array[String]] = js.native
  var currency: js.UndefOr[String] = js.native
  var search_string: js.UndefOr[String] = js.native
  var value: js.UndefOr[Double] = js.native
}

object SearchParameters {
  @scala.inline
  def apply(): SearchParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchParameters]
  }
  @scala.inline
  implicit class SearchParametersOps[Self <: SearchParameters] (val x: Self) extends AnyVal {
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
    def withSearch_string(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch_string: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_string")(js.undefined)
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

