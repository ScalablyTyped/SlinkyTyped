package typingsSlinky.leaflet.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.leaflet.mod.ControlOptions
import typingsSlinky.leaflet.mod.Control_
import typingsSlinky.leaflet.mod.Control_.AttributionOptions
import typingsSlinky.leaflet.mod.Control_.LayersObject
import typingsSlinky.leaflet.mod.Control_.LayersOptions
import typingsSlinky.leaflet.mod.Control_.ScaleOptions
import typingsSlinky.leaflet.mod.Control_.ZoomOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attribution
  extends Instantiable0[Control_]
     with Instantiable1[/* options */ ControlOptions, Control_] {
  var Attribution: Instantiable1[
    /* options */ js.UndefOr[AttributionOptions], 
    typingsSlinky.leaflet.mod.Control_.Attribution
  ] = js.native
  var Layers: Instantiable3[
    /* baseLayers */ js.UndefOr[LayersObject], 
    /* overlays */ js.UndefOr[LayersObject], 
    /* options */ js.UndefOr[LayersOptions], 
    typingsSlinky.leaflet.mod.Control_.Layers
  ] = js.native
  var Scale: Instantiable1[/* options */ js.UndefOr[ScaleOptions], typingsSlinky.leaflet.mod.Control_.Scale] = js.native
  var Zoom: Instantiable1[/* options */ js.UndefOr[ZoomOptions], typingsSlinky.leaflet.mod.Control_.Zoom] = js.native
  def extend[T /* <: js.Object */](props: T): InstantiableT[T] with (/* import warning: importer.ImportType#apply Failed type conversion: typeof Control */ js.Any) = js.native
}

