package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Discount extends js.Object {
  var detail: String = js.native
  var end_time: String = js.native
  var photos: js.Array[Photo] = js.native
  var provider: String = js.native
  var sold_num: String = js.native
  var start_time: String = js.native
  var title: String = js.native
  var url: String = js.native
}

object Discount {
  @scala.inline
  def apply(
    detail: String,
    end_time: String,
    photos: js.Array[Photo],
    provider: String,
    sold_num: String,
    start_time: String,
    title: String,
    url: String
  ): Discount = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], sold_num = sold_num.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Discount]
  }
  @scala.inline
  implicit class DiscountOps[Self <: Discount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhotos(value: js.Array[Photo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSold_num(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sold_num")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

