package typingsSlinky.reactHelmetAsync.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactHelmetAsync.mod.ProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HelmetProvider {
  @JSImport("react-helmet-async", "HelmetProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactHelmetAsync.mod.HelmetProvider] {
    @scala.inline
    def context(value: js.Object): this.type = set("context", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: HelmetProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

