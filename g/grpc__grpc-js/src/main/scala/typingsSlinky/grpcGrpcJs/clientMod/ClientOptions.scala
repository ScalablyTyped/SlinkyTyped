package typingsSlinky.grpcGrpcJs.clientMod

import typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
import typingsSlinky.grpcGrpcJs.channelMod.Channel
import typingsSlinky.grpcGrpcJs.clientInterceptorsMod.Interceptor
import typingsSlinky.grpcGrpcJs.clientInterceptorsMod.InterceptorProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/channel-options.ChannelOptions> & {  channelOverride ? :@grpc/grpc-js.@grpc/grpc-js/build/src/channel.Channel, channelFactoryOverride ? (address : string, credentials : @grpc/grpc-js.@grpc/grpc-js/build/src/channel-credentials.ChannelCredentials, options : @grpc/grpc-js.@grpc/grpc-js/build/src/client.ClientOptions): @grpc/grpc-js.@grpc/grpc-js/build/src/channel.Channel,   interceptors ? :std.Array<@grpc/grpc-js.@grpc/grpc-js/build/src/client-interceptors.Interceptor>,   interceptor_providers ? :std.Array<@grpc/grpc-js.@grpc/grpc-js/build/src/client-interceptors.InterceptorProvider>,   callInvocationTransformer ? :@grpc/grpc-js.@grpc/grpc-js/build/src/client.CallInvocationTransformer} */
trait ClientOptions extends js.Object {
  var callInvocationTransformer: js.UndefOr[CallInvocationTransformer] = js.undefined
  var channelFactoryOverride: js.UndefOr[
    js.Function3[
      /* address */ String, 
      /* credentials */ ChannelCredentials, 
      /* options */ ClientOptions, 
      Channel
    ]
  ] = js.undefined
  var channelOverride: js.UndefOr[Channel] = js.undefined
  @JSName("grpc.default_authority")
  var grpcDotdefault_authority: js.UndefOr[String] = js.undefined
  @JSName("grpc.initial_reconnect_backoff_ms")
  var grpcDotinitial_reconnect_backoff_ms: js.UndefOr[Double] = js.undefined
  @JSName("grpc.keepalive_time_ms")
  var grpcDotkeepalive_time_ms: js.UndefOr[Double] = js.undefined
  @JSName("grpc.keepalive_timeout_ms")
  var grpcDotkeepalive_timeout_ms: js.UndefOr[Double] = js.undefined
  @JSName("grpc.max_concurrent_streams")
  var grpcDotmax_concurrent_streams: js.UndefOr[Double] = js.undefined
  @JSName("grpc.max_receive_message_length")
  var grpcDotmax_receive_message_length: js.UndefOr[Double] = js.undefined
  @JSName("grpc.max_reconnect_backoff_ms")
  var grpcDotmax_reconnect_backoff_ms: js.UndefOr[Double] = js.undefined
  @JSName("grpc.max_send_message_length")
  var grpcDotmax_send_message_length: js.UndefOr[Double] = js.undefined
  @JSName("grpc.primary_user_agent")
  var grpcDotprimary_user_agent: js.UndefOr[String] = js.undefined
  @JSName("grpc.secondary_user_agent")
  var grpcDotsecondary_user_agent: js.UndefOr[String] = js.undefined
  @JSName("grpc.service_config")
  var grpcDotservice_config: js.UndefOr[String] = js.undefined
  @JSName("grpc.ssl_target_name_override")
  var grpcDotssl_target_name_override: js.UndefOr[String] = js.undefined
  @JSName("grpc.use_local_subchannel_pool")
  var grpcDotuse_local_subchannel_pool: js.UndefOr[Double] = js.undefined
  var interceptor_providers: js.UndefOr[js.Array[InterceptorProvider]] = js.undefined
  var interceptors: js.UndefOr[js.Array[Interceptor]] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    callInvocationTransformer: /* callProperties */ CallProperties[js.Any, js.Any] => CallProperties[js.Any, js.Any] = null,
    channelFactoryOverride: (/* address */ String, /* credentials */ ChannelCredentials, /* options */ ClientOptions) => Channel = null,
    channelOverride: Channel = null,
    grpcDotdefault_authority: String = null,
    grpcDotinitial_reconnect_backoff_ms: js.UndefOr[Double] = js.undefined,
    grpcDotkeepalive_time_ms: js.UndefOr[Double] = js.undefined,
    grpcDotkeepalive_timeout_ms: js.UndefOr[Double] = js.undefined,
    grpcDotmax_concurrent_streams: js.UndefOr[Double] = js.undefined,
    grpcDotmax_receive_message_length: js.UndefOr[Double] = js.undefined,
    grpcDotmax_reconnect_backoff_ms: js.UndefOr[Double] = js.undefined,
    grpcDotmax_send_message_length: js.UndefOr[Double] = js.undefined,
    grpcDotprimary_user_agent: String = null,
    grpcDotsecondary_user_agent: String = null,
    grpcDotservice_config: String = null,
    grpcDotssl_target_name_override: String = null,
    grpcDotuse_local_subchannel_pool: js.UndefOr[Double] = js.undefined,
    interceptor_providers: js.Array[InterceptorProvider] = null,
    interceptors: js.Array[Interceptor] = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (callInvocationTransformer != null) __obj.updateDynamic("callInvocationTransformer")(js.Any.fromFunction1(callInvocationTransformer))
    if (channelFactoryOverride != null) __obj.updateDynamic("channelFactoryOverride")(js.Any.fromFunction3(channelFactoryOverride))
    if (channelOverride != null) __obj.updateDynamic("channelOverride")(channelOverride.asInstanceOf[js.Any])
    if (grpcDotdefault_authority != null) __obj.updateDynamic("grpc.default_authority")(grpcDotdefault_authority.asInstanceOf[js.Any])
    if (!js.isUndefined(grpcDotinitial_reconnect_backoff_ms)) __obj.updateDynamic("grpc.initial_reconnect_backoff_ms")(grpcDotinitial_reconnect_backoff_ms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(grpcDotkeepalive_time_ms)) __obj.updateDynamic("grpc.keepalive_time_ms")(grpcDotkeepalive_time_ms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(grpcDotkeepalive_timeout_ms)) __obj.updateDynamic("grpc.keepalive_timeout_ms")(grpcDotkeepalive_timeout_ms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(grpcDotmax_concurrent_streams)) __obj.updateDynamic("grpc.max_concurrent_streams")(grpcDotmax_concurrent_streams.get.asInstanceOf[js.Any])
    if (!js.isUndefined(grpcDotmax_receive_message_length)) __obj.updateDynamic("grpc.max_receive_message_length")(grpcDotmax_receive_message_length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(grpcDotmax_reconnect_backoff_ms)) __obj.updateDynamic("grpc.max_reconnect_backoff_ms")(grpcDotmax_reconnect_backoff_ms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(grpcDotmax_send_message_length)) __obj.updateDynamic("grpc.max_send_message_length")(grpcDotmax_send_message_length.get.asInstanceOf[js.Any])
    if (grpcDotprimary_user_agent != null) __obj.updateDynamic("grpc.primary_user_agent")(grpcDotprimary_user_agent.asInstanceOf[js.Any])
    if (grpcDotsecondary_user_agent != null) __obj.updateDynamic("grpc.secondary_user_agent")(grpcDotsecondary_user_agent.asInstanceOf[js.Any])
    if (grpcDotservice_config != null) __obj.updateDynamic("grpc.service_config")(grpcDotservice_config.asInstanceOf[js.Any])
    if (grpcDotssl_target_name_override != null) __obj.updateDynamic("grpc.ssl_target_name_override")(grpcDotssl_target_name_override.asInstanceOf[js.Any])
    if (!js.isUndefined(grpcDotuse_local_subchannel_pool)) __obj.updateDynamic("grpc.use_local_subchannel_pool")(grpcDotuse_local_subchannel_pool.get.asInstanceOf[js.Any])
    if (interceptor_providers != null) __obj.updateDynamic("interceptor_providers")(interceptor_providers.asInstanceOf[js.Any])
    if (interceptors != null) __obj.updateDynamic("interceptors")(interceptors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

