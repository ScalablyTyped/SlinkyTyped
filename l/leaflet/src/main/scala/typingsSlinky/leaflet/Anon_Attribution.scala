package typingsSlinky.leaflet

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.leaflet.leafletMod.Control
import typingsSlinky.leaflet.leafletMod.Control.AttributionOptions
import typingsSlinky.leaflet.leafletMod.Control.LayersObject
import typingsSlinky.leaflet.leafletMod.Control.LayersOptions
import typingsSlinky.leaflet.leafletMod.Control.ScaleOptions
import typingsSlinky.leaflet.leafletMod.Control.ZoomOptions
import typingsSlinky.leaflet.leafletMod.ControlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Attribution
  extends Instantiable0[Control]
     with Instantiable1[/* options */ ControlOptions, Control] {
  var Attribution: Instantiable1[
    js.UndefOr[/* options */ AttributionOptions], 
    typingsSlinky.leaflet.leafletMod.Control.Attribution
  ] = js.native
  var Layers: Instantiable3[
    js.UndefOr[/* baseLayers */ LayersObject], 
    js.UndefOr[/* overlays */ LayersObject], 
    js.UndefOr[/* options */ LayersOptions], 
    typingsSlinky.leaflet.leafletMod.Control.Layers
  ] = js.native
  var Scale: Instantiable1[
    js.UndefOr[/* options */ ScaleOptions], 
    typingsSlinky.leaflet.leafletMod.Control.Scale
  ] = js.native
  var Zoom: Instantiable1[
    js.UndefOr[/* options */ ZoomOptions], 
    typingsSlinky.leaflet.leafletMod.Control.Zoom
  ] = js.native
  def extend[T /* <: js.Object */](props: T): Anon_ArgsAny[T] with (/* import warning: importer.ImportType#apply Failed type conversion: typeof Control */ js.Any) = js.native
}

