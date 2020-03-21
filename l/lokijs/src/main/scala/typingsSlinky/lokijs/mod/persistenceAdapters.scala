package typingsSlinky.lokijs.mod

import typingsSlinky.lokijs._LokiFsAdapter
import typingsSlinky.lokijs._LokiLocalStorageAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lokijs", "persistenceAdapters")
@js.native
object persistenceAdapters extends js.Object {
  var fs: _LokiFsAdapter = js.native
  var localStorage: _LokiLocalStorageAdapter = js.native
}

