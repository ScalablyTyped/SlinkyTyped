package typingsSlinky.rcUtil.portalWrapperMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalWrapperProps extends js.Object {
  
  def children(info: typingsSlinky.rcUtil.anon.GetContainer): ReactElement = js.native
  
  var forceRender: js.UndefOr[Boolean] = js.native
  
  var getContainer: js.UndefOr[GetContainer] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var wrapperClassName: js.UndefOr[String] = js.native
}
object PortalWrapperProps {
  
  @scala.inline
  def apply(children: typingsSlinky.rcUtil.anon.GetContainer => ReactElement): PortalWrapperProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[PortalWrapperProps]
  }
  
  @scala.inline
  implicit class PortalWrapperPropsOps[Self <: PortalWrapperProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: typingsSlinky.rcUtil.anon.GetContainer => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForceRender(value: Boolean): Self = this.set("forceRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceRender: Self = this.set("forceRender", js.undefined)
    
    @scala.inline
    def setGetContainerHTMLElement(value: HTMLElement): Self = this.set("getContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetContainerFunction0(value: () => HTMLElement): Self = this.set("getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContainer(value: GetContainer): Self = this.set("getContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetContainer: Self = this.set("getContainer", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWrapperClassName(value: String): Self = this.set("wrapperClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperClassName: Self = this.set("wrapperClassName", js.undefined)
  }
}
