package typingsSlinky.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedArguments
  extends /* key */ StringDictionary[js.Any] {
  
  var argv: js.Array[String] = js.native
  
  var rest: js.Array[String] = js.native
}
object ParsedArguments {
  
  @scala.inline
  def apply(argv: js.Array[String], rest: js.Array[String]): ParsedArguments = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedArguments]
  }
  
  @scala.inline
  implicit class ParsedArgumentsMutableBuilder[Self <: ParsedArguments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value :_*))
    
    @scala.inline
    def setRest(value: js.Array[String]): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestVarargs(value: String*): Self = StObject.set(x, "rest", js.Array(value :_*))
  }
}
