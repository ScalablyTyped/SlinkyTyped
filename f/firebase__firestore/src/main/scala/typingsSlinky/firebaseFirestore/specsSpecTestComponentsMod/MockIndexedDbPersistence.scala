package typingsSlinky.firebaseFirestore.specsSpecTestComponentsMod

import typingsSlinky.firebaseFirestore.localIndexeddbPersistenceMod.IndexedDbPersistence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/specs/spec_test_components", "MockIndexedDbPersistence")
@js.native
class MockIndexedDbPersistence () extends IndexedDbPersistence {
  var injectFailures: Boolean = js.native
}

