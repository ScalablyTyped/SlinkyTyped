package typingsSlinky.heredatalens.global.H.datalens

import typingsSlinky.heredatalens.H.datalens.QueryProvider.Options
import typingsSlinky.heredatalens.H.datalens.Service.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the source of the data for layers from a Data Lens query.
  * Providers define interfaces for layers to access data.  The input data can be stored locally or loaded from the network.
  * Data can be loaded by tiles or in one chunk. This provider loads query data with the Data Lens REST API.
  * Note that this provider must be used only for non-tiled queries.
  */
@JSGlobal("H.datalens.QueryProvider")
@js.native
class QueryProvider protected ()
  extends typingsSlinky.heredatalens.H.datalens.QueryProvider {
  /**
    * Constructor
    * @param service - Data Lens REST API service
    * @param options - Configures source query and data accessibility parameters
    */
  def this(data: Data) = this()
  def this(data: Data, options: Options) = this()
}
