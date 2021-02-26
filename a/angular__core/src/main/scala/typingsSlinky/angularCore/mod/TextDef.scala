package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDef extends StObject {
  
  var prefix: String = js.native
}
object TextDef {
  
  @scala.inline
  def apply(prefix: String): TextDef = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDef]
  }
  
  @scala.inline
  implicit class TextDefMutableBuilder[Self <: TextDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
  }
}
