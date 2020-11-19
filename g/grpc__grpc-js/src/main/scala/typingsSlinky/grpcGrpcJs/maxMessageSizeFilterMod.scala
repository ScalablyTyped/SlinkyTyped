package typingsSlinky.grpcGrpcJs

import typingsSlinky.grpcGrpcJs.callStreamMod.Call
import typingsSlinky.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typingsSlinky.grpcGrpcJs.filterMod.BaseFilter
import typingsSlinky.grpcGrpcJs.filterMod.FilterFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js/build/src/max-message-size-filter", JSImport.Namespace)
@js.native
object maxMessageSizeFilterMod extends js.Object {
  
  @js.native
  class MaxMessageSizeFilter protected () extends BaseFilter {
    def this(options: ChannelOptions, callStream: Call) = this()
    
    val callStream: js.Any = js.native
    
    var maxReceiveMessageSize: js.Any = js.native
    
    var maxSendMessageSize: js.Any = js.native
    
    val options: js.Any = js.native
  }
  
  @js.native
  class MaxMessageSizeFilterFactory protected () extends FilterFactory[MaxMessageSizeFilter] {
    def this(options: ChannelOptions) = this()
    
    val options: js.Any = js.native
  }
}
