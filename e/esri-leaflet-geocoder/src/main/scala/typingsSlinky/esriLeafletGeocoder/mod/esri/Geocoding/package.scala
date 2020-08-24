package typingsSlinky.esriLeafletGeocoder.mod.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Geocoding {
  type GeosearchCallback = js.Function2[/* error */ js.UndefOr[js.Any], /* results */ js.Any, scala.Unit]
  type GeosearchConstructor = org.scalablytyped.runtime.Instantiable1[
    /* options */ js.UndefOr[typingsSlinky.esriLeafletGeocoder.mod.esri.Geocoding.GeosearchObject], 
    typingsSlinky.esriLeafletGeocoder.mod.esri.Geocoding.Geosearch_
  ]
  type Geosearch_ = typingsSlinky.esriLeafletGeocoder.mod.esri.Geocoding.GeosearchControl with typingsSlinky.leaflet.mod.Evented
}
