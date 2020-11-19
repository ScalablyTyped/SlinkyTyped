package typingsSlinky.heredatalens.H.datalens

import typingsSlinky.heredatalens.H.datalens.QueryTileProvider.TileParamNames
import typingsSlinky.heremaps.H.map.provider.RemoteTileProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Providers define interfaces for layers to access data.
  * The input data can be stored locally or loaded from the network. Data can be loaded by tiles or in one chunk.
  * This provider loads tiled query data with the Data Lens REST API. Tiled queries are used to load data only for the current viewport.
  * This optimizes memory and network usage and enables progressive rendering.
  */
@js.native
trait QueryTileProvider_ extends RemoteTileProvider {
  
  /**
    * Updates the query ID to be used in the next call of the Data Lens REST API.
    * Note that new data will be fetched only after the reload method is called.
    */
  def setQueryId(queryId: String): Unit = js.native
  
  /**
    * Updates the query's dynamic parameters to be used in the next call of the Data Lens REST API.
    * Note that new data will be fetched only after the reload method is called. This method is normally used when updating your visualization.
    */
  def setQueryParams(): Unit = js.native
  def setQueryParams(queryParams: js.Any): Unit = js.native
  
  /**
    * Updates the names of the dynamic parameters that defines tiles. This method is only needed when the query ID is updated.
    * Note that new data will be fetched only after the reload method is called.
    * @param tileParamNames - Names of the URI parameters that control the x/y/z of a tiled query
    */
  def setTileParamNames(tileParamNames: TileParamNames): Unit = js.native
}
