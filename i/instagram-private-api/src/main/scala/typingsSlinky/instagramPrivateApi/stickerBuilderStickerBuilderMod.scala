package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.anon.PartialInstaSticker
import typingsSlinky.instagramPrivateApi.anon.PartialStickerOptionsAtta
import typingsSlinky.instagramPrivateApi.anon.PartialStickerOptionsMent
import typingsSlinky.instagramPrivateApi.anon.StickerOptionsAttachmentS
import typingsSlinky.instagramPrivateApi.anon.StickerOptionsChatSticker
import typingsSlinky.instagramPrivateApi.anon.StickerOptionsCountdownSt
import typingsSlinky.instagramPrivateApi.anon.StickerOptionsHashtagStic
import typingsSlinky.instagramPrivateApi.anon.StickerOptionsLocationSti
import typingsSlinky.instagramPrivateApi.anon.StickerOptionsMentionStic
import typingsSlinky.instagramPrivateApi.anon.StickerOptionsPollSticker
import typingsSlinky.instagramPrivateApi.anon.StickerOptionsQuestionSti
import typingsSlinky.instagramPrivateApi.anon.StickerOptionsQuizSticker
import typingsSlinky.instagramPrivateApi.anon.StickerOptionsSliderStick
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
import typingsSlinky.utilityTypes.mappedTypesMod.Diff
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
    def attachment(options: StickerOptionsAttachmentS): AttachmentSticker = js.native
    def attachmentFromMedia(mediaInfo: User): AttachmentSticker = js.native
    def attachmentFromMedia(mediaInfo: User, additional: PartialStickerOptionsAtta): AttachmentSticker = js.native
    def chat(options: StickerOptionsChatSticker): ChatSticker = js.native
    def countdown(options: StickerOptionsCountdownSt): CountdownSticker = js.native
    def hashtag(options: StickerOptionsHashtagStic): HashtagSticker = js.native
    def location(options: StickerOptionsLocationSti): LocationSticker = js.native
    def mention(options: StickerOptionsMentionStic): MentionSticker = js.native
    def mentionReel(mediaInfo: User): MentionSticker = js.native
    def mentionReel(mediaInfo: User, additional: PartialStickerOptionsMent): MentionSticker = js.native
    def poll(options: StickerOptionsPollSticker): PollSticker = js.native
    def question(options: StickerOptionsQuestionSti): QuestionSticker = js.native
    def quiz(options: StickerOptionsQuizSticker): QuizSticker = js.native
    def slider(options: StickerOptionsSliderStick): SliderSticker = js.native
  }
  
  type StickerConfig = js.Any with Storystickerids
  type StickerOptions[T /* <: InstaSticker */] = (Diff[T, InstaSticker]) with PartialInstaSticker
}

