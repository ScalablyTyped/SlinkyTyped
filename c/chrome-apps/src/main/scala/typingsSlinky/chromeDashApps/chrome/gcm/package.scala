package typingsSlinky.chromeDashApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gcm {
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Record

  type IGCMDataReceive = Record[String, js.Any]
  type IGCMDataSend = Record[Exclude[DisallowedKeys, String], js.Any]
}
