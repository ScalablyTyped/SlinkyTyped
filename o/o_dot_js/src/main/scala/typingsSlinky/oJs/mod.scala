package typingsSlinky.oJs

import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.URL
import typingsSlinky.oJs.odataConfigMod.OdataConfig
import typingsSlinky.oJs.odataQueryMod.OdataQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("o.js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class OBatch protected ()
    extends typingsSlinky.oJs.obatchMod.OBatch {
    def this(resources: js.Array[typingsSlinky.oJs.orequestMod.ORequest], config: OdataConfig) = this()
    def this(
      resources: js.Array[typingsSlinky.oJs.orequestMod.ORequest],
      config: OdataConfig,
      query: OdataQuery
    ) = this()
    def this(
      resources: js.Array[typingsSlinky.oJs.orequestMod.ORequest],
      config: OdataConfig,
      query: OdataQuery,
      changeset: Boolean
    ) = this()
  }
  
  @js.native
  class OHandler protected ()
    extends typingsSlinky.oJs.ohandlerMod.OHandler {
    def this(config: OdataConfig) = this()
  }
  
  @js.native
  class ORequest protected ()
    extends typingsSlinky.oJs.orequestMod.ORequest {
    def this(url: String, config: RequestInit) = this()
    def this(url: URL, config: RequestInit) = this()
  }
  
  def o(rootUrl: String): typingsSlinky.oJs.ohandlerMod.OHandler = js.native
  def o(rootUrl: String, config: js.Any): typingsSlinky.oJs.ohandlerMod.OHandler = js.native
  def o(rootUrl: String, config: OdataConfig): typingsSlinky.oJs.ohandlerMod.OHandler = js.native
  def o(rootUrl: typingsSlinky.std.URL): typingsSlinky.oJs.ohandlerMod.OHandler = js.native
  def o(rootUrl: typingsSlinky.std.URL, config: js.Any): typingsSlinky.oJs.ohandlerMod.OHandler = js.native
  def o(rootUrl: typingsSlinky.std.URL, config: OdataConfig): typingsSlinky.oJs.ohandlerMod.OHandler = js.native
}

