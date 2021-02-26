package typingsSlinky.reactBootstrapTypeahead.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactBootstrapTypeahead.mod.LoaderProps
import typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadBsSizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Loader {
  
  @scala.inline
  def apply(bsSize: TypeaheadBsSizes): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(bsSize = bsSize.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[LoaderProps]))
  }
  
  @JSImport("react-bootstrap-typeahead", "Loader")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LoaderProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
