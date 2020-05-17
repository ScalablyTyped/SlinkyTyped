package typingsSlinky.emojiMart.nimbleEmojiIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.emojiMart.nimbleEmojiIndexMod.BaseEmoji
  - typingsSlinky.emojiMart.nimbleEmojiIndexMod.CustomEmoji
*/
trait EmojiData extends EmojiEntry

object EmojiData {
  @scala.inline
  implicit def apply(value: BaseEmoji): EmojiData = value.asInstanceOf[EmojiData]
  @scala.inline
  implicit def apply(value: CustomEmoji): EmojiData = value.asInstanceOf[EmojiData]
}

