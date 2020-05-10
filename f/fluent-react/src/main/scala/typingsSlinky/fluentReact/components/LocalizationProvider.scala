package typingsSlinky.fluentReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fluent.mod.FluentBundle
import typingsSlinky.fluentReact.mod.LocalizationProviderProps
import typingsSlinky.fluentReact.mod.Node
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LocalizationProvider {
  @JSImport("fluent-react", "LocalizationProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.fluentReact.mod.LocalizationProvider] {
    @scala.inline
    def parseMarkup(value: /* str */ String => js.Array[Node]): this.type = set("parseMarkup", js.Any.fromFunction1(value))
  }
  
  def withProps(p: LocalizationProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(bundles: IterableIterator[FluentBundle]): Builder = {
    val __props = js.Dynamic.literal(bundles = bundles.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LocalizationProviderProps]))
  }
}

