package typingsSlinky.antdMobile.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.marqueeMod.MarqueeProps
import typingsSlinky.antdMobile.marqueeMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Marquee {
  
  @JSImport("antd-mobile/lib/notice-bar/Marquee", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fps(value: Double): this.type = set("fps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leading(value: Double): this.type = set("leading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def trailing(value: Double): this.type = set("trailing", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MarqueeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Marquee.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
