package typingsSlinky.reactLeaflet.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactLeaflet.mod.LayersControl.ControlledLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Could't extract props from TypeRef(QualifiedName(IArray(Name(P))),IArray(),NoComments) because couldn't resolve ClassTree. */
object LayersControlControlledLayer
  extends ExternalComponentWithAttributesWithRefType[tag.type, ControlledLayer[js.Any]] {
  @JSImport("react-leaflet", "LayersControl.ControlledLayer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = js.Any
}

