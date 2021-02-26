package typingsSlinky.grpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait connectivityState extends StObject
@JSImport("grpc", "connectivityState")
@js.native
object connectivityState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[connectivityState with Double] = js.native
  
  @js.native
  sealed trait CONNECTING extends connectivityState
  /* 1 */ val CONNECTING: typingsSlinky.grpc.mod.connectivityState.CONNECTING with Double = js.native
  
  @js.native
  sealed trait IDLE extends connectivityState
  /* 0 */ val IDLE: typingsSlinky.grpc.mod.connectivityState.IDLE with Double = js.native
  
  @js.native
  sealed trait READY extends connectivityState
  /* 2 */ val READY: typingsSlinky.grpc.mod.connectivityState.READY with Double = js.native
  
  @js.native
  sealed trait SHUTDOWN extends connectivityState
  /* 4 */ val SHUTDOWN: typingsSlinky.grpc.mod.connectivityState.SHUTDOWN with Double = js.native
  
  @js.native
  sealed trait TRANSIENT_FAILURE extends connectivityState
  /* 3 */ val TRANSIENT_FAILURE: typingsSlinky.grpc.mod.connectivityState.TRANSIENT_FAILURE with Double = js.native
}
