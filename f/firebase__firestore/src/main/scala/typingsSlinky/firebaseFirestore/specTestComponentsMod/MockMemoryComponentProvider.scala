package typingsSlinky.firebaseFirestore.specTestComponentsMod

import typingsSlinky.firebaseFirestore.componentProviderMod.MemoryComponentProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/test/unit/specs/spec_test_components", "MockMemoryComponentProvider")
@js.native
class MockMemoryComponentProvider protected () extends MemoryComponentProvider {
  def this(gcEnabled: Boolean) = this()
  val gcEnabled: js.Any = js.native
  @JSName("persistence")
  var persistence_MockMemoryComponentProvider: MockMemoryPersistence = js.native
}

