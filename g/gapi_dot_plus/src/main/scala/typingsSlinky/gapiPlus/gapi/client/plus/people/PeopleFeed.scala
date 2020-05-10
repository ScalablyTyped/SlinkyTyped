package typingsSlinky.gapiPlus.gapi.client.plus.people

import typingsSlinky.gapiPlus.gapiPlusStrings.plusNumbersignpeopleFeed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Search response
@js.native
trait PeopleFeed extends js.Object {
  var etag: String = js.native
  var items: js.Array[Person] = js.native
  var kind: plusNumbersignpeopleFeed = js.native
  var nextPageToken: String = js.native
  var selfLink: String = js.native
  var title: String = js.native
  var totalItems: Double = js.native
}

object PeopleFeed {
  @scala.inline
  def apply(
    etag: String,
    items: js.Array[Person],
    kind: plusNumbersignpeopleFeed,
    nextPageToken: String,
    selfLink: String,
    title: String,
    totalItems: Double
  ): PeopleFeed = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], nextPageToken = nextPageToken.asInstanceOf[js.Any], selfLink = selfLink.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], totalItems = totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeopleFeed]
  }
  @scala.inline
  implicit class PeopleFeedOps[Self <: PeopleFeed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[Person]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: plusNumbersignpeopleFeed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

