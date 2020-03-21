package typingsSlinky.emojiMart

import typingsSlinky.emojiMart.dataMod.Data
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.BaseEmoji
import typingsSlinky.emojiMart.sharedPropsMod.EmojiSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emoji-mart/dist-es/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def getEmojiDataFromNative(nativeString: String, set: EmojiSet, data: Data): BaseEmoji = js.native
}

