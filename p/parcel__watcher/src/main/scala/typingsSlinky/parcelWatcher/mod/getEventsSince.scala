package typingsSlinky.parcelWatcher.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@parcel/watcher", "getEventsSince")
@js.native
object getEventsSince extends js.Object {
  
  def apply(dirPath: String, snapshotPath: String): js.Promise[js.Array[ParcelWatcherEvent]] = js.native
  def apply(dirPath: String, snapshotPath: String, options: ParcelWatcherOptions): js.Promise[js.Array[ParcelWatcherEvent]] = js.native
}
