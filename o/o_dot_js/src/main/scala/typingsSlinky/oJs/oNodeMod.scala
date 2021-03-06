package typingsSlinky.oJs

import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.URL
import typingsSlinky.oJs.odataConfigMod.OdataConfig
import typingsSlinky.oJs.odataQueryMod.OdataQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oNodeMod {
  
  @JSImport("o.js/dist/types/o.node", "OBatch")
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
      query: js.UndefOr[scala.Nothing],
      changeset: Boolean
    ) = this()
    def this(
      resources: js.Array[typingsSlinky.oJs.orequestMod.ORequest],
      config: OdataConfig,
      query: OdataQuery,
      changeset: Boolean
    ) = this()
  }
  
  @JSImport("o.js/dist/types/o.node", "OHandler")
  @js.native
  class OHandler protected ()
    extends typingsSlinky.oJs.ohandlerMod.OHandler {
    def this(config: OdataConfig) = this()
  }
  
  @JSImport("o.js/dist/types/o.node", "ORequest")
  @js.native
  class ORequest protected ()
    extends typingsSlinky.oJs.orequestMod.ORequest {
    def this(url: String, config: RequestInit) = this()
    def this(url: URL, config: RequestInit) = this()
  }
  
  @JSImport("o.js/dist/types/o.node", "o")
  @js.native
  def o(rootUrl: String): typingsSlinky.oJs.ohandlerMod.OHandler = js.native
  @JSImport("o.js/dist/types/o.node", "o")
  @js.native
  def o(rootUrl: String, config: js.Any): typingsSlinky.oJs.ohandlerMod.OHandler = js.native
  @JSImport("o.js/dist/types/o.node", "o")
  @js.native
  def o(rootUrl: String, config: OdataConfig): typingsSlinky.oJs.ohandlerMod.OHandler = js.native
  @JSImport("o.js/dist/types/o.node", "o")
  @js.native
  def o(rootUrl: URL): typingsSlinky.oJs.ohandlerMod.OHandler = js.native
  @JSImport("o.js/dist/types/o.node", "o")
  @js.native
  def o(rootUrl: URL, config: js.Any): typingsSlinky.oJs.ohandlerMod.OHandler = js.native
  @JSImport("o.js/dist/types/o.node", "o")
  @js.native
  def o(rootUrl: URL, config: OdataConfig): typingsSlinky.oJs.ohandlerMod.OHandler = js.native
}
