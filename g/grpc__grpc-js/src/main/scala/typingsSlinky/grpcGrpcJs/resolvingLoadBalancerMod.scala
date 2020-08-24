package typingsSlinky.grpcGrpcJs

import typingsSlinky.grpcGrpcJs.loadBalancerMod.ChannelControlHelper
import typingsSlinky.grpcGrpcJs.loadBalancerMod.LoadBalancer
import typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.LoadBalancingConfig
import typingsSlinky.grpcGrpcJs.serviceConfigMod.ServiceConfig
import typingsSlinky.grpcGrpcJs.subchannelMod.SubchannelAddress
import typingsSlinky.grpcGrpcJs.uriParserMod.GrpcUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/resolving-load-balancer", JSImport.Namespace)
@js.native
object resolvingLoadBalancerMod extends js.Object {
  @js.native
  class ResolvingLoadBalancer protected () extends LoadBalancer {
    /**
      * Wrapper class that behaves like a `LoadBalancer` and also handles name
      * resolution internally.
      * @param target The address of the backend to connect to.
      * @param channelControlHelper `ChannelControlHelper` instance provided by
      *     this load balancer's owner.
      * @param defaultServiceConfig The default service configuration to be used
      *     if none is provided by the name resolver. A `null` value indicates
      *     that the default behavior should be the default unconfigured behavior.
      *     In practice, that means using the "pick first" load balancer
      *     implmentation
      */
    def this(target: GrpcUri, channelControlHelper: ChannelControlHelper) = this()
    def this(target: GrpcUri, channelControlHelper: ChannelControlHelper, defaultServiceConfig: ServiceConfig) = this()
    /**
      * The backoff timer for handling name resolution failures.
      */
    val backoffTimeout: js.Any = js.native
    val channelControlHelper: js.Any = js.native
    var childLoadBalancer: js.Any = js.native
    /**
      * Indicates whether we should attempt to resolve again after the backoff
      * timer runs out.
      */
    var continueResolving: js.Any = js.native
    /**
      * This resolving load balancer's current connectivity state.
      */
    var currentState: js.Any = js.native
    val defaultServiceConfig: js.Any = js.native
    var handleResolutionFailure: js.Any = js.native
    /**
      * The resolver class constructed for the target address.
      */
    var innerResolver: js.Any = js.native
    var latestChildPicker: js.Any = js.native
    var latestChildState: js.Any = js.native
    /**
      * The service config object from the last successful resolution, if
      * available. A value of null indicates that we have not yet received a valid
      * service config from the resolver.
      */
    var previousServiceConfig: js.Any = js.native
    val target: js.Any = js.native
    var updateResolution: js.Any = js.native
    var updateState: js.Any = js.native
    def updateAddressList(addressList: js.Array[SubchannelAddress]): Unit = js.native
    def updateAddressList(addressList: js.Array[SubchannelAddress], lbConfig: LoadBalancingConfig): Unit = js.native
  }
  
}

