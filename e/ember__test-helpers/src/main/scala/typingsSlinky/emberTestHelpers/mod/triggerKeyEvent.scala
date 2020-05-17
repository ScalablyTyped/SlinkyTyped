package typingsSlinky.emberTestHelpers.mod

import typingsSlinky.emberTestHelpers.triggerKeyEventMod.KeyEvent
import typingsSlinky.emberTestHelpers.triggerKeyEventMod.KeyModifiers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/test-helpers", "triggerKeyEvent")
@js.native
object triggerKeyEvent extends js.Object {
  def apply(target: Target, eventType: KeyEvent, key: String): js.Promise[Unit] = js.native
  def apply(target: Target, eventType: KeyEvent, key: String, modifiers: KeyModifiers): js.Promise[Unit] = js.native
  def apply(target: Target, eventType: KeyEvent, key: Double): js.Promise[Unit] = js.native
  def apply(target: Target, eventType: KeyEvent, key: Double, modifiers: KeyModifiers): js.Promise[Unit] = js.native
}

