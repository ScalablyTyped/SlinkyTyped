package typingsSlinky.antDesignColors

import typingsSlinky.antDesignColors.antDesignColorsStrings.dark
import typingsSlinky.antDesignColors.antDesignColorsStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateMod {
  
  @JSImport("@ant-design/colors/dist/src/generate", JSImport.Default)
  @js.native
  def default(color: String): js.Array[String] = js.native
  @JSImport("@ant-design/colors/dist/src/generate", JSImport.Default)
  @js.native
  def default(color: String, opts: Opts): js.Array[String] = js.native
  
  @js.native
  trait Opts extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var theme: js.UndefOr[dark | default] = js.native
  }
  object Opts {
    
    @scala.inline
    def apply(): Opts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Opts]
    }
    
    @scala.inline
    implicit class OptsMutableBuilder[Self <: Opts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setTheme(value: dark | default): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
