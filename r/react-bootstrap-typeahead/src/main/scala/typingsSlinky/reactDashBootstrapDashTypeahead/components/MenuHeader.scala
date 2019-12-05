package typingsSlinky.reactDashBootstrapDashTypeahead.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod.MenuHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashBootstrapDashTypeahead), Name(reactDashBootstrapDashTypeaheadMod), Name(MenuHeaderProps))) was not a @ScalaJSDefined trait */
object MenuHeader
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-bootstrap-typeahead", "Menu.Header")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = MenuHeaderProps
}

