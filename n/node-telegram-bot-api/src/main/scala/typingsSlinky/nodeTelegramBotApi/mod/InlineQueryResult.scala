package typingsSlinky.nodeTelegramBotApi.mod

import typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.article
import typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.audio
import typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.contact
import typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.document
import typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.game
import typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.gif
import typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.location
import typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.mpeg4_gif
import typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.photo
import typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.sticker
import typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.venue
import typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.video
import typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.voice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultCachedAudio
  - typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultCachedDocument
  - typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultCachedGif
  - typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultCachedMpeg4Gif
  - typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultCachedPhoto
  - typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultCachedSticker
  - typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultCachedVideo
  - typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultCachedVoice
  - typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultArticle
  - typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultAudio
  - typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultContact
  - typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultGame
  - typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultDocument
  - typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultGif
  - typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultLocation
  - typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultMpeg4Gif
  - typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultPhoto
  - typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultVenue
  - typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultVideo
  - typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultVoice
*/
trait InlineQueryResult extends StObject
object InlineQueryResult {
  
  @scala.inline
  def InlineQueryResultArticle(id: String, input_message_content: InputMessageContent, title: String, `type`: article): typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultArticle = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], input_message_content = input_message_content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultArticle]
  }
  
  @scala.inline
  def InlineQueryResultAudio(audio_url: String, id: String, title: String, `type`: audio): typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultAudio = {
    val __obj = js.Dynamic.literal(audio_url = audio_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultAudio]
  }
  
  @scala.inline
  def InlineQueryResultCachedAudio(audio_file_id: String, id: String, `type`: audio): typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultCachedAudio = {
    val __obj = js.Dynamic.literal(audio_file_id = audio_file_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultCachedAudio]
  }
  
  @scala.inline
  def InlineQueryResultCachedDocument(document_file_id: String, id: String, title: String, `type`: document): typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultCachedDocument = {
    val __obj = js.Dynamic.literal(document_file_id = document_file_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultCachedDocument]
  }
  
  @scala.inline
  def InlineQueryResultCachedGif(gif_file_id: String, id: String, `type`: gif): typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultCachedGif = {
    val __obj = js.Dynamic.literal(gif_file_id = gif_file_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultCachedGif]
  }
  
  @scala.inline
  def InlineQueryResultCachedMpeg4Gif(id: String, mpeg4_file_id: String, `type`: mpeg4_gif): typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultCachedMpeg4Gif = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mpeg4_file_id = mpeg4_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultCachedMpeg4Gif]
  }
  
  @scala.inline
  def InlineQueryResultCachedPhoto(id: String, photo_file_id: String, `type`: photo): typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultCachedPhoto = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], photo_file_id = photo_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultCachedPhoto]
  }
  
  @scala.inline
  def InlineQueryResultCachedSticker(id: String, sticker_file_id: String, `type`: sticker): typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultCachedSticker = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sticker_file_id = sticker_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultCachedSticker]
  }
  
  @scala.inline
  def InlineQueryResultCachedVideo(id: String, title: String, `type`: video, video_file_id: String): typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultCachedVideo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], video_file_id = video_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultCachedVideo]
  }
  
  @scala.inline
  def InlineQueryResultCachedVoice(id: String, title: String, `type`: voice, voice_file_id: String): typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultCachedVoice = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], voice_file_id = voice_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultCachedVoice]
  }
  
  @scala.inline
  def InlineQueryResultContact(first_name: String, id: String, phone_number: String, `type`: contact): typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultContact = {
    val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultContact]
  }
  
  @scala.inline
  def InlineQueryResultDocument(document_url: String, id: String, mime_type: String, title: String, `type`: document): typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultDocument = {
    val __obj = js.Dynamic.literal(document_url = document_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultDocument]
  }
  
  @scala.inline
  def InlineQueryResultGame(game_short_name: String, id: String, `type`: game): typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultGame = {
    val __obj = js.Dynamic.literal(game_short_name = game_short_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultGame]
  }
  
  @scala.inline
  def InlineQueryResultGif(gif_url: String, id: String, `type`: gif): typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultGif = {
    val __obj = js.Dynamic.literal(gif_url = gif_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultGif]
  }
  
  @scala.inline
  def InlineQueryResultLocation(id: String, latitude: Double, longitude: Double, title: String, `type`: location): typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultLocation = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultLocation]
  }
  
  @scala.inline
  def InlineQueryResultMpeg4Gif(id: String, mpeg4_url: String, `type`: mpeg4_gif): typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultMpeg4Gif = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mpeg4_url = mpeg4_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultMpeg4Gif]
  }
  
  @scala.inline
  def InlineQueryResultPhoto(id: String, photo_url: String, thumb_url: String, `type`: photo): typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultPhoto = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], photo_url = photo_url.asInstanceOf[js.Any], thumb_url = thumb_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultPhoto]
  }
  
  @scala.inline
  def InlineQueryResultVenue(address: String, id: String, latitude: Double, longitude: Double, title: String, `type`: venue): typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultVenue = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultVenue]
  }
  
  @scala.inline
  def InlineQueryResultVideo(id: String, mime_type: String, thumb_url: String, title: String, `type`: video, video_url: String): typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultVideo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], thumb_url = thumb_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], video_url = video_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultVideo]
  }
  
  @scala.inline
  def InlineQueryResultVoice(id: String, title: String, `type`: voice, voice_url: String): typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultVoice = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], voice_url = voice_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeTelegramBotApi.mod.InlineQueryResultVoice]
  }
}
