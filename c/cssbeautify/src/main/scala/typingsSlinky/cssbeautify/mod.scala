package typingsSlinky.cssbeautify

import typingsSlinky.cssbeautify.cssbeautifyStrings.`end-of-line`
import typingsSlinky.cssbeautify.cssbeautifyStrings.`separate-line`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cssbeautify", JSImport.Namespace)
  @js.native
  def apply(cssText: String): String = js.native
  @JSImport("cssbeautify", JSImport.Namespace)
  @js.native
  def apply(cssText: String, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Always inserts a semicolon after the last ruleset(default is false)
      */
    var autosemicolon: js.UndefOr[Boolean] = js.native
    
    /**
      * A string used for the indentation of the declaration (default is 4
      * spaces).
      */
    var indent: js.UndefOr[String] = js.native
    
    /**
      * Defines the placement of open curly brace, either end-of-line (default)
      * or separate-line
      */
    var openbrace: js.UndefOr[`end-of-line` | `separate-line`] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutosemicolon(value: Boolean): Self = StObject.set(x, "autosemicolon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutosemicolonUndefined: Self = StObject.set(x, "autosemicolon", js.undefined)
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setOpenbrace(value: `end-of-line` | `separate-line`): Self = StObject.set(x, "openbrace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenbraceUndefined: Self = StObject.set(x, "openbrace", js.undefined)
    }
  }
}
