package typingsSlinky.reactAsync.mod

import typingsSlinky.react.mod.SyntheticEvent
import typingsSlinky.reactAsync.PartialRequestInit
import typingsSlinky.std.Element
import typingsSlinky.std.Event_
import typingsSlinky.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchRun[T] extends js.Object {
  def run(): Unit = js.native
  def run(ignoredEvent: SyntheticEvent[Element, Event_]): Unit = js.native
  def run(ignoredEvent: Event_): Unit = js.native
  def run(overrideInit: js.Function1[/* init */ RequestInit, RequestInit]): Unit = js.native
  def run(overrideInit: PartialRequestInit): Unit = js.native
}

