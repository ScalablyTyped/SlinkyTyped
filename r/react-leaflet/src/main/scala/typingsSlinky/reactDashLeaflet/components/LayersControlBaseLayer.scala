package typingsSlinky.reactDashLeaflet.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashLeaflet.reactDashLeafletMod.LayersControl.BaseLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(P))) was not a @ScalaJSDefined trait */
object LayersControlBaseLayer
  extends ExternalComponentWithAttributesWithRefType[tag.type, BaseLayer[js.Any]] {
  @JSImport("react-leaflet", "LayersControl.BaseLayer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = js.Any
}

