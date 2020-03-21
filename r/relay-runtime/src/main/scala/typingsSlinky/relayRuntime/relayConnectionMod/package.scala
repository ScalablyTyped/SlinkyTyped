package typingsSlinky.relayRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object relayConnectionMod {
  type ConnectionID = java.lang.String
  type ConnectionMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.relayRuntime.relayConnectionMod.ConnectionRecord]
  type GetConnectionEvents = js.Function1[
    /* connectionID */ typingsSlinky.relayRuntime.relayConnectionMod.ConnectionID, 
    js.Array[typingsSlinky.relayRuntime.relayConnectionMod.ConnectionInternalEvent]
  ]
}
