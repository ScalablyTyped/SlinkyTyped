package typingsSlinky.expo.buildARMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

@JSImport("expo/build/AR", "EventType")
@js.native
object EventType extends js.Object {
  @js.native
  sealed trait AnchorsDidUpdate extends EventType
  
  @js.native
  sealed trait CameraDidChangeTrackingState extends EventType
  
  @js.native
  sealed trait DidFailWithError extends EventType
  
  @js.native
  sealed trait FrameDidUpdate extends EventType
  
  @js.native
  sealed trait SessionInterruptionEnded extends EventType
  
  @js.native
  sealed trait SessionWasInterrupted extends EventType
  
  /* 2 */ val AnchorsDidUpdate: typingsSlinky.expo.buildARMod.EventType.AnchorsDidUpdate with Double = js.native
  /* 3 */ val CameraDidChangeTrackingState: typingsSlinky.expo.buildARMod.EventType.CameraDidChangeTrackingState with Double = js.native
  /* 1 */ val DidFailWithError: typingsSlinky.expo.buildARMod.EventType.DidFailWithError with Double = js.native
  /* 0 */ val FrameDidUpdate: typingsSlinky.expo.buildARMod.EventType.FrameDidUpdate with Double = js.native
  /* 5 */ val SessionInterruptionEnded: typingsSlinky.expo.buildARMod.EventType.SessionInterruptionEnded with Double = js.native
  /* 4 */ val SessionWasInterrupted: typingsSlinky.expo.buildARMod.EventType.SessionWasInterrupted with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventType with Double] = js.native
}

