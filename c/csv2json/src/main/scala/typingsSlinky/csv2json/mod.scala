package typingsSlinky.csv2json

import typingsSlinky.pumpify.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("csv2json", JSImport.Namespace)
  @js.native
  def apply(): ^ = js.native
  @JSImport("csv2json", JSImport.Namespace)
  @js.native
  def apply(options: Options): ^ = js.native
  
  @js.native
  trait Options extends StObject {
    
    var dynamicTyping: js.UndefOr[Boolean] = js.native
    
    var separator: js.UndefOr[String] = js.native
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
      def setDynamicTyping(value: Boolean): Self = StObject.set(x, "dynamicTyping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicTypingUndefined: Self = StObject.set(x, "dynamicTyping", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
}
