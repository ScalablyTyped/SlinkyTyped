package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.connectivityMonitorMod.ConnectivityMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/remote/connectivity_monitor_noop", JSImport.Namespace)
@js.native
object connectivityMonitorNoopMod extends js.Object {
  @js.native
  class NoopConnectivityMonitor () extends ConnectivityMonitor
  
}

