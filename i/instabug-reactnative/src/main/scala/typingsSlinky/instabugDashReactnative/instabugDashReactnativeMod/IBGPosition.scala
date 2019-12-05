package typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IBGPosition extends js.Object

@JSImport("instabug-reactnative", "IBGPosition")
@js.native
object IBGPosition extends js.Object {
  @js.native
  sealed trait bottomLeft extends IBGPosition
  
  @js.native
  sealed trait bottomRight extends IBGPosition
  
  @js.native
  sealed trait topLeft extends IBGPosition
  
  @js.native
  sealed trait topRight extends IBGPosition
  
  /* 2 */ val bottomLeft: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.IBGPosition.bottomLeft with Double = js.native
  /* 0 */ val bottomRight: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.IBGPosition.bottomRight with Double = js.native
  /* 3 */ val topLeft: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.IBGPosition.topLeft with Double = js.native
  /* 1 */ val topRight: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.IBGPosition.topRight with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IBGPosition with Double] = js.native
}

