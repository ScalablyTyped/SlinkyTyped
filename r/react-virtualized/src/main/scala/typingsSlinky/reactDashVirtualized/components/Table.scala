package typingsSlinky.reactDashVirtualized.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashVirtualized.distEsTableMod.TableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashVirtualized), Name(distEsTableMod), Name(TableProps))) was not a @ScalaJSDefined trait */
object Table
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashVirtualized.distEsTableMod.Table] {
  @JSImport("react-virtualized/dist/es/Table", "Table")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = TableProps
}

