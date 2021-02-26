package typingsSlinky.beautify

import typingsSlinky.beautify.beautifyStrings.css
import typingsSlinky.beautify.beautifyStrings.html
import typingsSlinky.beautify.beautifyStrings.js_
import typingsSlinky.beautify.beautifyStrings.json
import typingsSlinky.beautify.beautifyStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("beautify", JSImport.Namespace)
  @js.native
  def apply(content: String, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    var format: css | json | js_ | html | xml = js.native
  }
  object Options {
    
    @scala.inline
    def apply(format: css | json | js_ | html | xml): Options = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: css | json | js_ | html | xml): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
}
