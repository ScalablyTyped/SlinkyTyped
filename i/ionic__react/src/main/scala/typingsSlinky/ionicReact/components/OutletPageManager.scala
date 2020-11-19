package typingsSlinky.ionicReact.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonRouterOutletElement
import typingsSlinky.ionicReact.outletPageManagerMod.OutletPageManagerProps
import typingsSlinky.ionicReact.outletPageManagerMod.default
import typingsSlinky.ionicReact.routeInfoMod.RouteInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OutletPageManager {
  
  @JSImport("@ionic/react/dist/types/routing/OutletPageManager", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def forwardedRef(value: ReactRef[HTMLIonRouterOutletElement]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def routeInfo(value: RouteInfo[_]): this.type = set("routeInfo", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OutletPageManagerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(StackManager: js.Any): Builder = {
    val __props = js.Dynamic.literal(StackManager = StackManager.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OutletPageManagerProps]))
  }
}
