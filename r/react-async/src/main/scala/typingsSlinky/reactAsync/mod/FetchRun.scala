package typingsSlinky.reactAsync.mod

import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.raw.Element
import slinky.core.SyntheticEvent
import typingsSlinky.reactAsync.PartialRequestInit
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchRun[T] extends js.Object {
  def run(): Unit = js.native
  def run(ignoredEvent: SyntheticEvent[Event_, Element]): Unit = js.native
  def run(ignoredEvent: Event_): Unit = js.native
  def run(overrideInit: js.Function1[/* init */ RequestInit, RequestInit]): Unit = js.native
  def run(overrideInit: PartialRequestInit): Unit = js.native
}

