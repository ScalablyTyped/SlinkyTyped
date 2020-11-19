package typingsSlinky.emojiMart.nimbleEmojiIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.emojiMart.nimbleEmojiIndexMod.EmojiData
  - typingsSlinky.emojiMart.anon.variantinEmojiSkinEmojiDa
*/
trait EmojiEntry extends js.Object
object EmojiEntry {
  
  @scala.inline
  def variantinEmojiSkinEmojiDa(`1`: EmojiData, `2`: EmojiData, `3`: EmojiData, `4`: EmojiData, `5`: EmojiData, `6`: EmojiData): EmojiEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
    __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmojiEntry]
  }
  
  @scala.inline
  def BaseEmoji(
    colons: String,
    emoticons: js.Array[String],
    id: String,
    name: String,
    native: String,
    unified: String
  ): EmojiEntry = {
    val __obj = js.Dynamic.literal(colons = colons.asInstanceOf[js.Any], emoticons = emoticons.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], unified = unified.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmojiEntry]
  }
  
  @scala.inline
  def CustomEmoji(imageUrl: String, name: String, short_names: js.Array[String]): EmojiEntry = {
    val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short_names = short_names.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmojiEntry]
  }
}
