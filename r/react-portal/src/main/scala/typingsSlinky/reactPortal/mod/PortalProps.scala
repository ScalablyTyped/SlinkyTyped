package typingsSlinky.reactPortal.mod

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalProps
  extends Props[js.Any] {
  
  @JSName("children")
  var children_PortalProps: ReactElement = js.native
  
  var node: js.UndefOr[Element | Null] = js.native
}
object PortalProps {
  
  @scala.inline
  def apply(): PortalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalProps]
  }
  
  @scala.inline
  implicit class PortalPropsOps[Self <: PortalProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setNode(value: Element): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    
    @scala.inline
    def setNodeNull: Self = this.set("node", null)
  }
}
