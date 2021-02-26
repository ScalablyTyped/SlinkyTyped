package typingsSlinky.hapiHapi.anon

import typingsSlinky.hapiHapi.mod.Util.Dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parser extends StObject {
  
  /**
    * the method must return an object where each key is a parameter and matching value is the parameter value.
    * If the method throws, the error is used as the response or returned when `request.setUrl` is called.
    */
  def parser(raw: Dictionary[String]): Dictionary[_] = js.native
}
object Parser {
  
  @scala.inline
  def apply(parser: Dictionary[String] => Dictionary[_]): Parser = {
    val __obj = js.Dynamic.literal(parser = js.Any.fromFunction1(parser))
    __obj.asInstanceOf[Parser]
  }
  
  @scala.inline
  implicit class ParserMutableBuilder[Self <: Parser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParser(value: Dictionary[String] => Dictionary[_]): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
  }
}
