package typingsSlinky.popperjsCore.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.popperjsCore.typesMod.VirtualElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arrow extends js.Object {
  
  var arrow: js.UndefOr[HTMLElement] = js.native
  
  var popper: HTMLElement = js.native
  
  var reference: org.scalajs.dom.raw.Element | VirtualElement = js.native
}
object Arrow {
  
  @scala.inline
  def apply(popper: HTMLElement, reference: org.scalajs.dom.raw.Element | VirtualElement): Arrow = {
    val __obj = js.Dynamic.literal(popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arrow]
  }
  
  @scala.inline
  implicit class ArrowOps[Self <: Arrow] (val x: Self) extends AnyVal {
    
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
    def setPopper(value: HTMLElement): Self = this.set("popper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceElement(value: org.scalajs.dom.raw.Element): Self = this.set("reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference(value: org.scalajs.dom.raw.Element | VirtualElement): Self = this.set("reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrow(value: HTMLElement): Self = this.set("arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrow: Self = this.set("arrow", js.undefined)
  }
}
