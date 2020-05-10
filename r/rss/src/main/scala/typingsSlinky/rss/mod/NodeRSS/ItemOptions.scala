package typingsSlinky.rss.mod.NodeRSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemOptions extends js.Object {
  /**
    * If included it is the name of the item's creator. If not
    * provided the item author will be the same as the feed author.
    * This is typical except on multi-author blogs.
    */
  var author: js.UndefOr[String] = js.native
  /**
    * If provided, each array item will be added as a category
    * element.
    */
  var categories: js.UndefOr[js.Array[String]] = js.native
  /**
    * Put additional elements in the item (node-xml syntax).
    */
  var custom_elements: js.UndefOr[js.Array[_]] = js.native
  /**
    * The date and time of when the item was created. Feed
    * readers use this to determine the sort order. Some readers
    * will also use it to determine if the content should be
    * presented as unread.
    * Accepts Date object or string with any format
    * JS Date can parse.
    */
  var date: js.Date | String = js.native
  /**
    * Content for the item. Can contain HTML but link and image
    * URLs must be absolute path including hostname.
    */
  var description: String = js.native
  /**
    * An enclosure object.
    */
  var enclosure: js.UndefOr[EnclosureObject] = js.native
  /**
    * A unique string feed readers use to know if an item is
    * new or has already been seen. If you use a guid never
    * change it. If you don't provide a guid then your item
    * urls must be unique.
    * Defaults to url.
    */
  var guid: js.UndefOr[String] = js.native
  /**
    * The latitude coordinate of the item for GeoRSS.
    */
  var lat: js.UndefOr[Double] = js.native
  /**
    * The longitude coordinate of the item for GeoRSS.
    */
  var long: js.UndefOr[Double] = js.native
  /**
    * Title of this particular item.
    */
  var title: String = js.native
  /**
    * URL to the item. This could be a blog entry.
    */
  var url: String = js.native
}

object ItemOptions {
  @scala.inline
  def apply(date: js.Date | String, description: String, title: String, url: String): ItemOptions = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemOptions]
  }
  @scala.inline
  implicit class ItemOptionsOps[Self <: ItemOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: js.Date | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withAuthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(js.undefined)
        ret
    }
    @scala.inline
    def withCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom_elements(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_elements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_elements")(js.undefined)
        ret
    }
    @scala.inline
    def withEnclosure(value: EnclosureObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enclosure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnclosure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enclosure")(js.undefined)
        ret
    }
    @scala.inline
    def withGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(js.undefined)
        ret
    }
    @scala.inline
    def withLat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lat")(js.undefined)
        ret
    }
    @scala.inline
    def withLong(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLong: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long")(js.undefined)
        ret
    }
  }
  
}

