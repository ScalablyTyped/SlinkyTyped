package typingsSlinky.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.estree.mod.Node because Already inherited */ @js.native
trait Identifier
  extends BaseNode
     with Expression
     with Pattern {
  
  var name: String = js.native
  
  @JSName("type")
  var type_Identifier: typingsSlinky.estree.estreeStrings.Identifier = js.native
}
object Identifier {
  
  @scala.inline
  def apply(name: String, `type`: typingsSlinky.estree.estreeStrings.Identifier): Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier]
  }
  
  @scala.inline
  implicit class IdentifierMutableBuilder[Self <: Identifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.estree.estreeStrings.Identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
