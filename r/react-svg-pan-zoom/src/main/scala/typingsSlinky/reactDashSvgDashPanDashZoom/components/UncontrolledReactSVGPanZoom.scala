package typingsSlinky.reactDashSvgDashPanDashZoom.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomMod.UncontrolledProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashSvgDashPanDashZoom), Name(reactDashSvgDashPanDashZoomMod), Name(UncontrolledProps))) was not a @ScalaJSDefined trait */
object UncontrolledReactSVGPanZoom
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomMod.UncontrolledReactSVGPanZoom
    ] {
  @JSImport("react-svg-pan-zoom", "UncontrolledReactSVGPanZoom")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = UncontrolledProps
}

