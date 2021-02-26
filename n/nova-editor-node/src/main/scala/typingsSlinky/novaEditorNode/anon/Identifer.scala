package typingsSlinky.novaEditorNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Identifer extends StObject {
  
  var identifer: String = js.native
  
  var name: String = js.native
}
object Identifer {
  
  @scala.inline
  def apply(identifer: String, name: String): Identifer = {
    val __obj = js.Dynamic.literal(identifer = identifer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifer]
  }
  
  @scala.inline
  implicit class IdentiferMutableBuilder[Self <: Identifer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifer(value: String): Self = StObject.set(x, "identifer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
