package typingsSlinky.antDesignPro.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.anon.BlankTarget
import typingsSlinky.antDesignPro.globalFooterMod.GlobalFooterProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GlobalFooter {
  
  @JSImport("ant-design-pro", "GlobalFooter")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.mod.GlobalFooter] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def copyrightReactElement(value: ReactElement): this.type = set("copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def copyright(value: ReactElement): this.type = set("copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def linksVarargs(value: BlankTarget*): this.type = set("links", js.Array(value :_*))
    
    @scala.inline
    def links(value: js.Array[BlankTarget]): this.type = set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GlobalFooterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: GlobalFooter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
