package typingsSlinky.grpc.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait connectivityState extends js.Object

@JSImport("grpc", "connectivityState")
@js.native
object connectivityState extends js.Object {
  @js.native
  sealed trait CONNECTING extends connectivityState
  
  @js.native
  sealed trait IDLE extends connectivityState
  
  @js.native
  sealed trait READY extends connectivityState
  
  @js.native
  sealed trait SHUTDOWN extends connectivityState
  
  @js.native
  sealed trait TRANSIENT_FAILURE extends connectivityState
  
  /* 1 */ val CONNECTING: typingsSlinky.grpc.grpcMod.connectivityState.CONNECTING with Double = js.native
  /* 0 */ val IDLE: typingsSlinky.grpc.grpcMod.connectivityState.IDLE with Double = js.native
  /* 2 */ val READY: typingsSlinky.grpc.grpcMod.connectivityState.READY with Double = js.native
  /* 4 */ val SHUTDOWN: typingsSlinky.grpc.grpcMod.connectivityState.SHUTDOWN with Double = js.native
  /* 3 */ val TRANSIENT_FAILURE: typingsSlinky.grpc.grpcMod.connectivityState.TRANSIENT_FAILURE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[connectivityState with Double] = js.native
}

