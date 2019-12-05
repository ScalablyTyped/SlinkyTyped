package typingsSlinky.leafletDotGridlayerDotGooglemutant.leafletMod.gridLayer

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.leaflet.leafletMod.GridLayer
import typingsSlinky.leaflet.leafletMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleMutant extends GridLayer {
  def setElementSize(e: HTMLElement, size: Point): Unit = js.native
}

@JSImport("leaflet", "gridLayer.googleMutant")
@js.native
object googleMutant extends js.Object {
  def apply(): GoogleMutant = js.native
  def apply(options: GoogleMutantOptions): GoogleMutant = js.native
}

