package typingsSlinky.reactHelmet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactHelmet.mod.BodyProps
import typingsSlinky.reactHelmet.mod.HelmetProps
import typingsSlinky.reactHelmet.mod.HelmetTags
import typingsSlinky.reactHelmet.mod.HtmlProps
import typingsSlinky.reactHelmet.mod.LinkProps
import typingsSlinky.reactHelmet.mod.MetaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Helmet {
  
  @JSImport("react-helmet", "Helmet")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactHelmet.mod.Helmet] {
    
    @scala.inline
    def async(value: Boolean): this.type = set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def base(value: js.Any): this.type = set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bodyAttributes(value: BodyProps): this.type = set("bodyAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultTitle(value: String): this.type = set("defaultTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defer(value: Boolean): this.type = set("defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def encodeSpecialCharacters(value: Boolean): this.type = set("encodeSpecialCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def htmlAttributes(value: HtmlProps): this.type = set("htmlAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def link(value: js.Array[LinkProps]): this.type = set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def linkVarargs(value: LinkProps*): this.type = set("link", js.Array(value :_*))
    
    @scala.inline
    def meta(value: js.Array[MetaProps]): this.type = set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def metaVarargs(value: MetaProps*): this.type = set("meta", js.Array(value :_*))
    
    @scala.inline
    def noscript(value: js.Array[_]): this.type = set("noscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def noscriptVarargs(value: js.Any*): this.type = set("noscript", js.Array(value :_*))
    
    @scala.inline
    def onChangeClientState(value: (/* newState */ js.Any, /* addedTags */ HelmetTags, /* removedTags */ HelmetTags) => Unit): this.type = set("onChangeClientState", js.Any.fromFunction3(value))
    
    @scala.inline
    def script(value: js.Array[_]): this.type = set("script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scriptVarargs(value: js.Any*): this.type = set("script", js.Array(value :_*))
    
    @scala.inline
    def style(value: js.Array[_]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleVarargs(value: js.Any*): this.type = set("style", js.Array(value :_*))
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleAttributes(value: js.Object): this.type = set("titleAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleTemplate(value: String): this.type = set("titleTemplate", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Helmet.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HelmetProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
