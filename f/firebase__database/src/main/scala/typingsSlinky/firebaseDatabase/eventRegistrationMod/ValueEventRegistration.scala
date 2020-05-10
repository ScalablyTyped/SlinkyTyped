package typingsSlinky.firebaseDatabase.eventRegistrationMod

import typingsSlinky.firebaseDatabase.dataSnapshotMod.DataSnapshot
import typingsSlinky.firebaseDatabase.eventMod.CancelEvent
import typingsSlinky.firebaseDatabase.eventMod.DataEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/view/EventRegistration", "ValueEventRegistration")
@js.native
class ValueEventRegistration () extends EventRegistration {
  def this(callback_ : js.Function1[/* d */ DataSnapshot, Unit]) = this()
  def this(
    callback_ : js.Function1[/* d */ DataSnapshot, Unit],
    cancelCallback_ : js.Function1[/* e */ js.Error, Unit]
  ) = this()
  def this(callback_ : Null, cancelCallback_ : js.Function1[/* e */ js.Error, Unit]) = this()
  /**
    * @param {?function(!DataSnapshot)} callback_
    * @param {?function(Error)} cancelCallback_
    * @param {?Object} context_
    */
  def this(
    callback_ : js.Function1[/* d */ DataSnapshot, Unit],
    cancelCallback_ : js.Function1[/* e */ js.Error, Unit],
    context_ : js.Object
  ) = this()
  def this(callback_ : js.Function1[/* d */ DataSnapshot, Unit], cancelCallback_ : Null, context_ : js.Object) = this()
  def this(callback_ : Null, cancelCallback_ : js.Function1[/* e */ js.Error, Unit], context_ : js.Object) = this()
  def this(callback_ : Null, cancelCallback_ : Null, context_ : js.Object) = this()
  var callback_ : js.Any = js.native
  var cancelCallback_ : js.Any = js.native
  var context_ : js.Any = js.native
  /**
    * @inheritDoc
    */
  def getEventRunner(eventData: CancelEvent): js.Function0[Unit] = js.native
  def getEventRunner(eventData: DataEvent): js.Function0[Unit] = js.native
}

