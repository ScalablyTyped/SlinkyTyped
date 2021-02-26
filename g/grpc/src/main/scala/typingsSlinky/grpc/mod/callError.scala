package typingsSlinky.grpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait callError extends StObject
@JSImport("grpc", "callError")
@js.native
object callError extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[callError with Double] = js.native
  
  @js.native
  sealed trait ALREADY_FINISHED extends callError
  /* 6 */ val ALREADY_FINISHED: typingsSlinky.grpc.mod.callError.ALREADY_FINISHED with Double = js.native
  
  @js.native
  sealed trait ALREADY_INVOKED extends callError
  /* 4 */ val ALREADY_INVOKED: typingsSlinky.grpc.mod.callError.ALREADY_INVOKED with Double = js.native
  
  @js.native
  sealed trait BATCH_TOO_BIG extends callError
  /* 12 */ val BATCH_TOO_BIG: typingsSlinky.grpc.mod.callError.BATCH_TOO_BIG with Double = js.native
  
  @js.native
  sealed trait ERROR extends callError
  /* 1 */ val ERROR: typingsSlinky.grpc.mod.callError.ERROR with Double = js.native
  
  @js.native
  sealed trait INVALID_FLAGS extends callError
  /* 8 */ val INVALID_FLAGS: typingsSlinky.grpc.mod.callError.INVALID_FLAGS with Double = js.native
  
  @js.native
  sealed trait INVALID_MESSAGE extends callError
  /* 10 */ val INVALID_MESSAGE: typingsSlinky.grpc.mod.callError.INVALID_MESSAGE with Double = js.native
  
  @js.native
  sealed trait INVALID_METADATA extends callError
  /* 9 */ val INVALID_METADATA: typingsSlinky.grpc.mod.callError.INVALID_METADATA with Double = js.native
  
  @js.native
  sealed trait NOT_INVOKED extends callError
  /* 5 */ val NOT_INVOKED: typingsSlinky.grpc.mod.callError.NOT_INVOKED with Double = js.native
  
  @js.native
  sealed trait NOT_ON_CLIENT extends callError
  /* 3 */ val NOT_ON_CLIENT: typingsSlinky.grpc.mod.callError.NOT_ON_CLIENT with Double = js.native
  
  @js.native
  sealed trait NOT_ON_SERVER extends callError
  /* 2 */ val NOT_ON_SERVER: typingsSlinky.grpc.mod.callError.NOT_ON_SERVER with Double = js.native
  
  @js.native
  sealed trait NOT_SERVER_COMPLETION_QUEUE extends callError
  /* 11 */ val NOT_SERVER_COMPLETION_QUEUE: typingsSlinky.grpc.mod.callError.NOT_SERVER_COMPLETION_QUEUE with Double = js.native
  
  @js.native
  sealed trait OK extends callError
  /* 0 */ val OK: typingsSlinky.grpc.mod.callError.OK with Double = js.native
  
  @js.native
  sealed trait PAYLOAD_TYPE_MISMATCH extends callError
  /* 13 */ val PAYLOAD_TYPE_MISMATCH: typingsSlinky.grpc.mod.callError.PAYLOAD_TYPE_MISMATCH with Double = js.native
  
  @js.native
  sealed trait TOO_MANY_OPERATIONS extends callError
  /* 7 */ val TOO_MANY_OPERATIONS: typingsSlinky.grpc.mod.callError.TOO_MANY_OPERATIONS with Double = js.native
}
