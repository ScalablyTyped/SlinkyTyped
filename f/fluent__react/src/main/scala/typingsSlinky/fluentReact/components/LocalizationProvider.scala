package typingsSlinky.fluentReact.components

import org.scalajs.dom.raw.Node
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fluentBundle.mod.FluentBundle
import typingsSlinky.fluentReact.mod.LocalizationProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LocalizationProvider {
  
  @scala.inline
  def apply(bundles: js.Iterable[FluentBundle]): Builder = {
    val __props = js.Dynamic.literal(bundles = bundles.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LocalizationProviderProps]))
  }
  
  @JSImport("@fluent/react", "LocalizationProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.fluentReact.mod.LocalizationProvider] {
    
    @scala.inline
    def parseMarkup(value: /* str */ String => js.Array[Node]): this.type = set("parseMarkup", js.Any.fromFunction1(value))
  }
  
  def withProps(p: LocalizationProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
