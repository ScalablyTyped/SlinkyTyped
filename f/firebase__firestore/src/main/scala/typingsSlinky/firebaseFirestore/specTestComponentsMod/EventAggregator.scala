package typingsSlinky.firebaseFirestore.specTestComponentsMod

import typingsSlinky.firebaseFirestore.eventManagerMod.Observer
import typingsSlinky.firebaseFirestore.queryMod.Query
import typingsSlinky.firebaseFirestore.viewSnapshotMod.ViewSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/test/unit/specs/spec_test_components", "EventAggregator")
@js.native
class EventAggregator protected () extends Observer[ViewSnapshot] {
  def this(query: Query, pushEvent: js.Function1[/* e */ QueryEvent, Unit]) = this()
  var pushEvent: js.Any = js.native
  var query: js.Any = js.native
}

