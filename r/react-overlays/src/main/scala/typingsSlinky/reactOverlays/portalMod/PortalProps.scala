package typingsSlinky.reactOverlays.portalMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.reactOverlays.useWaitForDOMRefMod.DOMContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalProps extends js.Object {
  
  var children: ReactElement = js.native
  
  var container: DOMContainer[HTMLElement] = js.native
  
  var onRendered: js.UndefOr[js.Function1[/* element */ js.Any, Unit]] = js.native
}
object PortalProps {
  
  @scala.inline
  def apply(children: ReactElement): PortalProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
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
    def setContainerRefObject(value: ReactRef[HTMLElement]): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerHTMLElement(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerFunction0(value: () => HTMLElement | ReactRef[HTMLElement] | Null): Self = this.set("container", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContainer(value: DOMContainer[HTMLElement]): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
    
    @scala.inline
    def setOnRendered(value: /* element */ js.Any => Unit): Self = this.set("onRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRendered: Self = this.set("onRendered", js.undefined)
  }
}
