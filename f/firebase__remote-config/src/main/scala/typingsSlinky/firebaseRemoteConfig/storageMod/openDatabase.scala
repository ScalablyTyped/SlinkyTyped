package typingsSlinky.firebaseRemoteConfig.storageMod

import org.scalajs.dom.raw.IDBDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/remote-config/dist/src/storage/storage", "openDatabase")
@js.native
object openDatabase extends js.Object {
  def apply(): js.Promise[IDBDatabase] = js.native
}

