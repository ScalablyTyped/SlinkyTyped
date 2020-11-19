package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.anchorLinkMod.AnchorLinkProps
import typingsSlinky.antd.anchorLinkMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AnchorLink {
  
  @JSImport("antd/lib/anchor/AnchorLink", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AnchorLinkProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(href: String): Builder = {
    val __props = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AnchorLinkProps]))
  }
}
