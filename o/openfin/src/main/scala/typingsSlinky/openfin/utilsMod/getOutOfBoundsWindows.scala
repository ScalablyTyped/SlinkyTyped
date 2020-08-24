package typingsSlinky.openfin.utilsMod

import typingsSlinky.openfin.monitorMod.MonitorInfo
import typingsSlinky.openfin.shapesPlatformMod.Snapshot
import typingsSlinky.openfin.windowOptionsMod.WindowOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/platform/utils", "getOutOfBoundsWindows")
@js.native
object getOutOfBoundsWindows extends js.Object {
  def apply(snapshot: Snapshot, monitorInfo: MonitorInfo): js.Promise[js.Array[WindowOptions]] = js.native
}

