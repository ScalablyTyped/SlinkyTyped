package typingsSlinky.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectPattern
  extends BaseNode
     with Pattern {
  
  var properties: js.Array[AssignmentProperty | RestElement] = js.native
  
  @JSName("type")
  var type_ObjectPattern: typingsSlinky.estree.estreeStrings.ObjectPattern = js.native
}
object ObjectPattern {
  
  @scala.inline
  def apply(
    properties: js.Array[AssignmentProperty | RestElement],
    `type`: typingsSlinky.estree.estreeStrings.ObjectPattern
  ): ObjectPattern = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPattern]
  }
  
  @scala.inline
  implicit class ObjectPatternMutableBuilder[Self <: ObjectPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: js.Array[AssignmentProperty | RestElement]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: (AssignmentProperty | RestElement)*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typingsSlinky.estree.estreeStrings.ObjectPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
