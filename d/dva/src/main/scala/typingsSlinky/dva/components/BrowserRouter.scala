package typingsSlinky.dva.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactRouterDom.mod.BrowserRouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BrowserRouter {
  @JSImport("dva/router", "BrowserRouter")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.dva.routerMod.BrowserRouter] {
    @scala.inline
    def basename(value: String): this.type = set("basename", value.asInstanceOf[js.Any])
    @scala.inline
    def forceRefresh(value: Boolean): this.type = set("forceRefresh", value.asInstanceOf[js.Any])
    @scala.inline
    def getUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit): this.type = set("getUserConfirmation", js.Any.fromFunction2(value))
    @scala.inline
    def keyLength(value: Double): this.type = set("keyLength", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BrowserRouterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: BrowserRouter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

