package typingsSlinky.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object remoteLoggingMod {
  type LogData = java.lang.String | typingsSlinky.expo.remoteLoggingMod.LogErrorData
  type TransportErrorListener = js.Function1[/* event */ typingsSlinky.expo.AnonResponse, scala.Unit]
}
