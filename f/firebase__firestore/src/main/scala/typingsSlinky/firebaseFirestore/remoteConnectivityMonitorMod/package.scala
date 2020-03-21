package typingsSlinky.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object remoteConnectivityMonitorMod {
  type ConnectivityMonitorCallback = js.Function1[
    /* status */ typingsSlinky.firebaseFirestore.remoteConnectivityMonitorMod.NetworkStatus, 
    scala.Unit
  ]
}
