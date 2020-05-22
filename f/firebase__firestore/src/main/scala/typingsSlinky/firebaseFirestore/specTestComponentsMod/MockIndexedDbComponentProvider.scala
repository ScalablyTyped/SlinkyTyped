package typingsSlinky.firebaseFirestore.specTestComponentsMod

import typingsSlinky.firebaseFirestore.componentProviderMod.IndexedDbComponentProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/test/unit/specs/spec_test_components", "MockIndexedDbComponentProvider")
@js.native
class MockIndexedDbComponentProvider () extends IndexedDbComponentProvider {
  @JSName("persistence")
  var persistence_MockIndexedDbComponentProvider: MockIndexedDbPersistence = js.native
}

