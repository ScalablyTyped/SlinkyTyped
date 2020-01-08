package typingsSlinky.instagramDashPrivateDashApi

import typingsSlinky.instagramDashPrivateDashApi.distStickerDashBuilderStickersChatDotStickerMod.ChatStickerOptions
import typingsSlinky.instagramDashPrivateDashApi.distStickerDashBuilderStickersCountdownDotStickerMod.CountdownStickerOptions
import typingsSlinky.instagramDashPrivateDashApi.distStickerDashBuilderStickersHashtagDotStickerMod.HashtagStickerOptions
import typingsSlinky.instagramDashPrivateDashApi.distStickerDashBuilderStickersLocationDotStickerMod.LocationStickerOptions
import typingsSlinky.instagramDashPrivateDashApi.distStickerDashBuilderStickersMentionDotStickerMod.MentionStickerOptions
import typingsSlinky.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.ChatSticker
import typingsSlinky.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.CountdownSticker
import typingsSlinky.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.HashtagSticker
import typingsSlinky.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.InstaSticker
import typingsSlinky.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.LocationSticker
import typingsSlinky.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.MentionSticker
import typingsSlinky.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.PollSticker
import typingsSlinky.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.QuestionSticker
import typingsSlinky.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.QuizSticker
import typingsSlinky.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.SliderSticker
import typingsSlinky.instagramDashPrivateDashApi.distStickerDashBuilderStickersPollDotStickerMod.PollStickerOptions
import typingsSlinky.instagramDashPrivateDashApi.distStickerDashBuilderStickersQuestionDotStickerMod.QuestionStickerOptions
import typingsSlinky.instagramDashPrivateDashApi.distStickerDashBuilderStickersQuizDotStickerMod.QuizStickerOptions
import typingsSlinky.instagramDashPrivateDashApi.distStickerDashBuilderStickersSliderDotStickerMod.SliderStickerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", JSImport.Namespace)
@js.native
object distStickerDashBuilderStickerDashBuilderMod extends js.Object {
  @js.native
  class StickerBuilder () extends js.Object {
    var stickers: js.Any = js.native
    def add(sticker: InstaSticker): this.type = js.native
    def build(): StickerConfig = js.native
  }
  
  /* static members */
  @js.native
  object StickerBuilder extends js.Object {
    def chat(options: ChatStickerOptions): ChatSticker = js.native
    def countdown(options: CountdownStickerOptions): CountdownSticker = js.native
    def hashtag(options: HashtagStickerOptions): HashtagSticker = js.native
    def location(options: LocationStickerOptions): LocationSticker = js.native
    def mention(options: MentionStickerOptions): MentionSticker = js.native
    def poll(options: PollStickerOptions): PollSticker = js.native
    def question(options: QuestionStickerOptions): QuestionSticker = js.native
    def quiz(options: QuizStickerOptions): QuizSticker = js.native
    def slider(options: SliderStickerOptions): SliderSticker = js.native
  }
  
  type StickerConfig = js.Any with Anon_Storystickerids
}

