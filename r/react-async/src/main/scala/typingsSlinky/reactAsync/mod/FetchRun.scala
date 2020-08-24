package typingsSlinky.reactAsync.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<react-async.react-async.AbstractState<T>, 'run'> */
@js.native
trait FetchRun[T] extends js.Object {
  var cancel: js.Function0[Unit] = js.native
  var counter: Double = js.native
  var initialValue: js.UndefOr[T | js.Error] = js.native
  var promise: js.Promise[T] = js.native
  var reload: js.Function0[Unit] = js.native
  var setData: js.Function2[/* data */ T, /* callback */ js.UndefOr[js.Function0[Unit]], T] = js.native
  var setError: js.Function2[/* error */ js.Error, /* callback */ js.UndefOr[js.Function0[Unit]], js.Error] = js.native
  def run(): Unit = js.native
  def run(ignoredEvent: SyntheticEvent[Event, Element]): Unit = js.native
  def run(ignoredEvent: Event): Unit = js.native
  def run(overrideParams: js.Function1[/* params */ js.UndefOr[OverrideParams], OverrideParams]): Unit = js.native
  def run(overrideParams: OverrideParams): Unit = js.native
}

