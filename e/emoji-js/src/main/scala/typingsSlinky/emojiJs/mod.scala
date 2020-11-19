package typingsSlinky.emojiJs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.emojiJs.anon.Mask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("emoji-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class EmojiConvertor () extends js.Object {
    
    def addAliases(aliases: StringDictionary[String]): Unit = js.native
    
    var allow_caps: Boolean = js.native
    
    var allow_native: Boolean = js.native
    
    var avoid_ms_emoji: Boolean = js.native
    
    var colons_mode: Boolean = js.native
    
    var img_set: String = js.native
    
    var img_sets: StringDictionary[Mask] = js.native
    
    var img_suffix: String = js.native
    
    var include_text: Boolean = js.native
    
    var include_title: Boolean = js.native
    
    def removeAliases(aliases: js.Array[String]): Unit = js.native
    
    def replace_colons(str: String): String = js.native
    
    def replace_emoticons(str: String): String = js.native
    
    def replace_emoticons_with_colons(str: String): String = js.native
    
    var replace_mode: String = js.native
    
    def replace_unified(str: String): String = js.native
    
    var text_mode: Boolean = js.native
    
    var use_css_imgs: Boolean = js.native
    
    var use_sheet: Boolean = js.native
  }
}
