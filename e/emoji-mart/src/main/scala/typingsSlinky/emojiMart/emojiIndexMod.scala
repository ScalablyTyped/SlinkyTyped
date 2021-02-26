package typingsSlinky.emojiMart

import typingsSlinky.emojiMart.emojiMartStrings._empty
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.EmojiData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emojiIndexMod {
  
  object default {
    
    @JSImport("emoji-mart/dist-es/utils/emoji-index/emoji-index", "default.search")
    @js.native
    def search(query: String): js.Array[EmojiData] | Null = js.native
    @JSImport("emoji-mart/dist-es/utils/emoji-index/emoji-index", "default.search")
    @js.native
    def search(query: _empty): Null = js.native
    
    /** Mapping of string to keyof emojis */
    object emoticons
  }
}
