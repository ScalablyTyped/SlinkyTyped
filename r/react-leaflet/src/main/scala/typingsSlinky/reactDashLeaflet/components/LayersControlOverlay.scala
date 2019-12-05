package typingsSlinky.reactDashLeaflet.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashLeaflet.reactDashLeafletMod.LayersControl.Overlay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(P))) was not a @ScalaJSDefined trait */
object LayersControlOverlay
  extends ExternalComponentWithAttributesWithRefType[tag.type, Overlay[js.Any]] {
  @JSImport("react-leaflet", "LayersControl.Overlay")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = js.Any
}

