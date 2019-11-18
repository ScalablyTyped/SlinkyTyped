package typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait State extends js.Object

@JSImport("react-native-gesture-handler", "State")
@js.native
object State extends js.Object {
  @js.native
  sealed trait ACTIVE extends State
  
  @js.native
  sealed trait BEGAN extends State
  
  @js.native
  sealed trait CANCELLED extends State
  
  @js.native
  sealed trait END extends State
  
  @js.native
  sealed trait FAILED extends State
  
  @js.native
  sealed trait UNDETERMINED extends State
  
  /* 3 */ val ACTIVE: typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.State.ACTIVE with Double = js.native
  /* 1 */ val BEGAN: typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.State.BEGAN with Double = js.native
  /* 2 */ val CANCELLED: typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.State.CANCELLED with Double = js.native
  /* 4 */ val END: typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.State.END with Double = js.native
  /* 0 */ val FAILED: typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.State.FAILED with Double = js.native
  /* 0 */ val UNDETERMINED: typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.State.UNDETERMINED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[State with Double] = js.native
}

