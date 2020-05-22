package typingsSlinky.firebaseFirestore.localStoreDottestMod

import typingsSlinky.firebaseFirestore.localCountingQueryEngineMod.CountingQueryEngine
import typingsSlinky.firebaseFirestore.localLocalStoreMod.LocalStore
import typingsSlinky.firebaseFirestore.localPersistenceMod.Persistence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalStoreComponents extends js.Object {
  var localStore: LocalStore
  var persistence: Persistence
  var queryEngine: CountingQueryEngine
}

object LocalStoreComponents {
  @scala.inline
  def apply(localStore: LocalStore, persistence: Persistence, queryEngine: CountingQueryEngine): LocalStoreComponents = {
    val __obj = js.Dynamic.literal(localStore = localStore.asInstanceOf[js.Any], persistence = persistence.asInstanceOf[js.Any], queryEngine = queryEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalStoreComponents]
  }
}

