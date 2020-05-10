package typingsSlinky.podcast.mod

import typingsSlinky.podcast.podcastStrings.bonus
import typingsSlinky.podcast.podcastStrings.full
import typingsSlinky.podcast.podcastStrings.trailer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item extends js.Object {
  var author: js.UndefOr[String] = js.native
  var categories: js.UndefOr[js.Array[String]] = js.native
  var content: js.UndefOr[String] = js.native
  var customElements: js.UndefOr[js.Array[js.Object]] = js.native
  var date: js.Date | String = js.native
  var description: js.UndefOr[String] = js.native
  var enclosure: js.UndefOr[ItemEnclosure] = js.native
  var guid: js.UndefOr[String] = js.native
  var itunesAuthor: js.UndefOr[String] = js.native
  var itunesDuration: js.UndefOr[Double] = js.native
  var itunesEpisode: js.UndefOr[Double] = js.native
  var itunesEpisodeType: js.UndefOr[full | trailer | bonus] = js.native
  var itunesExplicit: js.UndefOr[Boolean] = js.native
  var itunesImage: js.UndefOr[String] = js.native
  var itunesSeason: js.UndefOr[Double] = js.native
  var itunesSubtitle: js.UndefOr[String] = js.native
  var itunesSummary: js.UndefOr[String] = js.native
  var itunesTitle: js.UndefOr[String] = js.native
  var lat: js.UndefOr[Double] = js.native
  var long: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
  var url: String = js.native
}

object Item {
  @scala.inline
  def apply(date: js.Date | String, url: String): Item = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
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
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomElements(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customElements")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEnclosure(value: ItemEnclosure): Self = {
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
    def withItunesAuthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesAuthor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItunesAuthor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesAuthor")(js.undefined)
        ret
    }
    @scala.inline
    def withItunesDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItunesDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withItunesEpisode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesEpisode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItunesEpisode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesEpisode")(js.undefined)
        ret
    }
    @scala.inline
    def withItunesEpisodeType(value: full | trailer | bonus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesEpisodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItunesEpisodeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesEpisodeType")(js.undefined)
        ret
    }
    @scala.inline
    def withItunesExplicit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesExplicit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItunesExplicit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesExplicit")(js.undefined)
        ret
    }
    @scala.inline
    def withItunesImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItunesImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesImage")(js.undefined)
        ret
    }
    @scala.inline
    def withItunesSeason(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesSeason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItunesSeason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesSeason")(js.undefined)
        ret
    }
    @scala.inline
    def withItunesSubtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesSubtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItunesSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesSubtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withItunesSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItunesSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withItunesTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItunesTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesTitle")(js.undefined)
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
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

