package typingsSlinky.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Identifier
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  var name: String = js.native
  
  @JSName("type")
  var type_Identifier: typingsSlinky.cssTree.cssTreeStrings.Identifier = js.native
}
object Identifier {
  
  @scala.inline
  def apply(name: String, `type`: typingsSlinky.cssTree.cssTreeStrings.Identifier): Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier]
  }
  
  @scala.inline
  implicit class IdentifierMutableBuilder[Self <: Identifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.cssTree.cssTreeStrings.Identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
