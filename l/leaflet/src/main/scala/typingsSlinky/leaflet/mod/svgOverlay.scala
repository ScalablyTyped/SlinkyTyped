package typingsSlinky.leaflet.mod

import org.scalajs.dom.raw.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "svgOverlay")
@js.native
object svgOverlay extends js.Object {
  
  def apply(svgImage: String, bounds: LatLngBoundsExpression): SVGOverlay_ = js.native
  def apply(svgImage: String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions): SVGOverlay_ = js.native
  def apply(svgImage: SVGElement, bounds: LatLngBoundsExpression): SVGOverlay_ = js.native
  def apply(svgImage: SVGElement, bounds: LatLngBoundsExpression, options: ImageOverlayOptions): SVGOverlay_ = js.native
}
