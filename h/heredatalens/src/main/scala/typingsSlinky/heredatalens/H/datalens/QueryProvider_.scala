package typingsSlinky.heredatalens.H.datalens

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the source of the data for layers from a Data Lens query.
  * Providers define interfaces for layers to access data.  The input data can be stored locally or loaded from the network.
  * Data can be loaded by tiles or in one chunk. This provider loads query data with the Data Lens REST API.
  * Note that this provider must be used only for non-tiled queries.
  */
@js.native
trait QueryProvider_ extends Provider {
  
  /**
    * Fetches new data from the Data Lens REST API.
    * When data is fetched, the update event is triggered so that the consuming layers are redrawn.
    */
  def reload(): Unit = js.native
  
  /**
    * Updates the query ID to be used in the next call of the Data Lens REST API.
    * Note that new data will be fetched only after the reload method is called.
    */
  def setQueryId(queryId: String): Unit = js.native
  
  /**
    * Updates the query's dynamic parameters to be used in the next call of the Data Lens REST API.
    * Note that new data will be fetched only after the reload method is called.
    * This method is normally used when updating your visualization.
    * @param queryParams - Query dynamic parameters
    */
  def setQueryParams(): Unit = js.native
  def setQueryParams(queryParams: js.Any): Unit = js.native
}
