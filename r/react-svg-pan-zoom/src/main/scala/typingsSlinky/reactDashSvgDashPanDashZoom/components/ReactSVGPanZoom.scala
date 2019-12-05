package typingsSlinky.reactDashSvgDashPanDashZoom.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashSvgDashPanDashZoom), Name(reactDashSvgDashPanDashZoomMod), Name(Props))) was not a @ScalaJSDefined trait */
object ReactSVGPanZoom
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomMod.ReactSVGPanZoom
    ] {
  @JSImport("react-svg-pan-zoom", "ReactSVGPanZoom")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = typingsSlinky.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomMod.Props
}

