package typingsSlinky.firebaseFirestore.specsSpecTestComponentsMod

import typingsSlinky.firebaseFirestore.localMemoryPersistenceMod.MemoryPersistence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/specs/spec_test_components", "MockMemoryPersistence")
@js.native
class MockMemoryPersistence () extends MemoryPersistence {
  var injectFailures: Boolean = js.native
}

