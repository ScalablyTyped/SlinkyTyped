package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.music
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.text_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined utility-types.utility-types.Diff<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.QuestionSticker, instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.InstaSticker> */
@js.native
trait DiffQuestionStickerInstaS extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var profilePicUrl: js.UndefOr[String] = js.native
  var question: String = js.native
  var questionType: js.UndefOr[text_ | music] = js.native
  var textColor: js.UndefOr[String] = js.native
  var viewerCanInteract: js.UndefOr[Boolean] = js.native
}

object DiffQuestionStickerInstaS {
  @scala.inline
  def apply(question: String): DiffQuestionStickerInstaS = {
    val __obj = js.Dynamic.literal(question = question.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffQuestionStickerInstaS]
  }
  @scala.inline
  implicit class DiffQuestionStickerInstaSOps[Self <: DiffQuestionStickerInstaS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withProfilePicUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profilePicUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfilePicUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profilePicUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withQuestionType(value: text_ | music): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("questionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuestionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("questionType")(js.undefined)
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
    def withViewerCanInteract(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewerCanInteract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewerCanInteract: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewerCanInteract")(js.undefined)
        ret
    }
  }
  
}

