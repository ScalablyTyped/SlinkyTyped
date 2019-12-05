package typingsSlinky.emojiDashMart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distDashEsUtilsSharedDashPropsMod {
  import typingsSlinky.emojiDashMart.Anon_Categories
  import typingsSlinky.emojiDashMart.emojiDashMartStrings.notfound
  import typingsSlinky.emojiDashMart.emojiDashMartStrings.search
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type BackgroundImageFn = js.Function2[/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize, String]
  type PartialI18n = Partial[(Pick[I18n, search | notfound]) with Anon_Categories]
}
