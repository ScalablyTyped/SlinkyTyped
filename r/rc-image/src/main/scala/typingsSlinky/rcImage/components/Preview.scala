package typingsSlinky.rcImage.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLLIElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcDialog.anon.X
import typingsSlinky.rcImage.previewMod.PreviewProps
import typingsSlinky.rcImage.rcImageBooleans.`false`
import typingsSlinky.rcUtil.portalWrapperMod.GetContainer
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Preview {
  
  @JSImport("rc-image/lib/Preview", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def afterClose(value: () => _): this.type = set("afterClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animation(value: js.Any): this.type = set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bodyProps(value: js.Any): this.type = set("bodyProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bodyStyle(value: js.Object): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def children(value: js.Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeIcon(value: ReactElement): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeIconReactElement(value: ReactElement): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def destroyOnClose(value: Boolean): this.type = set("destroyOnClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusTriggerAfterClose(value: Boolean): this.type = set("focusTriggerAfterClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footer(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footerReactElement(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getContainer(value: GetContainer | `false`): this.type = set("getContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getContainerFunction0(value: () => HTMLElement): this.type = set("getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def getContainerHTMLElement(value: HTMLElement): this.type = set("getContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyboard(value: Boolean): this.type = set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mask(value: Boolean): this.type = set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskAnimation(value: js.Any): this.type = set("maskAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskClosable(value: Boolean): this.type = set("maskClosable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskProps(value: js.Any): this.type = set("maskProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskStyle(value: js.Object): this.type = set("maskStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskTransitionName(value: String): this.type = set("maskTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def modalRender(value: /* node */ ReactElement => ReactElement): this.type = set("modalRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def mousePosition(value: X): this.type = set("mousePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClose(value: /* e */ SyntheticEvent[Event, HTMLDivElement | HTMLLIElement] => Unit): this.type = set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapClassName(value: String): this.type = set("wrapClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapProps(value: js.Any): this.type = set("wrapProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapStyle(value: js.Object): this.type = set("wrapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Preview.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PreviewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
