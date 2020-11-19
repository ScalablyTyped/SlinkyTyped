package typingsSlinky.catalog.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.catalog.anon.PartialTheme
import typingsSlinky.catalog.mod.Config
import typingsSlinky.catalog.mod.ConfigPageOrGroup
import typingsSlinky.catalog.mod.ConfigResponsiveSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Catalog {
  
  @JSImport("catalog", "Catalog")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.catalog.mod.Catalog] {
    
    @scala.inline
    def basePath(value: String): this.type = set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def logoSrc(value: String): this.type = set("logoSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def responsiveSizesVarargs(value: ConfigResponsiveSize*): this.type = set("responsiveSizes", js.Array(value :_*))
    
    @scala.inline
    def responsiveSizes(value: js.Array[ConfigResponsiveSize]): this.type = set("responsiveSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scriptsVarargs(value: String*): this.type = set("scripts", js.Array(value :_*))
    
    @scala.inline
    def scripts(value: js.Array[String]): this.type = set("scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stylesVarargs(value: String*): this.type = set("styles", js.Array(value :_*))
    
    @scala.inline
    def styles(value: js.Array[String]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: PartialTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useBrowserHistory(value: Boolean): this.type = set("useBrowserHistory", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Config): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(pages: js.Array[ConfigPageOrGroup], title: String): Builder = {
    val __props = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Config]))
  }
}
