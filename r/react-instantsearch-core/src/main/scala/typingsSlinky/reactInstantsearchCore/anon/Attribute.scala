package typingsSlinky.reactInstantsearchCore.anon

import typingsSlinky.reactInstantsearchCore.mod.RefinementValue
import typingsSlinky.reactInstantsearchCore.mod.SearchState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attribute extends StObject {
  
  var attribute: String = js.native
  
  var id: String = js.native
  
  var index: String = js.native
  
  var label: String = js.native
  
  var value: RefinementValue = js.native
}
object Attribute {
  
  @scala.inline
  def apply(
    attribute: String,
    id: String,
    index: String,
    label: String,
    value: /* searchState */ SearchState => SearchState
  ): Attribute = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[Attribute]
  }
  
  @scala.inline
  implicit class AttributeMutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: /* searchState */ SearchState => SearchState): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
  }
}
