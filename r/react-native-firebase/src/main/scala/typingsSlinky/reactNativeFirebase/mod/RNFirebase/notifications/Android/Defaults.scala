package typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Defaults extends StObject
@JSImport("react-native-firebase", "RNFirebase.notifications.Android.Defaults")
@js.native
object Defaults extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Defaults with Double] = js.native
  
  @js.native
  sealed trait All extends Defaults
  /* -1 */ val All: typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.Defaults.All with Double = js.native
  
  @js.native
  sealed trait Lights extends Defaults
  /* 4 */ val Lights: typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.Defaults.Lights with Double = js.native
  
  @js.native
  sealed trait Sound extends Defaults
  /* 1 */ val Sound: typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.Defaults.Sound with Double = js.native
  
  @js.native
  sealed trait Vibrate extends Defaults
  /* 2 */ val Vibrate: typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.Defaults.Vibrate with Double = js.native
}
