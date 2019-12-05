package typingsSlinky.reduxDashStateDashSync.reduxDashStateDashSyncMod

import typingsSlinky.redux.reduxMod.AnyAction
import typingsSlinky.std.BroadcastChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageListenerConfig extends js.Object {
  var channel: BroadcastChannel = js.native
  def allowed(): Boolean = js.native
  def allowed(`type`: String): Boolean = js.native
  def dispatch(action: AnyAction): Unit = js.native
  def dispatch(action: StampedAction): Unit = js.native
}

