package typingsSlinky.draftConvert.anon

import slinky.core.facade.ReactElement
import typingsSlinky.draftConvert.mod._Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Element extends _Tag {
  
  var element: ReactElement = js.native
  
  var empty: js.UndefOr[ReactElement] = js.native
}
object Element {
  
  @scala.inline
  def apply(): Element = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
    
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
    def setElement(value: ReactElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setEmptyReactElement(value: ReactElement): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmpty(value: ReactElement): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
  }
}
