package typingsSlinky.reactMdUtils.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMdUtils.resizeObserverMod.ResizeObserverProps
import typingsSlinky.reactMdUtils.useResizeObserverMod.ResizeObserverElementData
import typingsSlinky.reactMdUtils.useResizeObserverV1Mod.ResizeObserverTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResizeObserver {
  
  @JSImport("@react-md/utils", "ResizeObserver")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentFunctionComponent(value: ReactComponentClass[_]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentComponentClass(value: ReactComponentClass[_]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def component(value: ReactElement): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableHeight(value: Boolean): this.type = set("disableHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableWidth(value: Boolean): this.type = set("disableWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetHTMLElement(value: HTMLElement): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetFunction0(value: () => HTMLElement | Null): this.type = set("target", js.Any.fromFunction0(value))
    
    @scala.inline
    def target(value: ResizeObserverTarget[HTMLElement]): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetNull: this.type = set("target", null)
  }
  
  def withProps(p: ResizeObserverProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(onResize: /* resizeData */ ResizeObserverElementData[HTMLElement] => Unit): Builder = {
    val __props = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
    new Builder(js.Array(this.component, __props.asInstanceOf[ResizeObserverProps]))
  }
}
