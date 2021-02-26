package typingsSlinky.reactInstantsearchCore.anon

import typingsSlinky.reactInstantsearchCore.mod.RefinementValue
import typingsSlinky.reactInstantsearchCore.mod.SearchState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Label extends StObject {
  
  var label: String = js.native
  
  var value: RefinementValue = js.native
}
object Label {
  
  @scala.inline
  def apply(label: String, value: /* searchState */ SearchState => SearchState): Label = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: /* searchState */ SearchState => SearchState): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
  }
}
