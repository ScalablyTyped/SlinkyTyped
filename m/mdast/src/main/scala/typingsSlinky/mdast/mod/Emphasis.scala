package typingsSlinky.mdast.mod

import typingsSlinky.mdast.mdastStrings.emphasis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Emphasis
  extends Parent
     with StaticPhrasingContent {
  
  @JSName("children")
  var children_Emphasis: js.Array[PhrasingContent] = js.native
  
  @JSName("type")
  var type_Emphasis: emphasis = js.native
}
object Emphasis {
  
  @scala.inline
  def apply(children: js.Array[PhrasingContent], `type`: emphasis): Emphasis = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Emphasis]
  }
  
  @scala.inline
  implicit class EmphasisMutableBuilder[Self <: Emphasis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[PhrasingContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: PhrasingContent*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setType(value: emphasis): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
