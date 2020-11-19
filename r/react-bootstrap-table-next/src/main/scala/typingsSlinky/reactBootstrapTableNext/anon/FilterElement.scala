package typingsSlinky.reactBootstrapTableNext.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterElement extends js.Object {
  
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
  implicit class FilterElementOps[Self <: FilterElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFilterElement(value: ReactElement): Self = this.set("filterElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortElement(value: ReactElement): Self = this.set("sortElement", value.asInstanceOf[js.Any])
  }
}
