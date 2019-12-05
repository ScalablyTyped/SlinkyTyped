package typingsSlinky.reactDashVirtualized.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashVirtualized.distEsMultiGridMod.MultiGridProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashVirtualized), Name(distEsMultiGridMod), Name(MultiGridProps))) was not a @ScalaJSDefined trait */
object MultiGrid
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashVirtualized.distEsMultiGridMod.MultiGrid] {
  @JSImport("react-virtualized/dist/es/MultiGrid", "MultiGrid")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = MultiGridProps
}

