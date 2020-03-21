package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.coreDatabaseInfoMod.DatabaseInfo
import typingsSlinky.firebaseFirestore.remoteConnectionMod.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/platform_browser/webchannel_connection", JSImport.Namespace)
@js.native
object platformBrowserWebchannelConnectionMod extends js.Object {
  @js.native
  class WebChannelConnection protected () extends Connection {
    def this(info: DatabaseInfo) = this()
    val baseUrl: js.Any = js.native
    val databaseId: js.Any = js.native
    val forceLongPolling: js.Any = js.native
    /**
      * Modifies the headers for a request, adding any authorization token if
      * present and any additional headers for the request.
      */
    var modifyHeadersForRequest: js.Any = js.native
    def makeUrl(rpcName: String): String = js.native
  }
  
}

