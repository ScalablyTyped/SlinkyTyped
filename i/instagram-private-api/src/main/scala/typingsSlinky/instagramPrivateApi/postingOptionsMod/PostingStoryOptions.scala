package typingsSlinky.instagramPrivateApi.postingOptionsMod

import typingsSlinky.instagramPrivateApi.anon.Storystickerids
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.once
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.replayable
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.story
import typingsSlinky.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryAttachedMedia
import typingsSlinky.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryChat
import typingsSlinky.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryCountdown
import typingsSlinky.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryHashtag
import typingsSlinky.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryMention
import typingsSlinky.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryPoll
import typingsSlinky.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryQuestion
import typingsSlinky.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryQuiz
import typingsSlinky.instagramPrivateApi.mediaConfigureStoryOptionsMod.StorySlider
import typingsSlinky.instagramPrivateApi.stickerBuilderMod.StickerBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostingStoryOptions extends js.Object {
  var caption: js.UndefOr[String] = js.native
  var chat: js.UndefOr[StoryChat] = js.native
  var countdown: js.UndefOr[StoryCountdown] = js.native
  var hashtags: js.UndefOr[js.Array[StoryHashtag]] = js.native
  var link: js.UndefOr[String] = js.native
  var location: js.UndefOr[PostingStoryLocationSticker] = js.native
  var media: js.UndefOr[StoryAttachedMedia] = js.native
  var mentions: js.UndefOr[js.Array[StoryMention]] = js.native
  var poll: js.UndefOr[StoryPoll] = js.native
  var question: js.UndefOr[StoryQuestion] = js.native
  var quiz: js.UndefOr[StoryQuiz] = js.native
  var recipientUsers: js.UndefOr[js.Array[String]] = js.native
  var replyType: js.UndefOr[story | String] = js.native
  var slider: js.UndefOr[StorySlider] = js.native
  var stickerConfig: js.UndefOr[(js.Any with Storystickerids) | StickerBuilder] = js.native
  var threadIds: js.UndefOr[js.Array[String]] = js.native
  var toBesties: js.UndefOr[Boolean] = js.native
  var viewMode: js.UndefOr[replayable | once | String] = js.native
}

object PostingStoryOptions {
  @scala.inline
  def apply(): PostingStoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostingStoryOptions]
  }
  @scala.inline
  implicit class PostingStoryOptionsOps[Self <: PostingStoryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
        ret
    }
    @scala.inline
    def withChat(value: StoryChat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chat")(js.undefined)
        ret
    }
    @scala.inline
    def withCountdown(value: StoryCountdown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countdown")(js.undefined)
        ret
    }
    @scala.inline
    def withHashtags(value: js.Array[StoryHashtag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashtags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtags")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: PostingStoryLocationSticker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia(value: StoryAttachedMedia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(js.undefined)
        ret
    }
    @scala.inline
    def withMentions(value: js.Array[StoryMention]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mentions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMentions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mentions")(js.undefined)
        ret
    }
    @scala.inline
    def withPoll(value: StoryPoll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poll")(js.undefined)
        ret
    }
    @scala.inline
    def withQuestion(value: StoryQuestion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("question")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuestion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("question")(js.undefined)
        ret
    }
    @scala.inline
    def withQuiz(value: StoryQuiz): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuiz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiz")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipientUsers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipientUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientUsers")(js.undefined)
        ret
    }
    @scala.inline
    def withReplyType(value: story | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyType")(js.undefined)
        ret
    }
    @scala.inline
    def withSlider(value: StorySlider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slider")(js.undefined)
        ret
    }
    @scala.inline
    def withStickerConfig(value: (js.Any with Storystickerids) | StickerBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickerConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickerConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickerConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withThreadIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreadIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadIds")(js.undefined)
        ret
    }
    @scala.inline
    def withToBesties(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBesties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToBesties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBesties")(js.undefined)
        ret
    }
    @scala.inline
    def withViewMode(value: replayable | once | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMode")(js.undefined)
        ret
    }
  }
  
}

