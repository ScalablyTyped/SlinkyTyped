package typingsSlinky.ionicReact.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactRef
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.ionicReact.pageManagerMod.PageManagerProps
import typingsSlinky.ionicReact.pageManagerMod.default
import typingsSlinky.ionicReact.routeInfoMod.RouteInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PageManager {
  @JSImport("@ionic/react/dist/types/routing/PageManager", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def forwardedRef(value: ReactRef[HTMLDivElement]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    @scala.inline
    def routeInfo(value: RouteInfo[_]): this.type = set("routeInfo", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PageManagerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PageManager.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

