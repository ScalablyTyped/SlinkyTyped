package typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait invocationEvent extends js.Object

@JSImport("instabug-reactnative", "invocationEvent")
@js.native
object invocationEvent extends js.Object {
  @js.native
  sealed trait floatingButton extends invocationEvent
  
  @js.native
  sealed trait none extends invocationEvent
  
  @js.native
  sealed trait screenshot extends invocationEvent
  
  @js.native
  sealed trait shake extends invocationEvent
  
  @js.native
  sealed trait twoFingersSwipe extends invocationEvent
  
  /* 4 */ val floatingButton: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.invocationEvent.floatingButton with Double = js.native
  /* 0 */ val none: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.invocationEvent.none with Double = js.native
  /* 2 */ val screenshot: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.invocationEvent.screenshot with Double = js.native
  /* 1 */ val shake: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.invocationEvent.shake with Double = js.native
  /* 3 */ val twoFingersSwipe: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.invocationEvent.twoFingersSwipe with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[invocationEvent with Double] = js.native
}

