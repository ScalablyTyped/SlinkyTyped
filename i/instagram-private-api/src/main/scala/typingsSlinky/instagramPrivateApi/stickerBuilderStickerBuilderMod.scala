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
import typingsSlinky.instagramPrivateApi.anon.Storystickerids
import typingsSlinky.instagramPrivateApi.anon.User
import typingsSlinky.instagramPrivateApi.stickersMod.AttachmentSticker
import typingsSlinky.instagramPrivateApi.stickersMod.ChatSticker
import typingsSlinky.instagramPrivateApi.stickersMod.CountdownSticker
import typingsSlinky.instagramPrivateApi.stickersMod.HashtagSticker
import typingsSlinky.instagramPrivateApi.stickersMod.InstaSticker
import typingsSlinky.instagramPrivateApi.stickersMod.LocationSticker
import typingsSlinky.instagramPrivateApi.stickersMod.MentionSticker
import typingsSlinky.instagramPrivateApi.stickersMod.PollSticker
import typingsSlinky.instagramPrivateApi.stickersMod.QuestionSticker
import typingsSlinky.instagramPrivateApi.stickersMod.QuizSticker
import typingsSlinky.instagramPrivateApi.stickersMod.SliderSticker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", JSImport.Namespace)
@js.native
object stickerBuilderStickerBuilderMod extends js.Object {
  @js.native
  class StickerBuilder () extends js.Object {
    var stickers: js.Any = js.native
    def add(sticker: InstaSticker): this.type = js.native
    def build(): StickerConfig = js.native
  }
  
  /* static members */
  @js.native
  object StickerBuilder extends js.Object {
    def attachment(options: DiffAttachmentStickerInst): AttachmentSticker = js.native
    def attachmentFromMedia(mediaInfo: User): AttachmentSticker = js.native
    def attachmentFromMedia(mediaInfo: User, additional: PartialAttachmentSticker): AttachmentSticker = js.native
    def chat(options: DiffChatStickerInstaStick): ChatSticker = js.native
    def countdown(options: DiffCountdownStickerInsta): CountdownSticker = js.native
    def hashtag(options: DiffHashtagStickerInstaSt): HashtagSticker = js.native
    def location(options: DiffLocationStickerInstaS): LocationSticker = js.native
    def mention(options: DiffMentionStickerInstaSt): MentionSticker = js.native
    def mentionReel(mediaInfo: User): MentionSticker = js.native
    def mentionReel(mediaInfo: User, additional: PartialMentionSticker): MentionSticker = js.native
    def poll(options: DiffPollStickerInstaStick): PollSticker = js.native
    def question(options: DiffQuestionStickerInstaS): QuestionSticker = js.native
    def quiz(options: DiffQuizStickerInstaStick): QuizSticker = js.native
    def slider(options: DiffSliderStickerInstaSti): SliderSticker = js.native
  }
  
  type StickerConfig = js.Any with Storystickerids
}

