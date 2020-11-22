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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    
    def attachment(options: StickerOptionsAttachmentS): typingsSlinky.instagramPrivateApi.stickersMod.AttachmentSticker = js.native
    
    def attachmentFromMedia(mediaInfo: User): typingsSlinky.instagramPrivateApi.stickersMod.AttachmentSticker = js.native
    def attachmentFromMedia(mediaInfo: User, additional: PartialStickerOptionsAtta): typingsSlinky.instagramPrivateApi.stickersMod.AttachmentSticker = js.native
    
    def chat(options: StickerOptionsChatSticker): typingsSlinky.instagramPrivateApi.stickersMod.ChatSticker = js.native
    
    def countdown(options: StickerOptionsCountdownSt): typingsSlinky.instagramPrivateApi.stickersMod.CountdownSticker = js.native
    
    def hashtag(options: StickerOptionsHashtagStic): typingsSlinky.instagramPrivateApi.stickersMod.HashtagSticker = js.native
    
    def location(options: StickerOptionsLocationSti): typingsSlinky.instagramPrivateApi.stickersMod.LocationSticker = js.native
    
    def mention(options: StickerOptionsMentionStic): typingsSlinky.instagramPrivateApi.stickersMod.MentionSticker = js.native
    
    def mentionReel(mediaInfo: User): typingsSlinky.instagramPrivateApi.stickersMod.MentionSticker = js.native
    def mentionReel(mediaInfo: User, additional: PartialStickerOptionsMent): typingsSlinky.instagramPrivateApi.stickersMod.MentionSticker = js.native
    
    def poll(options: StickerOptionsPollSticker): typingsSlinky.instagramPrivateApi.stickersMod.PollSticker = js.native
    
    def question(options: StickerOptionsQuestionSti): typingsSlinky.instagramPrivateApi.stickersMod.QuestionSticker = js.native
    
    def quiz(options: StickerOptionsQuizSticker): typingsSlinky.instagramPrivateApi.stickersMod.QuizSticker = js.native
    
    def slider(options: StickerOptionsSliderStick): typingsSlinky.instagramPrivateApi.stickersMod.SliderSticker = js.native
  }
}
