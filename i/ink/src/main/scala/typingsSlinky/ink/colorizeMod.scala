package typingsSlinky.ink

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorizeMod {
  
  @JSImport("ink/build/colorize", JSImport.Default)
  @js.native
  def default(str: String, color: js.UndefOr[scala.Nothing], `type`: ColorType): String = js.native
  @JSImport("ink/build/colorize", JSImport.Default)
  @js.native
  def default(str: String, color: String, `type`: ColorType): String = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ink.inkStrings.foreground
    - typingsSlinky.ink.inkStrings.background
  */
  trait ColorType extends StObject
  object ColorType {
    
    @scala.inline
    def background: typingsSlinky.ink.inkStrings.background = "background".asInstanceOf[typingsSlinky.ink.inkStrings.background]
    
    @scala.inline
    def foreground: typingsSlinky.ink.inkStrings.foreground = "foreground".asInstanceOf[typingsSlinky.ink.inkStrings.foreground]
  }
}
