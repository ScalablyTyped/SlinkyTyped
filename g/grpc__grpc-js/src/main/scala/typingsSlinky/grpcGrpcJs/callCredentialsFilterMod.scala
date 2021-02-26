package typingsSlinky.grpcGrpcJs

import typingsSlinky.grpcGrpcJs.callStreamMod.Call
import typingsSlinky.grpcGrpcJs.channelMod.Channel
import typingsSlinky.grpcGrpcJs.filterMod.BaseFilter
import typingsSlinky.grpcGrpcJs.filterMod.FilterFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callCredentialsFilterMod {
  
  @JSImport("@grpc/grpc-js/build/src/call-credentials-filter", "CallCredentialsFilter")
  @js.native
  class CallCredentialsFilter protected () extends BaseFilter {
    def this(channel: Channel, stream: Call) = this()
    
    val channel: js.Any = js.native
    
    var serviceUrl: js.Any = js.native
    
    val stream: js.Any = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/call-credentials-filter", "CallCredentialsFilterFactory")
  @js.native
  class CallCredentialsFilterFactory protected () extends FilterFactory[CallCredentialsFilter] {
    def this(channel: Channel) = this()
    
    val channel: js.Any = js.native
  }
}
