package typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instabug-reactnative", "FeatureRequests")
@js.native
object FeatureRequests extends js.Object {
  @js.native
  sealed trait actionTypes extends js.Object
  
  def setEmailFieldRequired(
    isEmailFieldRequired: Boolean,
    actionTypes: js.Array[
      typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.FeatureRequests.actionTypes
    ]
  ): Unit = js.native
  def setEnabled(isEnabled: Boolean): Unit = js.native
  def show(): Unit = js.native
  @js.native
  object actionTypes extends js.Object {
    @js.native
    sealed trait addCommentToFeature
      extends typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.FeatureRequests.actionTypes
    
    @js.native
    sealed trait allActions
      extends typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.FeatureRequests.actionTypes
    
    @js.native
    sealed trait reportBug
      extends typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.FeatureRequests.actionTypes
    
    @js.native
    sealed trait requestNewFeature
      extends typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.FeatureRequests.actionTypes
    
    /* 3 */ val addCommentToFeature: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.FeatureRequests.actionTypes.addCommentToFeature with Double = js.native
    /* 0 */ val allActions: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.FeatureRequests.actionTypes.allActions with Double = js.native
    /* 1 */ val reportBug: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.FeatureRequests.actionTypes.reportBug with Double = js.native
    /* 2 */ val requestNewFeature: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.FeatureRequests.actionTypes.requestNewFeature with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.FeatureRequests.actionTypes with Double
      ] = js.native
  }
  
}

