package typingsSlinky.reactNavigationCore.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ProviderProps
import typingsSlinky.reactNavigationCore.anon.Register
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSImport("@react-navigation/core/lib/typescript/src/EnsureSingleNavigator", "SingleNavigatorContext.Provider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def value(value: Register): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ProviderProps[js.UndefOr[Register]]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Provider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
