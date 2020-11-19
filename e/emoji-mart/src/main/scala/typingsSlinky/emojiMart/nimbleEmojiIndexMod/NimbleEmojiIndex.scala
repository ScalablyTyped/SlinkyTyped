package typingsSlinky.emojiMart.nimbleEmojiIndexMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.emojiMart.emojiMartStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NimbleEmojiIndex extends js.Object {
  
  var emojis: StringDictionary[EmojiData] = js.native
  
  /** Mapping of string to keyof emojis */
  var emoticons: StringDictionary[String] = js.native
  
  def search(query: String): js.Array[EmojiData] | Null = js.native
  def search(query: _empty): Null = js.native
}
