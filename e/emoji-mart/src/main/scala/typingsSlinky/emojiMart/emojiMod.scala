package typingsSlinky.emojiMart

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.emojiMart.sharedPropsMod.EmojiProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emojiMod extends Shortcut {
  
  @JSImport("emoji-mart/dist-es/components/emoji/emoji", JSImport.Default)
  @js.native
  val default: ReactComponentClass[EmojiProps] = js.native
  
  type _To = ReactComponentClass[EmojiProps]
  
  /* This means you don't have to write `default`, but can instead just say `emojiMod.foo` */
  override def _to: ReactComponentClass[EmojiProps] = default
}
