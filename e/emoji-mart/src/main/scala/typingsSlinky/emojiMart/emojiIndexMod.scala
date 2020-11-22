package typingsSlinky.emojiMart

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.emojiMart.emojiMartStrings._empty
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.EmojiData
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.EmojiEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("emoji-mart/dist-es/utils/emoji-index/emoji-index", JSImport.Namespace)
@js.native
object emojiIndexMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    var emojis: StringDictionary[EmojiEntry] = js.native
    
    /** Mapping of string to keyof emojis */
    var emoticons: StringDictionary[String] = js.native
    
    def search(query: String): js.Array[EmojiData] | Null = js.native
    def search(query: _empty): Null = js.native
  }
}
