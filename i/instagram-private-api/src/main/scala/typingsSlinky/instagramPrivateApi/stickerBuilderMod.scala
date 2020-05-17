package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.anon.DiffAttachmentStickerInst
import typingsSlinky.instagramPrivateApi.anon.DiffChatStickerInstaStick
import typingsSlinky.instagramPrivateApi.anon.DiffCountdownStickerInsta
import typingsSlinky.instagramPrivateApi.anon.DiffHashtagStickerInstaSt
import typingsSlinky.instagramPrivateApi.anon.DiffLocationStickerInstaS
import typingsSlinky.instagramPrivateApi.anon.DiffMentionStickerInstaSt
import typingsSlinky.instagramPrivateApi.anon.DiffPollStickerInstaStick
import typingsSlinky.instagramPrivateApi.anon.DiffQuestionStickerInstaS
import typingsSlinky.instagramPrivateApi.anon.DiffQuizStickerInstaStick
import typingsSlinky.instagramPrivateApi.anon.DiffSliderStickerInstaSti
import typingsSlinky.instagramPrivateApi.anon.PartialAttachmentSticker
import typingsSlinky.instagramPrivateApi.anon.PartialMentionSticker
import typingsSlinky.instagramPrivateApi.anon.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/sticker-builder", JSImport.Namespace)
@js.native
object stickerBuilderMod extends js.Object {
  @js.native
  class AttachmentSticker ()
    extends typingsSlinky.instagramPrivateApi.attachmentStickerMod.AttachmentSticker
  
  @js.native
  class ChatSticker ()
    extends typingsSlinky.instagramPrivateApi.chatStickerMod.ChatSticker
  
  @js.native
  class CountdownSticker ()
    extends typingsSlinky.instagramPrivateApi.countdownStickerMod.CountdownSticker
  
  @js.native
  class HashtagSticker ()
    extends typingsSlinky.instagramPrivateApi.hashtagStickerMod.HashtagSticker
  
  @js.native
  abstract class InstaSticker ()
    extends typingsSlinky.instagramPrivateApi.instaStickerMod.InstaSticker
  
  @js.native
  class LocationSticker ()
    extends typingsSlinky.instagramPrivateApi.locationStickerMod.LocationSticker
  
  @js.native
  class MentionSticker ()
    extends typingsSlinky.instagramPrivateApi.mentionStickerMod.MentionSticker
  
  @js.native
  class PollSticker ()
    extends typingsSlinky.instagramPrivateApi.pollStickerMod.PollSticker
  
  @js.native
  class QuestionSticker ()
    extends typingsSlinky.instagramPrivateApi.questionStickerMod.QuestionSticker
  
  @js.native
  class QuizSticker ()
    extends typingsSlinky.instagramPrivateApi.quizStickerMod.QuizSticker
  
  @js.native
  class SliderSticker ()
    extends typingsSlinky.instagramPrivateApi.sliderStickerMod.SliderSticker
  
  @js.native
  class StickerBuilder ()
    extends typingsSlinky.instagramPrivateApi.stickerBuilderStickerBuilderMod.StickerBuilder
  
  /* static members */
  @js.native
  object StickerBuilder extends js.Object {
    def attachment(options: DiffAttachmentStickerInst): typingsSlinky.instagramPrivateApi.stickersMod.AttachmentSticker = js.native
    def attachmentFromMedia(mediaInfo: User): typingsSlinky.instagramPrivateApi.stickersMod.AttachmentSticker = js.native
    def attachmentFromMedia(mediaInfo: User, additional: PartialAttachmentSticker): typingsSlinky.instagramPrivateApi.stickersMod.AttachmentSticker = js.native
    def chat(options: DiffChatStickerInstaStick): typingsSlinky.instagramPrivateApi.stickersMod.ChatSticker = js.native
    def countdown(options: DiffCountdownStickerInsta): typingsSlinky.instagramPrivateApi.stickersMod.CountdownSticker = js.native
    def hashtag(options: DiffHashtagStickerInstaSt): typingsSlinky.instagramPrivateApi.stickersMod.HashtagSticker = js.native
    def location(options: DiffLocationStickerInstaS): typingsSlinky.instagramPrivateApi.stickersMod.LocationSticker = js.native
    def mention(options: DiffMentionStickerInstaSt): typingsSlinky.instagramPrivateApi.stickersMod.MentionSticker = js.native
    def mentionReel(mediaInfo: User): typingsSlinky.instagramPrivateApi.stickersMod.MentionSticker = js.native
    def mentionReel(mediaInfo: User, additional: PartialMentionSticker): typingsSlinky.instagramPrivateApi.stickersMod.MentionSticker = js.native
    def poll(options: DiffPollStickerInstaStick): typingsSlinky.instagramPrivateApi.stickersMod.PollSticker = js.native
    def question(options: DiffQuestionStickerInstaS): typingsSlinky.instagramPrivateApi.stickersMod.QuestionSticker = js.native
    def quiz(options: DiffQuizStickerInstaStick): typingsSlinky.instagramPrivateApi.stickersMod.QuizSticker = js.native
    def slider(options: DiffSliderStickerInstaSti): typingsSlinky.instagramPrivateApi.stickersMod.SliderSticker = js.native
  }
  
}

