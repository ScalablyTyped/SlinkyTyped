package typingsSlinky.reactDashLeaflet.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashLeaflet.reactDashLeafletMod.LayersControl.ControlledLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(P))) was not a @ScalaJSDefined trait */
object LayersControlControlledLayer
  extends ExternalComponentWithAttributesWithRefType[tag.type, ControlledLayer[js.Any]] {
  @JSImport("react-leaflet", "LayersControl.ControlledLayer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = js.Any
}

