package typingsSlinky.reactDashMapDashGl.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(T))) was not a @ScalaJSDefined trait */
object DraggableControl
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashMapDashGl.reactDashMapDashGlMod.DraggableControl[js.Any]
    ] {
  @JSImport("react-map-gl", "DraggableControl")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = js.Any
}

