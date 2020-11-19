package typingsSlinky.antdMobile.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.listItemMod.BriefProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Brief {
  
  @JSImport("antd-mobile/lib/list/ListItem", "Brief")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobile.listItemMod.Brief] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrap(value: Boolean): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BriefProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Brief.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
