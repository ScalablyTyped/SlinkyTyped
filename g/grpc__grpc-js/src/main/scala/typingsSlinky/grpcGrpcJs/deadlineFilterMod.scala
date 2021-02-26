package typingsSlinky.grpcGrpcJs

import typingsSlinky.grpcGrpcJs.callStreamMod.Call
import typingsSlinky.grpcGrpcJs.channelMod.Channel
import typingsSlinky.grpcGrpcJs.filterMod.BaseFilter
import typingsSlinky.grpcGrpcJs.filterMod.FilterFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deadlineFilterMod {
  
  @JSImport("@grpc/grpc-js/build/src/deadline-filter", "DeadlineFilter")
  @js.native
  class DeadlineFilter protected () extends BaseFilter {
    def this(channel: Channel, callStream: Call) = this()
    
    val callStream: js.Any = js.native
    
    val channel: js.Any = js.native
    
    var deadline: js.Any = js.native
    
    var timer: js.Any = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/deadline-filter", "DeadlineFilterFactory")
  @js.native
  class DeadlineFilterFactory protected () extends FilterFactory[DeadlineFilter] {
    def this(channel: Channel) = this()
    
    val channel: js.Any = js.native
  }
}
