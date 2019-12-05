package typingsSlinky.grpc.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait propagate extends js.Object

@JSImport("grpc", "propagate")
@js.native
object propagate extends js.Object {
  @js.native
  sealed trait CANCELLATION extends propagate
  
  @js.native
  sealed trait CENSUS_STATS_CONTEXT extends propagate
  
  @js.native
  sealed trait CENSUS_TRACING_CONTEXT extends propagate
  
  @js.native
  sealed trait DEADLINE extends propagate
  
  @js.native
  sealed trait DEFAULTS extends propagate
  
  /* 3 */ val CANCELLATION: typingsSlinky.grpc.grpcMod.propagate.CANCELLATION with Double = js.native
  /* 1 */ val CENSUS_STATS_CONTEXT: typingsSlinky.grpc.grpcMod.propagate.CENSUS_STATS_CONTEXT with Double = js.native
  /* 2 */ val CENSUS_TRACING_CONTEXT: typingsSlinky.grpc.grpcMod.propagate.CENSUS_TRACING_CONTEXT with Double = js.native
  /* 0 */ val DEADLINE: typingsSlinky.grpc.grpcMod.propagate.DEADLINE with Double = js.native
  /* 4 */ val DEFAULTS: typingsSlinky.grpc.grpcMod.propagate.DEFAULTS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[propagate with Double] = js.native
}

