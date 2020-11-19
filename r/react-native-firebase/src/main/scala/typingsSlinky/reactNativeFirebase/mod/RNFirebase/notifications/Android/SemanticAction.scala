package typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SemanticAction extends js.Object
@JSImport("react-native-firebase", "RNFirebase.notifications.Android.SemanticAction")
@js.native
object SemanticAction extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SemanticAction with Double] = js.native
  
  @js.native
  sealed trait Archive extends SemanticAction
  /* 5 */ @js.native
  object Archive extends TopLevel[Archive with Double]
  
  @js.native
  sealed trait Call extends SemanticAction
  /* 10 */ @js.native
  object Call extends TopLevel[Call with Double]
  
  @js.native
  sealed trait Delete extends SemanticAction
  /* 4 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  @js.native
  sealed trait MarkAsRead extends SemanticAction
  /* 2 */ @js.native
  object MarkAsRead extends TopLevel[MarkAsRead with Double]
  
  @js.native
  sealed trait MarkAsUnread extends SemanticAction
  /* 3 */ @js.native
  object MarkAsUnread extends TopLevel[MarkAsUnread with Double]
  
  @js.native
  sealed trait Mute extends SemanticAction
  /* 6 */ @js.native
  object Mute extends TopLevel[Mute with Double]
  
  @js.native
  sealed trait None extends SemanticAction
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Reply extends SemanticAction
  /* 1 */ @js.native
  object Reply extends TopLevel[Reply with Double]
  
  @js.native
  sealed trait ThumbsDown extends SemanticAction
  /* 9 */ @js.native
  object ThumbsDown extends TopLevel[ThumbsDown with Double]
  
  @js.native
  sealed trait ThumbsUp extends SemanticAction
  /* 8 */ @js.native
  object ThumbsUp extends TopLevel[ThumbsUp with Double]
  
  @js.native
  sealed trait Unmute extends SemanticAction
  /* 7 */ @js.native
  object Unmute extends TopLevel[Unmute with Double]
}
