package typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Defaults extends js.Object

@JSImport("react-native-firebase", "RNFirebase.notifications.Android.Defaults")
@js.native
object Defaults extends js.Object {
  @js.native
  sealed trait All extends Defaults
  
  @js.native
  sealed trait Lights extends Defaults
  
  @js.native
  sealed trait Sound extends Defaults
  
  @js.native
  sealed trait Vibrate extends Defaults
  
  /* -1 */ val All: typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Defaults.All with Double = js.native
  /* 4 */ val Lights: typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Defaults.Lights with Double = js.native
  /* 1 */ val Sound: typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Defaults.Sound with Double = js.native
  /* 2 */ val Vibrate: typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Defaults.Vibrate with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Defaults with Double] = js.native
}

