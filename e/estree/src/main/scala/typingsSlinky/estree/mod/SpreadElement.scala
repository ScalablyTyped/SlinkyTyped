package typingsSlinky.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadElement
  extends BaseNode
     with Node {
  
  var argument: Expression = js.native
  
  @JSName("type")
  var type_SpreadElement: typingsSlinky.estree.estreeStrings.SpreadElement = js.native
}
object SpreadElement {
  
  @scala.inline
  def apply(argument: Expression, `type`: typingsSlinky.estree.estreeStrings.SpreadElement): SpreadElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadElement]
  }
  
  @scala.inline
  implicit class SpreadElementMutableBuilder[Self <: SpreadElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.estree.estreeStrings.SpreadElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
