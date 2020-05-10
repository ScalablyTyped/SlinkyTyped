package typingsSlinky.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomGallery extends js.Object {
  var account_url: String = js.native
  var item_count: Double = js.native
  var items: js.Array[GalleryItem] = js.native
  var link: String = js.native
  var tags: js.Array[String] = js.native
}

object CustomGallery {
  @scala.inline
  def apply(
    account_url: String,
    item_count: Double,
    items: js.Array[GalleryItem],
    link: String,
    tags: js.Array[String]
  ): CustomGallery = {
    val __obj = js.Dynamic.literal(account_url = account_url.asInstanceOf[js.Any], item_count = item_count.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomGallery]
  }
  @scala.inline
  implicit class CustomGalleryOps[Self <: CustomGallery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[GalleryItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

