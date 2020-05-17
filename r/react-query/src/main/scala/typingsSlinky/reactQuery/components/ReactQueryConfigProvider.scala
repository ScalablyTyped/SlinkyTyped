package typingsSlinky.reactQuery.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactQuery.anon.ConfigReactQueryProviderConfig
import typingsSlinky.reactQuery.mod.ReactQueryProviderConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactQueryConfigProvider {
  @JSImport("react-query", "ReactQueryConfigProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactQuery.mod.ReactQueryConfigProvider] {
    @scala.inline
    def config(value: ReactQueryProviderConfig): this.type = set("config", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ConfigReactQueryProviderConfig): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactQueryConfigProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

