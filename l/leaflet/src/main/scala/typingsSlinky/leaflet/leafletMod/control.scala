package typingsSlinky.leaflet.leafletMod

import typingsSlinky.leaflet.leafletMod.Control.Attribution
import typingsSlinky.leaflet.leafletMod.Control.AttributionOptions
import typingsSlinky.leaflet.leafletMod.Control.Layers
import typingsSlinky.leaflet.leafletMod.Control.LayersObject
import typingsSlinky.leaflet.leafletMod.Control.LayersOptions
import typingsSlinky.leaflet.leafletMod.Control.Scale
import typingsSlinky.leaflet.leafletMod.Control.ScaleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "control")
@js.native
object control extends js.Object {
  def attribution(): Attribution = js.native
  def attribution(options: AttributionOptions): Attribution = js.native
  def layers(): Layers = js.native
  def layers(baseLayers: LayersObject): Layers = js.native
  def layers(baseLayers: LayersObject, overlays: LayersObject): Layers = js.native
  def layers(baseLayers: LayersObject, overlays: LayersObject, options: LayersOptions): Layers = js.native
  def scale(): Scale = js.native
  def scale(options: ScaleOptions): Scale = js.native
  def zoom(): typingsSlinky.leaflet.leafletMod.Control.Zoom = js.native
  def zoom(options: typingsSlinky.leaflet.leafletMod.Control.ZoomOptions): typingsSlinky.leaflet.leafletMod.Control.Zoom = js.native
}

