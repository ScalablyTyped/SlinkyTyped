package typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait invocationEvent extends js.Object

@JSImport("instabug-reactnative", "BugReporting.invocationEvent")
@js.native
object invocationEvent extends js.Object {
  @js.native
  sealed trait floatingButton
    extends typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent
  
  @js.native
  sealed trait none
    extends typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent
  
  @js.native
  sealed trait screenshot
    extends typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent
  
  @js.native
  sealed trait shake
    extends typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent
  
  @js.native
  sealed trait twoFingersSwipe
    extends typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent
  
  /* 4 */ val floatingButton: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent.floatingButton with Double = js.native
  /* 0 */ val none: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent.none with Double = js.native
  /* 2 */ val screenshot: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent.screenshot with Double = js.native
  /* 1 */ val shake: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent.shake with Double = js.native
  /* 3 */ val twoFingersSwipe: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent.twoFingersSwipe with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent with Double
  ] = js.native
}

