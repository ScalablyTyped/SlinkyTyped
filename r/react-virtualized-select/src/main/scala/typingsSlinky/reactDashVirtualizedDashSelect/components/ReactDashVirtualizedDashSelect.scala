package typingsSlinky.reactDashVirtualizedDashSelect.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashVirtualizedDashSelect.reactDashVirtualizedDashSelectMod.VirtualizedSelectProps
import typingsSlinky.reactDashVirtualizedDashSelect.reactDashVirtualizedDashSelectMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashVirtualizedDashSelect), Name(reactDashVirtualizedDashSelectMod), Name(VirtualizedSelectProps))) was not a @ScalaJSDefined trait */
object ReactDashVirtualizedDashSelect
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("react-virtualized-select", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = VirtualizedSelectProps[js.Any]
}

