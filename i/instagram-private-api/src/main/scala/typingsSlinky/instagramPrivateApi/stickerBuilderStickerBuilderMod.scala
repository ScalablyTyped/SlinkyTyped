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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stickerBuilderStickerBuilderMod {
  
  @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder")
  @js.native
  class StickerBuilder () extends StObject {
    
    def add(sticker: InstaSticker): this.type = js.native
    
    def build(): StickerConfig = js.native
    
    var stickers: js.Any = js.native
  }
  /* static members */
  object StickerBuilder {
    
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.attachment")
    @js.native
    def attachment(options: StickerOptionsAttachmentS): AttachmentSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.attachmentFromMedia")
    @js.native
    def attachmentFromMedia(mediaInfo: User): AttachmentSticker = js.native
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.attachmentFromMedia")
    @js.native
    def attachmentFromMedia(mediaInfo: User, additional: PartialStickerOptionsAtta): AttachmentSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.chat")
    @js.native
    def chat(options: StickerOptionsChatSticker): ChatSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.countdown")
    @js.native
    def countdown(options: StickerOptionsCountdownSt): CountdownSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.hashtag")
    @js.native
    def hashtag(options: StickerOptionsHashtagStic): HashtagSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.location")
    @js.native
    def location(options: StickerOptionsLocationSti): LocationSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.mention")
    @js.native
    def mention(options: StickerOptionsMentionStic): MentionSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.mentionReel")
    @js.native
    def mentionReel(mediaInfo: User): MentionSticker = js.native
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.mentionReel")
    @js.native
    def mentionReel(mediaInfo: User, additional: PartialStickerOptionsMent): MentionSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.poll")
    @js.native
    def poll(options: StickerOptionsPollSticker): PollSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.question")
    @js.native
    def question(options: StickerOptionsQuestionSti): QuestionSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.quiz")
    @js.native
    def quiz(options: StickerOptionsQuizSticker): QuizSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.slider")
    @js.native
    def slider(options: StickerOptionsSliderStick): SliderSticker = js.native
  }
  
  type StickerConfig = js.Any with Storystickerids
  
  type StickerOptions[T /* <: InstaSticker */] = (Diff[T, InstaSticker]) with PartialInstaSticker
}
