package typingsSlinky.oJs

import org.scalajs.dom.experimental.URL
import typingsSlinky.oJs.odataConfigMod.OdataConfig
import typingsSlinky.oJs.odataQueryMod.OdataQuery
import typingsSlinky.oJs.orequestMod.ORequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("o.js/dist/types/OBatch", JSImport.Namespace)
@js.native
object obatchMod extends js.Object {
  @js.native
  class OBatch protected () extends js.Object {
    def this(resources: js.Array[ORequest], config: OdataConfig) = this()
    def this(resources: js.Array[ORequest], config: OdataConfig, query: OdataQuery) = this()
    def this(
      resources: js.Array[ORequest],
      config: OdataConfig,
      query: js.UndefOr[scala.Nothing],
      changeset: Boolean
    ) = this()
    def this(resources: js.Array[ORequest], config: OdataConfig, query: OdataQuery, changeset: Boolean) = this()
    var batchBody: js.Any = js.native
    var batchConfig: js.Any = js.native
    var batchUid: js.Any = js.native
    var changeset: js.Any = js.native
    /**
      * If we determine a changset (POST, PUT, PATCH) we initalize a new
      * OBatch instance for it.
      */
    var checkForChangset: js.Any = js.native
    var getBody: js.Any = js.native
    var getChangeResources: js.Any = js.native
    var getGETResources: js.Any = js.native
    var getHeaders: js.Any = js.native
    var getUid: js.Any = js.native
    def fetch(url: URL): js.Promise[_] = js.native
    def parseResponse(responseData: String, contentTypeHeader: String): js.Any = js.native
  }
  
}

