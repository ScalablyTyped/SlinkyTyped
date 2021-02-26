package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.affixMod.AffixProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Affix {
  
  @JSImport("antd", "Affix")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antd.mod.Affix] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetBottom(value: Double): this.type = set("offsetBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetTop(value: Double): this.type = set("offsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* affixed */ js.UndefOr[Boolean] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def target(value: () => Window | HTMLElement | Null): this.type = set("target", js.Any.fromFunction0(value))
  }
  
  implicit def make(companion: Affix.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AffixProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
