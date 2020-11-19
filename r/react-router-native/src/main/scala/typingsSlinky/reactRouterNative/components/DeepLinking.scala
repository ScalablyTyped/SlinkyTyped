package typingsSlinky.reactRouterNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DeepLinking {
  
  @JSImport("react-router-native", "DeepLinking")
  @js.native
  object component extends js.Object
  
  def withProps(p: js.Object): Default[tag.type, typingsSlinky.reactRouterNative.mod.DeepLinking] = new Default[tag.type, typingsSlinky.reactRouterNative.mod.DeepLinking](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: DeepLinking.type): Default[tag.type, typingsSlinky.reactRouterNative.mod.DeepLinking] = new Default[tag.type, typingsSlinky.reactRouterNative.mod.DeepLinking](js.Array(this.component, js.Dictionary.empty))()
}
