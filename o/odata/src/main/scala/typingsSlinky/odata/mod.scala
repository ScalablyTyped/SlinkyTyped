package typingsSlinky.odata

import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.URL
import typingsSlinky.odata.odataConfigMod.OdataConfig
import typingsSlinky.odata.odataQueryMod.OdataQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("odata", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def o(rootUrl: String): typingsSlinky.odata.ohandlerMod.OHandler = js.native
  def o(rootUrl: String, config: js.Any): typingsSlinky.odata.ohandlerMod.OHandler = js.native
  def o(rootUrl: String, config: OdataConfig): typingsSlinky.odata.ohandlerMod.OHandler = js.native
  def o(rootUrl: URL): typingsSlinky.odata.ohandlerMod.OHandler = js.native
  def o(rootUrl: URL, config: js.Any): typingsSlinky.odata.ohandlerMod.OHandler = js.native
  def o(rootUrl: URL, config: OdataConfig): typingsSlinky.odata.ohandlerMod.OHandler = js.native
  
  @js.native
  class OBatch protected ()
    extends typingsSlinky.odata.obatchMod.OBatch {
    def this(resources: js.Array[typingsSlinky.odata.orequestMod.ORequest], config: OdataConfig) = this()
    def this(
      resources: js.Array[typingsSlinky.odata.orequestMod.ORequest],
      config: OdataConfig,
      query: OdataQuery
    ) = this()
    def this(
      resources: js.Array[typingsSlinky.odata.orequestMod.ORequest],
      config: OdataConfig,
      query: js.UndefOr[scala.Nothing],
      changeset: Boolean
    ) = this()
    def this(
      resources: js.Array[typingsSlinky.odata.orequestMod.ORequest],
      config: OdataConfig,
      query: OdataQuery,
      changeset: Boolean
    ) = this()
  }
  
  @js.native
  class OHandler protected ()
    extends typingsSlinky.odata.ohandlerMod.OHandler {
    def this(config: OdataConfig) = this()
  }
  
  @js.native
  class ORequest protected ()
    extends typingsSlinky.odata.orequestMod.ORequest {
    def this(url: String, config: RequestInit) = this()
    def this(url: URL, config: RequestInit) = this()
  }
}
