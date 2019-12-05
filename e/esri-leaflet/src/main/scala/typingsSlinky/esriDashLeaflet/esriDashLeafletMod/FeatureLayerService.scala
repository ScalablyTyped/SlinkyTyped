package typingsSlinky.esriDashLeaflet.esriDashLeafletMod

import typingsSlinky.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.FeatureLayerServiceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `L.esri.FeatureLayerService` is an abstraction for interacting with Feature Layers running on ArcGIS Online
  * and ArcGIS Server that allows you to make requests to the API, as well as query, add, update and remove
  * features from the service.
  */
@JSImport("esri-leaflet", "FeatureLayerService")
@js.native
class FeatureLayerService protected ()
  extends typingsSlinky.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.FeatureLayerService {
  def this(options: FeatureLayerServiceOptions) = this()
}

@JSImport("esri-leaflet", "featureLayerService")
@js.native
object featureLayerService extends js.Object {
  /**
    * `L.esri.FeatureLayerService` is an abstraction for interacting with Feature Layers running on ArcGIS Online
    * and ArcGIS Server that allows you to make requests to the API, as well as query, add, update and remove
    * features from the service.
    */
  def apply(options: FeatureLayerServiceOptions): typingsSlinky.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.FeatureLayerService = js.native
}

