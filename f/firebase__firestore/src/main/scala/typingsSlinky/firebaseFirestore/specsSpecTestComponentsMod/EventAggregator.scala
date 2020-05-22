package typingsSlinky.firebaseFirestore.specsSpecTestComponentsMod

import typingsSlinky.firebaseFirestore.coreEventManagerMod.Observer
import typingsSlinky.firebaseFirestore.coreQueryMod.Query
import typingsSlinky.firebaseFirestore.coreViewSnapshotMod.ViewSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/specs/spec_test_components", "EventAggregator")
@js.native
class EventAggregator protected () extends Observer[ViewSnapshot] {
  def this(query: Query, pushEvent: js.Function1[/* e */ QueryEvent, Unit]) = this()
  var pushEvent: js.Any = js.native
  var query: js.Any = js.native
}

