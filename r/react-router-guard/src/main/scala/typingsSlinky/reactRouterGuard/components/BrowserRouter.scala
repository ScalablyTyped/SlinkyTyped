package typingsSlinky.reactRouterGuard.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactRouterDom.mod.BrowserRouterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BrowserRouter {
  
  @JSImport("react-router-guard", "BrowserRouter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactRouterGuard.mod.BrowserRouter] {
    
    @scala.inline
    def basename(value: String): this.type = set("basename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def forceRefresh(value: Boolean): this.type = set("forceRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit): this.type = set("getUserConfirmation", js.Any.fromFunction2(value))
    
    @scala.inline
    def keyLength(value: Double): this.type = set("keyLength", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: BrowserRouter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BrowserRouterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
