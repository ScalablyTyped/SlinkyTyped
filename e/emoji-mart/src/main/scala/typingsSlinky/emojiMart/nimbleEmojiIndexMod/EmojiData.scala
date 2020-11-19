package typingsSlinky.emojiMart.nimbleEmojiIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.emojiMart.nimbleEmojiIndexMod.BaseEmoji
  - typingsSlinky.emojiMart.nimbleEmojiIndexMod.CustomEmoji
*/
trait EmojiData extends EmojiEntry
object EmojiData {
  
  @scala.inline
  def BaseEmoji(
    colons: String,
    emoticons: js.Array[String],
    id: String,
    name: String,
    native: String,
    unified: String
  ): EmojiData = {
    val __obj = js.Dynamic.literal(colons = colons.asInstanceOf[js.Any], emoticons = emoticons.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], unified = unified.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmojiData]
  }
  
  @scala.inline
  def CustomEmoji(imageUrl: String, name: String, short_names: js.Array[String]): EmojiData = {
    val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short_names = short_names.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmojiData]
  }
}
