package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.remoteConnectivityMonitorMod.ConnectivityMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/remote/connectivity_monitor_noop", JSImport.Namespace)
@js.native
object remoteConnectivityMonitorNoopMod extends js.Object {
  @js.native
  class NoopConnectivityMonitor () extends ConnectivityMonitor
  
}

