package typingsSlinky.reactRouterDom.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactRouterDom.mod.HashRouterProps
import typingsSlinky.reactRouterDom.reactRouterDomStrings.hashbang
import typingsSlinky.reactRouterDom.reactRouterDomStrings.noslash
import typingsSlinky.reactRouterDom.reactRouterDomStrings.slash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HashRouter {
  
  @JSImport("react-router-dom", "HashRouter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactRouterDom.mod.HashRouter] {
    
    @scala.inline
    def basename(value: String): this.type = set("basename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit): this.type = set("getUserConfirmation", js.Any.fromFunction2(value))
    
    @scala.inline
    def hashType(value: slash | noslash | hashbang): this.type = set("hashType", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: HashRouter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HashRouterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
