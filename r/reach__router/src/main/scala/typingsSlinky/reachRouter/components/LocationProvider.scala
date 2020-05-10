package typingsSlinky.reachRouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reachRouter.mod.History
import typingsSlinky.reachRouter.mod.LocationProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LocationProvider {
  @JSImport("@reach/router", "LocationProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reachRouter.mod.LocationProvider] {
    @scala.inline
    def history(value: History): this.type = set("history", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LocationProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: LocationProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

