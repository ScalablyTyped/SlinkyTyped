package typingsSlinky.phonon

import typingsSlinky.phonon.Phonon_.Phonon
import typingsSlinky.phonon.Phonon_.PhononCustomWindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var phonon: Phonon = js.native
  def off(event: String, callback: js.Function1[/* event */ PhononCustomWindowEvent, Unit]): Unit = js.native
  def off(
    event: String,
    callback: js.Function1[/* event */ PhononCustomWindowEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
  def on(event: String, callback: js.Function1[/* event */ PhononCustomWindowEvent, Unit]): Unit = js.native
  def on(
    event: String,
    callback: js.Function1[/* event */ PhononCustomWindowEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
}

