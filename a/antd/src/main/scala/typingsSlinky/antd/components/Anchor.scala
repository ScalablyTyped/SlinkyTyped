package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.anchorAnchorMod.AnchorContainer
import typingsSlinky.antd.anchorAnchorMod.AnchorProps
import typingsSlinky.antd.anon.Href
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Anchor {
  
  @JSImport("antd", "Anchor")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antd.mod.Anchor] {
    
    @scala.inline
    def affix(value: Boolean): this.type = set("affix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bounds(value: Double): this.type = set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getContainer(value: () => AnchorContainer): this.type = set("getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def getCurrentAnchor(value: () => String): this.type = set("getCurrentAnchor", js.Any.fromFunction0(value))
    
    @scala.inline
    def offsetTop(value: Double): this.type = set("offsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* currentActiveLink */ String => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClick(value: (/* e */ SyntheticMouseEvent[HTMLElement], /* link */ Href) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showInkInFixed(value: Boolean): this.type = set("showInkInFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetOffset(value: Double): this.type = set("targetOffset", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Anchor.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AnchorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
