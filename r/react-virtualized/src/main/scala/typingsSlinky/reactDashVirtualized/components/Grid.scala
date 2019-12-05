package typingsSlinky.reactDashVirtualized.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashVirtualized.distEsGridMod.GridProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashVirtualized), Name(distEsGridMod), Name(GridProps))) was not a @ScalaJSDefined trait */
object Grid
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashVirtualized.distEsGridMod.Grid] {
  @JSImport("react-virtualized/dist/es/Grid", "Grid")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = GridProps
}

