package typingsSlinky.esriLeaflet.mod.leafletAugmentingMod.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "esri.query")
@js.native
object query extends js.Object {
  
  /**
    * `L.esri.Query` is an abstraction for the query API included in Feature Layers and Image Services. It provides
    * a chainable API for building request parameters and executing queries.
    *
    * Note Depending on the type of service you are querying (Feature Layer, Map Service, Image Service) and the
    * version of ArcGIS Server that hosts the service some of these options may not be available.
    */
  def apply(options: QueryOptions): Query_ = js.native
}
