package typingsSlinky.firebaseFirestore.specsSpecTestComponentsMod

import typingsSlinky.firebaseFirestore.coreComponentProviderMod.IndexedDbComponentProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/specs/spec_test_components", "MockIndexedDbComponentProvider")
@js.native
class MockIndexedDbComponentProvider () extends IndexedDbComponentProvider {
  @JSName("persistence")
  var persistence_MockIndexedDbComponentProvider: MockIndexedDbPersistence = js.native
}

