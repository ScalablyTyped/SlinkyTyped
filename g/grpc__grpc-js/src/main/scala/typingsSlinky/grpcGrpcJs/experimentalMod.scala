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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js/build/src/experimental", JSImport.Namespace)
@js.native
object experimentalMod extends js.Object {
  
  def createGoogleDefaultCredentials(): ChannelCredentials = js.native
  
  def getFirstUsableConfig(configs: js.Array[LoadBalancingConfig]): LoadBalancingConfig | Null = js.native
  
  def registerLoadBalancerType(typeName: String, loadBalancerType: LoadBalancerConstructor): Unit = js.native
  
  def registerResolver(scheme: String, resolverClass: ResolverConstructor): Unit = js.native
  
  def subchannelAddressToString(address: SubchannelAddress): String = js.native
  
  def trace(severity: LogVerbosity, tracer: String, text: String): Unit = js.native
  
  def uriToString(uri: GrpcUri): String = js.native
  
  @js.native
  class BackoffTimeout protected ()
    extends typingsSlinky.grpcGrpcJs.backoffTimeoutMod.BackoffTimeout {
    def this(callback: js.Function0[Unit]) = this()
    def this(callback: js.Function0[Unit], options: BackoffOptions) = this()
  }
  
  @js.native
  abstract class BaseFilter ()
    extends typingsSlinky.grpcGrpcJs.filterMod.BaseFilter
  
  @js.native
  class ChildLoadBalancerHandler protected ()
    extends typingsSlinky.grpcGrpcJs.loadBalancerChildHandlerMod.ChildLoadBalancerHandler {
    def this(channelControlHelper: ChannelControlHelper) = this()
  }
  
  @js.native
  class FilterStackFactory protected ()
    extends typingsSlinky.grpcGrpcJs.filterStackMod.FilterStackFactory {
    def this(factories: js.Array[FilterFactory[Filter]]) = this()
  }
  
  @js.native
  object PickResultType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.grpcGrpcJs.pickerMod.PickResultType with Double] = js.native
    
    /* 0 */ val COMPLETE: typingsSlinky.grpcGrpcJs.pickerMod.PickResultType.COMPLETE with Double = js.native
    
    /* 3 */ val DROP: typingsSlinky.grpcGrpcJs.pickerMod.PickResultType.DROP with Double = js.native
    
    /* 1 */ val QUEUE: typingsSlinky.grpcGrpcJs.pickerMod.PickResultType.QUEUE with Double = js.native
    
    /* 2 */ val TRANSIENT_FAILURE: typingsSlinky.grpcGrpcJs.pickerMod.PickResultType.TRANSIENT_FAILURE with Double = js.native
  }
  
  @js.native
  class QueuePicker protected ()
    extends typingsSlinky.grpcGrpcJs.pickerMod.QueuePicker {
    def this(loadBalancer: LoadBalancer) = this()
  }
  
  @js.native
  class UnavailablePicker ()
    extends typingsSlinky.grpcGrpcJs.pickerMod.UnavailablePicker {
    def this(status: StatusObject) = this()
  }
}
