package typingsSlinky.jasmineAjax

import org.scalajs.dom.raw.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JasmineAjaxParamParser extends StObject {
  
  def parse(paramString: String): js.Any = js.native
  
  def test(xhr: XMLHttpRequest): Boolean = js.native
}
object JasmineAjaxParamParser {
  
  @scala.inline
  def apply(parse: String => js.Any, test: XMLHttpRequest => Boolean): JasmineAjaxParamParser = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[JasmineAjaxParamParser]
  }
  
  @scala.inline
  implicit class JasmineAjaxParamParserMutableBuilder[Self <: JasmineAjaxParamParser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParse(value: String => js.Any): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTest(value: XMLHttpRequest => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
  }
}
