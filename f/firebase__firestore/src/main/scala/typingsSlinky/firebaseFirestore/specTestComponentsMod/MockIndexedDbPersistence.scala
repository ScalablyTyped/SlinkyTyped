package typingsSlinky.firebaseFirestore.specTestComponentsMod

import typingsSlinky.firebaseFirestore.indexeddbPersistenceMod.IndexedDbPersistence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/test/unit/specs/spec_test_components", "MockIndexedDbPersistence")
@js.native
class MockIndexedDbPersistence () extends IndexedDbPersistence {
  var injectFailures: Boolean = js.native
}

