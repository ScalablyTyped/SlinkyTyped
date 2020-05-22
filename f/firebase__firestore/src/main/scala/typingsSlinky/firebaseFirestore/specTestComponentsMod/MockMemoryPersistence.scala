package typingsSlinky.firebaseFirestore.specTestComponentsMod

import typingsSlinky.firebaseFirestore.memoryPersistenceMod.MemoryPersistence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/test/unit/specs/spec_test_components", "MockMemoryPersistence")
@js.native
class MockMemoryPersistence () extends MemoryPersistence {
  var injectFailures: Boolean = js.native
}

