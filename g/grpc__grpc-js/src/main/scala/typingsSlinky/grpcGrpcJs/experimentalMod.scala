package typingsSlinky.grpcGrpcJs

import typingsSlinky.grpcGrpcJs.backoffTimeoutMod.BackoffOptions
import typingsSlinky.grpcGrpcJs.callStreamMod.StatusObject
import typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
import typingsSlinky.grpcGrpcJs.constantsMod.LogVerbosity
import typingsSlinky.grpcGrpcJs.filterMod.Filter
import typingsSlinky.grpcGrpcJs.filterMod.FilterFactory
import typingsSlinky.grpcGrpcJs.loadBalancerMod.ChannelControlHelper
import typingsSlinky.grpcGrpcJs.loadBalancerMod.LoadBalancer
import typingsSlinky.grpcGrpcJs.loadBalancerMod.LoadBalancerConstructor
import typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.LoadBalancingConfig
import typingsSlinky.grpcGrpcJs.resolverMod.ResolverConstructor
import typingsSlinky.grpcGrpcJs.subchannelMod.SubchannelAddress
import typingsSlinky.grpcGrpcJs.uriParserMod.GrpcUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalMod {
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "BackoffTimeout")
  @js.native
  class BackoffTimeout protected ()
    extends typingsSlinky.grpcGrpcJs.backoffTimeoutMod.BackoffTimeout {
    def this(callback: js.Function0[Unit]) = this()
    def this(callback: js.Function0[Unit], options: BackoffOptions) = this()
  }
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "BaseFilter")
  @js.native
  abstract class BaseFilter ()
    extends typingsSlinky.grpcGrpcJs.filterMod.BaseFilter
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "ChildLoadBalancerHandler")
  @js.native
  class ChildLoadBalancerHandler protected ()
    extends typingsSlinky.grpcGrpcJs.loadBalancerChildHandlerMod.ChildLoadBalancerHandler {
    def this(channelControlHelper: ChannelControlHelper) = this()
  }
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "FilterStackFactory")
  @js.native
  class FilterStackFactory protected ()
    extends typingsSlinky.grpcGrpcJs.filterStackMod.FilterStackFactory {
    def this(factories: js.Array[FilterFactory[Filter]]) = this()
  }
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "PickResultType")
  @js.native
  object PickResultType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.grpcGrpcJs.pickerMod.PickResultType with Double] = js.native
    
    /* 0 */ val COMPLETE: typingsSlinky.grpcGrpcJs.pickerMod.PickResultType.COMPLETE with Double = js.native
    
    /* 3 */ val DROP: typingsSlinky.grpcGrpcJs.pickerMod.PickResultType.DROP with Double = js.native
    
    /* 1 */ val QUEUE: typingsSlinky.grpcGrpcJs.pickerMod.PickResultType.QUEUE with Double = js.native
    
    /* 2 */ val TRANSIENT_FAILURE: typingsSlinky.grpcGrpcJs.pickerMod.PickResultType.TRANSIENT_FAILURE with Double = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "QueuePicker")
  @js.native
  class QueuePicker protected ()
    extends typingsSlinky.grpcGrpcJs.pickerMod.QueuePicker {
    def this(loadBalancer: LoadBalancer) = this()
  }
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "UnavailablePicker")
  @js.native
  class UnavailablePicker ()
    extends typingsSlinky.grpcGrpcJs.pickerMod.UnavailablePicker {
    def this(status: StatusObject) = this()
  }
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "createGoogleDefaultCredentials")
  @js.native
  def createGoogleDefaultCredentials(): ChannelCredentials = js.native
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "getFirstUsableConfig")
  @js.native
  def getFirstUsableConfig(configs: js.Array[LoadBalancingConfig]): LoadBalancingConfig | Null = js.native
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "registerLoadBalancerType")
  @js.native
  def registerLoadBalancerType(typeName: String, loadBalancerType: LoadBalancerConstructor): Unit = js.native
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "registerResolver")
  @js.native
  def registerResolver(scheme: String, resolverClass: ResolverConstructor): Unit = js.native
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "subchannelAddressToString")
  @js.native
  def subchannelAddressToString(address: SubchannelAddress): String = js.native
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "trace")
  @js.native
  def trace(severity: LogVerbosity, tracer: String, text: String): Unit = js.native
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "uriToString")
  @js.native
  def uriToString(uri: GrpcUri): String = js.native
}
