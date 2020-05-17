package typingsSlinky.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvertiserName extends js.Object {
  var advertiserName: js.UndefOr[String] = js.native
  var destinationUrl: js.UndefOr[String] = js.native
  var displayFrequency: js.UndefOr[Double] = js.native
  var displaySeconds: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var html: js.UndefOr[String] = js.native
  var id: js.UndefOr[Double] = js.native
  var image: js.UndefOr[String] = js.native
  var imageMime: js.UndefOr[String] = js.native
  var imageUrl: js.UndefOr[String] = js.native
  var openInTrunk: js.UndefOr[Boolean] = js.native
  var score: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object AdvertiserName {
  @scala.inline
  def apply(): AdvertiserName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertiserName]
  }
  @scala.inline
  implicit class AdvertiserNameOps[Self <: AdvertiserName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvertiserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertiserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserName")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayFrequency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayFrequency")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplaySeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displaySeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplaySeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displaySeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withImageMime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageMime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageMime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageMime")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenInTrunk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openInTrunk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenInTrunk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openInTrunk")(js.undefined)
        ret
    }
    @scala.inline
    def withScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

