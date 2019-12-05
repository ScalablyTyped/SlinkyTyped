package typingsSlinky.oDotJs

import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.URL
import typingsSlinky.oDotJs.distTypesOdataConfigMod.OdataConfig
import typingsSlinky.oDotJs.distTypesOdataQueryMod.OdataQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("o.js", JSImport.Namespace)
@js.native
object oDotJsMod extends js.Object {
  @js.native
  class OBatch protected ()
    extends typingsSlinky.oDotJs.distTypesOBatchMod.OBatch {
    def this(resources: js.Array[typingsSlinky.oDotJs.distTypesORequestMod.ORequest], config: OdataConfig) = this()
    def this(
      resources: js.Array[typingsSlinky.oDotJs.distTypesORequestMod.ORequest],
      config: OdataConfig,
      query: OdataQuery
    ) = this()
    def this(
      resources: js.Array[typingsSlinky.oDotJs.distTypesORequestMod.ORequest],
      config: OdataConfig,
      query: OdataQuery,
      changeset: Boolean
    ) = this()
  }
  
  @js.native
  class OHandler protected ()
    extends typingsSlinky.oDotJs.distTypesOHandlerMod.OHandler {
    def this(config: OdataConfig) = this()
  }
  
  @js.native
  class ORequest protected ()
    extends typingsSlinky.oDotJs.distTypesORequestMod.ORequest {
    def this(url: String, config: RequestInit) = this()
    def this(url: URL, config: RequestInit) = this()
  }
  
  def o(rootUrl: String): typingsSlinky.oDotJs.distTypesOHandlerMod.OHandler = js.native
  def o(rootUrl: String, config: js.Any): typingsSlinky.oDotJs.distTypesOHandlerMod.OHandler = js.native
  def o(rootUrl: String, config: OdataConfig): typingsSlinky.oDotJs.distTypesOHandlerMod.OHandler = js.native
  def o(rootUrl: typingsSlinky.std.URL): typingsSlinky.oDotJs.distTypesOHandlerMod.OHandler = js.native
  def o(rootUrl: typingsSlinky.std.URL, config: js.Any): typingsSlinky.oDotJs.distTypesOHandlerMod.OHandler = js.native
  def o(rootUrl: typingsSlinky.std.URL, config: OdataConfig): typingsSlinky.oDotJs.distTypesOHandlerMod.OHandler = js.native
}

