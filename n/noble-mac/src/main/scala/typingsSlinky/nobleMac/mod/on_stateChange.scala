package typingsSlinky.nobleMac.mod

import typingsSlinky.nobleMac.nobleMacStrings.stateChange
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("noble-mac", "on")
@js.native
object on_stateChange extends js.Object {
  def apply(event: stateChange, listener: js.Function1[/* state */ String, Unit]): EventEmitter = js.native
}

