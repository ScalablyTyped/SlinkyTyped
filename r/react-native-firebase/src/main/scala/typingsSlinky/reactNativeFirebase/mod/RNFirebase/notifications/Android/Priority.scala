package typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Priority extends StObject
@JSImport("react-native-firebase", "RNFirebase.notifications.Android.Priority")
@js.native
object Priority extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Priority with Double] = js.native
  
  @js.native
  sealed trait Default extends Priority
  /* 0 */ val Default: typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.Priority.Default with Double = js.native
  
  @js.native
  sealed trait High extends Priority
  /* 1 */ val High: typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.Priority.High with Double = js.native
  
  @js.native
  sealed trait Low extends Priority
  /* -1 */ val Low: typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.Priority.Low with Double = js.native
  
  @js.native
  sealed trait Max extends Priority
  /* 2 */ val Max: typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.Priority.Max with Double = js.native
  
  @js.native
  sealed trait Min extends Priority
  /* -2 */ val Min: typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.Priority.Min with Double = js.native
}
