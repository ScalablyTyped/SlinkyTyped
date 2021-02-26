package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.baseMod.CustomSanitizer
import typingsSlinky.expressValidator.baseMod.StandardSanitizer
import typingsSlinky.expressValidator.contextItemMod.ContextItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sanitizationMod {
  
  @JSImport("express-validator/src/context-items/sanitization", "Sanitization")
  @js.native
  class Sanitization protected () extends ContextItem {
    def this(sanitizer: CustomSanitizer | StandardSanitizer, custom: Boolean) = this()
    def this(sanitizer: CustomSanitizer | StandardSanitizer, custom: Boolean, options: js.Array[_]) = this()
    
    val custom: js.Any = js.native
    
    val options: js.Any = js.native
    
    val sanitizer: js.Any = js.native
  }
}
