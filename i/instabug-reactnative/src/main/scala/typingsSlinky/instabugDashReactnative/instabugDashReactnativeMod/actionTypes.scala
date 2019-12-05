package typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait actionTypes extends js.Object

@JSImport("instabug-reactnative", "actionTypes")
@js.native
object actionTypes extends js.Object {
  @js.native
  sealed trait addCommentToFeature extends actionTypes
  
  @js.native
  sealed trait allActions extends actionTypes
  
  @js.native
  sealed trait reportBug extends actionTypes
  
  @js.native
  sealed trait requestNewFeature extends actionTypes
  
  /* 3 */ val addCommentToFeature: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.actionTypes.addCommentToFeature with Double = js.native
  /* 0 */ val allActions: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.actionTypes.allActions with Double = js.native
  /* 1 */ val reportBug: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.actionTypes.reportBug with Double = js.native
  /* 2 */ val requestNewFeature: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.actionTypes.requestNewFeature with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[actionTypes with Double] = js.native
}

