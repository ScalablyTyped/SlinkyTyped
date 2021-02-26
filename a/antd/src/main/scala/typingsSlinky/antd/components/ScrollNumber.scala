package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.scrollNumberMod.ScrollNumberProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScrollNumber {
  
  @scala.inline
  def apply(show: Boolean): Builder = {
    val __props = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ScrollNumberProps]))
  }
  
  @JSImport("antd/lib/badge/ScrollNumber", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def component(value: String): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def count(value: String | Double): this.type = set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def countNull: this.type = set("count", null)
    
    @scala.inline
    def onAnimated(value: js.Function): this.type = set("onAnimated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String | Double): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleNull: this.type = set("title", null)
  }
  
  def withProps(p: ScrollNumberProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
