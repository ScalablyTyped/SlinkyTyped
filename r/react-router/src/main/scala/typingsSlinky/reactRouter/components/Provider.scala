package typingsSlinky.reactRouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.history.mod.LocationState
import typingsSlinky.react.mod.ProviderProps
import typingsSlinky.reactRouter.mod.RouteComponentProps
import typingsSlinky.reactRouter.mod.StaticContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSImport("react-router", "__RouterContext.Provider")
  @js.native
  object component extends js.Object
  
  def withProps(p: ProviderProps[RouteComponentProps[js.Object, StaticContext, LocationState]]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(value: RouteComponentProps[js.Object, StaticContext, LocationState]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[RouteComponentProps[js.Object, StaticContext, LocationState]]]))
  }
}
