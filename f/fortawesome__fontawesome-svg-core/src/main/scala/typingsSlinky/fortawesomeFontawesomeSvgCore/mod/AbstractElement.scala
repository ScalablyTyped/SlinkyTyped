package typingsSlinky.fortawesomeFontawesomeSvgCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractElement extends StObject {
  
  var attributes: js.Any = js.native
  
  var children: js.UndefOr[js.Array[AbstractElement]] = js.native
  
  var tag: String = js.native
}
object AbstractElement {
  
  @scala.inline
  def apply(attributes: js.Any, tag: String): AbstractElement = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractElement]
  }
  
  @scala.inline
  implicit class AbstractElementMutableBuilder[Self <: AbstractElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: js.Array[AbstractElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: AbstractElement*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
