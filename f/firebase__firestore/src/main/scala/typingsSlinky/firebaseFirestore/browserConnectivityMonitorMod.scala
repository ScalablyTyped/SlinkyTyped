package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.connectivityMonitorMod.ConnectivityMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/platform_browser/browser_connectivity_monitor", JSImport.Namespace)
@js.native
object browserConnectivityMonitorMod extends js.Object {
  @js.native
  class BrowserConnectivityMonitor () extends ConnectivityMonitor {
    var callbacks: js.Any = js.native
    var configureNetworkMonitoring: js.Any = js.native
    val networkAvailableListener: js.Any = js.native
    val networkUnavailableListener: js.Any = js.native
    var onNetworkAvailable: js.Any = js.native
    var onNetworkUnavailable: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object BrowserConnectivityMonitor extends js.Object {
    /** Checks that all used attributes of window are available. */
    def isAvailable(): Boolean = js.native
  }
  
}

