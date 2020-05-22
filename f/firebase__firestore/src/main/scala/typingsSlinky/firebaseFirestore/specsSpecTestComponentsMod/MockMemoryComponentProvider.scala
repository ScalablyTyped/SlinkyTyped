package typingsSlinky.firebaseFirestore.specsSpecTestComponentsMod

import typingsSlinky.firebaseFirestore.coreComponentProviderMod.MemoryComponentProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/specs/spec_test_components", "MockMemoryComponentProvider")
@js.native
class MockMemoryComponentProvider protected () extends MemoryComponentProvider {
  def this(gcEnabled: Boolean) = this()
  val gcEnabled: js.Any = js.native
  @JSName("persistence")
  var persistence_MockMemoryComponentProvider: MockMemoryPersistence = js.native
}

