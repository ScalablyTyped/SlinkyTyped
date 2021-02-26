package typingsSlinky.reactBootstrapTableNext.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterElement extends StObject {
  
  var filterElement: ReactElement = js.native
  
  var sortElement: ReactElement = js.native
}
object FilterElement {
  
  @scala.inline
  def apply(filterElement: ReactElement, sortElement: ReactElement): FilterElement = {
    val __obj = js.Dynamic.literal(filterElement = filterElement.asInstanceOf[js.Any], sortElement = sortElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterElement]
  }
  
  @scala.inline
  implicit class FilterElementMutableBuilder[Self <: FilterElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterElement(value: ReactElement): Self = StObject.set(x, "filterElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortElement(value: ReactElement): Self = StObject.set(x, "sortElement", value.asInstanceOf[js.Any])
  }
}
