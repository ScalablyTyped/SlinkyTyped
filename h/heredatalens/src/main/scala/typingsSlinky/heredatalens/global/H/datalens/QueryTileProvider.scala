package typingsSlinky.heredatalens.global.H.datalens

import typingsSlinky.heredatalens.H.datalens.QueryTileProvider.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Providers define interfaces for layers to access data.
  * The input data can be stored locally or loaded from the network. Data can be loaded by tiles or in one chunk.
  * This provider loads tiled query data with the Data Lens REST API. Tiled queries are used to load data only for the current viewport.
  * This optimizes memory and network usage and enables progressive rendering.
  */
@JSGlobal("H.datalens.QueryTileProvider")
@js.native
class QueryTileProvider protected ()
  extends typingsSlinky.heredatalens.H.datalens.QueryTileProvider {
  /**
    * Constructor
    * @param service - Data Lens REST API service
    * @param options - Configures source query and data accessibility parameters
    */
  def this(service: typingsSlinky.heredatalens.H.datalens.Service, options: Options) = this()
}
