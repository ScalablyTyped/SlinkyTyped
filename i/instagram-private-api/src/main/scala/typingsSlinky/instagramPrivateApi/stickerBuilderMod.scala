package typingsSlinky.instagramPrivateApi

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
import typingsSlinky.instagramPrivateApi.anon.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stickerBuilderMod {
  
  @JSImport("instagram-private-api/dist/sticker-builder", "AttachmentSticker")
  @js.native
  class AttachmentSticker ()
    extends typingsSlinky.instagramPrivateApi.stickersMod.AttachmentSticker
  
  @JSImport("instagram-private-api/dist/sticker-builder", "ChatSticker")
  @js.native
  class ChatSticker ()
    extends typingsSlinky.instagramPrivateApi.stickersMod.ChatSticker
  
  @JSImport("instagram-private-api/dist/sticker-builder", "CountdownSticker")
  @js.native
  class CountdownSticker ()
    extends typingsSlinky.instagramPrivateApi.stickersMod.CountdownSticker
  
  @JSImport("instagram-private-api/dist/sticker-builder", "HashtagSticker")
  @js.native
  class HashtagSticker ()
    extends typingsSlinky.instagramPrivateApi.stickersMod.HashtagSticker
  
  @JSImport("instagram-private-api/dist/sticker-builder", "InstaSticker")
  @js.native
  abstract class InstaSticker ()
    extends typingsSlinky.instagramPrivateApi.stickersMod.InstaSticker
  
  @JSImport("instagram-private-api/dist/sticker-builder", "LocationSticker")
  @js.native
  class LocationSticker ()
    extends typingsSlinky.instagramPrivateApi.stickersMod.LocationSticker
  
  @JSImport("instagram-private-api/dist/sticker-builder", "MentionSticker")
  @js.native
  class MentionSticker ()
    extends typingsSlinky.instagramPrivateApi.stickersMod.MentionSticker
  
  @JSImport("instagram-private-api/dist/sticker-builder", "PollSticker")
  @js.native
  class PollSticker ()
    extends typingsSlinky.instagramPrivateApi.stickersMod.PollSticker
  
  @JSImport("instagram-private-api/dist/sticker-builder", "QuestionSticker")
  @js.native
  class QuestionSticker ()
    extends typingsSlinky.instagramPrivateApi.stickersMod.QuestionSticker
  
  @JSImport("instagram-private-api/dist/sticker-builder", "QuizSticker")
  @js.native
  class QuizSticker ()
    extends typingsSlinky.instagramPrivateApi.stickersMod.QuizSticker
  
  @JSImport("instagram-private-api/dist/sticker-builder", "SliderSticker")
  @js.native
  class SliderSticker ()
    extends typingsSlinky.instagramPrivateApi.stickersMod.SliderSticker
  
  @JSImport("instagram-private-api/dist/sticker-builder", "StickerBuilder")
  @js.native
  class StickerBuilder ()
    extends typingsSlinky.instagramPrivateApi.stickerBuilderStickerBuilderMod.StickerBuilder
  /* static members */
  object StickerBuilder {
    
    @JSImport("instagram-private-api/dist/sticker-builder", "StickerBuilder.attachment")
    @js.native
    def attachment(options: StickerOptionsAttachmentS): typingsSlinky.instagramPrivateApi.stickersMod.AttachmentSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder", "StickerBuilder.attachmentFromMedia")
    @js.native
    def attachmentFromMedia(mediaInfo: User): typingsSlinky.instagramPrivateApi.stickersMod.AttachmentSticker = js.native
    @JSImport("instagram-private-api/dist/sticker-builder", "StickerBuilder.attachmentFromMedia")
    @js.native
    def attachmentFromMedia(mediaInfo: User, additional: PartialStickerOptionsAtta): typingsSlinky.instagramPrivateApi.stickersMod.AttachmentSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder", "StickerBuilder.chat")
    @js.native
    def chat(options: StickerOptionsChatSticker): typingsSlinky.instagramPrivateApi.stickersMod.ChatSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder", "StickerBuilder.countdown")
    @js.native
    def countdown(options: StickerOptionsCountdownSt): typingsSlinky.instagramPrivateApi.stickersMod.CountdownSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder", "StickerBuilder.hashtag")
    @js.native
    def hashtag(options: StickerOptionsHashtagStic): typingsSlinky.instagramPrivateApi.stickersMod.HashtagSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder", "StickerBuilder.location")
    @js.native
    def location(options: StickerOptionsLocationSti): typingsSlinky.instagramPrivateApi.stickersMod.LocationSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder", "StickerBuilder.mention")
    @js.native
    def mention(options: StickerOptionsMentionStic): typingsSlinky.instagramPrivateApi.stickersMod.MentionSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder", "StickerBuilder.mentionReel")
    @js.native
    def mentionReel(mediaInfo: User): typingsSlinky.instagramPrivateApi.stickersMod.MentionSticker = js.native
    @JSImport("instagram-private-api/dist/sticker-builder", "StickerBuilder.mentionReel")
    @js.native
    def mentionReel(mediaInfo: User, additional: PartialStickerOptionsMent): typingsSlinky.instagramPrivateApi.stickersMod.MentionSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder", "StickerBuilder.poll")
    @js.native
    def poll(options: StickerOptionsPollSticker): typingsSlinky.instagramPrivateApi.stickersMod.PollSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder", "StickerBuilder.question")
    @js.native
    def question(options: StickerOptionsQuestionSti): typingsSlinky.instagramPrivateApi.stickersMod.QuestionSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder", "StickerBuilder.quiz")
    @js.native
    def quiz(options: StickerOptionsQuizSticker): typingsSlinky.instagramPrivateApi.stickersMod.QuizSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder", "StickerBuilder.slider")
    @js.native
    def slider(options: StickerOptionsSliderStick): typingsSlinky.instagramPrivateApi.stickersMod.SliderSticker = js.native
  }
}
