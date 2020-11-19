package typingsSlinky.reactLinkify.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactLinkify.mod.MatchInfo
import typingsSlinky.reactLinkify.mod.Props
import typingsSlinky.reactLinkify.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactLinkify {
  
  @JSImport("react-linkify", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def componentDecorator(value: (/* decoratedHref */ String, /* decoratedText */ String, /* key */ Double) => ReactElement): this.type = set("componentDecorator", js.Any.fromFunction3(value))
    
    @scala.inline
    def hrefDecorator(value: /* urlHref */ String => String): this.type = set("hrefDecorator", js.Any.fromFunction1(value))
    
    @scala.inline
    def matchDecorator(value: /* text */ String => js.Array[MatchInfo] | Null): this.type = set("matchDecorator", js.Any.fromFunction1(value))
    
    @scala.inline
    def textDecorator(value: /* urlText */ String => String): this.type = set("textDecorator", js.Any.fromFunction1(value))
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactLinkify.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
