package typingsSlinky.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined utility-types.utility-types.Diff<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.SliderSticker, instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.InstaSticker> */
@js.native
trait DiffSliderStickerInstaSti extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var emoji: String = js.native
  var question: String = js.native
  var sliderVoteAverage: js.UndefOr[Double] = js.native
  var sliderVoteCount: js.UndefOr[Double] = js.native
  var textColor: js.UndefOr[String] = js.native
  var viewerCanVote: js.UndefOr[Boolean] = js.native
  var viewerVote: js.UndefOr[Double] = js.native
}

object DiffSliderStickerInstaSti {
  @scala.inline
  def apply(emoji: String, question: String): DiffSliderStickerInstaSti = {
    val __obj = js.Dynamic.literal(emoji = emoji.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffSliderStickerInstaSti]
  }
  @scala.inline
  implicit class DiffSliderStickerInstaStiOps[Self <: DiffSliderStickerInstaSti] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmoji(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emoji")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuestion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("question")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSliderVoteAverage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderVoteAverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliderVoteAverage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderVoteAverage")(js.undefined)
        ret
    }
    @scala.inline
    def withSliderVoteCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderVoteCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliderVoteCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderVoteCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(js.undefined)
        ret
    }
    @scala.inline
    def withViewerCanVote(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewerCanVote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewerCanVote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewerCanVote")(js.undefined)
        ret
    }
    @scala.inline
    def withViewerVote(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewerVote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewerVote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewerVote")(js.undefined)
        ret
    }
  }
  
}

