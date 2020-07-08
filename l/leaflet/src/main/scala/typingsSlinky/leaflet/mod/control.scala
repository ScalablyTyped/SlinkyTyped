package typingsSlinky.leaflet.mod

import typingsSlinky.leaflet.mod.Control_.Attribution
import typingsSlinky.leaflet.mod.Control_.AttributionOptions
import typingsSlinky.leaflet.mod.Control_.Layers
import typingsSlinky.leaflet.mod.Control_.LayersObject
import typingsSlinky.leaflet.mod.Control_.LayersOptions
import typingsSlinky.leaflet.mod.Control_.Scale
import typingsSlinky.leaflet.mod.Control_.ScaleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "control")
@js.native
object control extends js.Object {
  def attribution(): Attribution = js.native
  def attribution(options: AttributionOptions): Attribution = js.native
  def layers(): Layers = js.native
  def layers(baseLayers: js.UndefOr[scala.Nothing], overlays: js.UndefOr[scala.Nothing], options: LayersOptions): Layers = js.native
  def layers(baseLayers: js.UndefOr[scala.Nothing], overlays: LayersObject): Layers = js.native
  def layers(baseLayers: js.UndefOr[scala.Nothing], overlays: LayersObject, options: LayersOptions): Layers = js.native
  def layers(baseLayers: LayersObject): Layers = js.native
  def layers(baseLayers: LayersObject, overlays: js.UndefOr[scala.Nothing], options: LayersOptions): Layers = js.native
  def layers(baseLayers: LayersObject, overlays: LayersObject): Layers = js.native
  def layers(baseLayers: LayersObject, overlays: LayersObject, options: LayersOptions): Layers = js.native
  def scale(): Scale = js.native
  def scale(options: ScaleOptions): Scale = js.native
  def zoom(): typingsSlinky.leaflet.mod.Control_.Zoom = js.native
  def zoom(options: typingsSlinky.leaflet.mod.Control_.ZoomOptions): typingsSlinky.leaflet.mod.Control_.Zoom = js.native
}

