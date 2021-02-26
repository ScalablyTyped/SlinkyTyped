package typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SemanticAction extends StObject
@JSImport("react-native-firebase", "RNFirebase.notifications.Android.SemanticAction")
@js.native
object SemanticAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SemanticAction with Double] = js.native
  
  @js.native
  sealed trait Archive extends SemanticAction
  /* 5 */ val Archive: typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.SemanticAction.Archive with Double = js.native
  
  @js.native
  sealed trait Call extends SemanticAction
  /* 10 */ val Call: typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.SemanticAction.Call with Double = js.native
  
  @js.native
  sealed trait Delete extends SemanticAction
  /* 4 */ val Delete: typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.SemanticAction.Delete with Double = js.native
  
  @js.native
  sealed trait MarkAsRead extends SemanticAction
  /* 2 */ val MarkAsRead: typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.SemanticAction.MarkAsRead with Double = js.native
  
  @js.native
  sealed trait MarkAsUnread extends SemanticAction
  /* 3 */ val MarkAsUnread: typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.SemanticAction.MarkAsUnread with Double = js.native
  
  @js.native
  sealed trait Mute extends SemanticAction
  /* 6 */ val Mute: typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.SemanticAction.Mute with Double = js.native
  
  @js.native
  sealed trait None extends SemanticAction
  /* 0 */ val None: typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.SemanticAction.None with Double = js.native
  
  @js.native
  sealed trait Reply extends SemanticAction
  /* 1 */ val Reply: typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.SemanticAction.Reply with Double = js.native
  
  @js.native
  sealed trait ThumbsDown extends SemanticAction
  /* 9 */ val ThumbsDown: typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.SemanticAction.ThumbsDown with Double = js.native
  
  @js.native
  sealed trait ThumbsUp extends SemanticAction
  /* 8 */ val ThumbsUp: typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.SemanticAction.ThumbsUp with Double = js.native
  
  @js.native
  sealed trait Unmute extends SemanticAction
  /* 7 */ val Unmute: typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.SemanticAction.Unmute with Double = js.native
}
