package typingsSlinky.postcssSelectorParser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParserOptions extends StObject {
  
  var css: String = js.native
  
  def error(message: String, options: ErrorOptions): js.Error = js.native
  
  var options: Options = js.native
}
object ParserOptions {
  
  @scala.inline
  def apply(css: String, error: (String, ErrorOptions) => js.Error, options: Options): ParserOptions = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], error = js.Any.fromFunction2(error), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserOptions]
  }
  
  @scala.inline
  implicit class ParserOptionsMutableBuilder[Self <: ParserOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: (String, ErrorOptions) => js.Error): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
