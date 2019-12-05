package typingsSlinky.grpc.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait callError extends js.Object

@JSImport("grpc", "callError")
@js.native
object callError extends js.Object {
  @js.native
  sealed trait ALREADY_FINISHED extends callError
  
  @js.native
  sealed trait ALREADY_INVOKED extends callError
  
  @js.native
  sealed trait BATCH_TOO_BIG extends callError
  
  @js.native
  sealed trait ERROR extends callError
  
  @js.native
  sealed trait INVALID_FLAGS extends callError
  
  @js.native
  sealed trait INVALID_MESSAGE extends callError
  
  @js.native
  sealed trait INVALID_METADATA extends callError
  
  @js.native
  sealed trait NOT_INVOKED extends callError
  
  @js.native
  sealed trait NOT_ON_CLIENT extends callError
  
  @js.native
  sealed trait NOT_ON_SERVER extends callError
  
  @js.native
  sealed trait NOT_SERVER_COMPLETION_QUEUE extends callError
  
  @js.native
  sealed trait OK extends callError
  
  @js.native
  sealed trait PAYLOAD_TYPE_MISMATCH extends callError
  
  @js.native
  sealed trait TOO_MANY_OPERATIONS extends callError
  
  /* 6 */ val ALREADY_FINISHED: typingsSlinky.grpc.grpcMod.callError.ALREADY_FINISHED with Double = js.native
  /* 4 */ val ALREADY_INVOKED: typingsSlinky.grpc.grpcMod.callError.ALREADY_INVOKED with Double = js.native
  /* 12 */ val BATCH_TOO_BIG: typingsSlinky.grpc.grpcMod.callError.BATCH_TOO_BIG with Double = js.native
  /* 1 */ val ERROR: typingsSlinky.grpc.grpcMod.callError.ERROR with Double = js.native
  /* 8 */ val INVALID_FLAGS: typingsSlinky.grpc.grpcMod.callError.INVALID_FLAGS with Double = js.native
  /* 10 */ val INVALID_MESSAGE: typingsSlinky.grpc.grpcMod.callError.INVALID_MESSAGE with Double = js.native
  /* 9 */ val INVALID_METADATA: typingsSlinky.grpc.grpcMod.callError.INVALID_METADATA with Double = js.native
  /* 5 */ val NOT_INVOKED: typingsSlinky.grpc.grpcMod.callError.NOT_INVOKED with Double = js.native
  /* 3 */ val NOT_ON_CLIENT: typingsSlinky.grpc.grpcMod.callError.NOT_ON_CLIENT with Double = js.native
  /* 2 */ val NOT_ON_SERVER: typingsSlinky.grpc.grpcMod.callError.NOT_ON_SERVER with Double = js.native
  /* 11 */ val NOT_SERVER_COMPLETION_QUEUE: typingsSlinky.grpc.grpcMod.callError.NOT_SERVER_COMPLETION_QUEUE with Double = js.native
  /* 0 */ val OK: typingsSlinky.grpc.grpcMod.callError.OK with Double = js.native
  /* 13 */ val PAYLOAD_TYPE_MISMATCH: typingsSlinky.grpc.grpcMod.callError.PAYLOAD_TYPE_MISMATCH with Double = js.native
  /* 7 */ val TOO_MANY_OPERATIONS: typingsSlinky.grpc.grpcMod.callError.TOO_MANY_OPERATIONS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[callError with Double] = js.native
}

