package typingsSlinky.grpcGrpcJs.clientMod

import typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
import typingsSlinky.grpcGrpcJs.channelMod.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/channel-options.ChannelOptions> & {  channelOverride ? :@grpc/grpc-js.@grpc/grpc-js/build/src/channel.Channel, channelFactoryOverride ? (address : string, credentials : @grpc/grpc-js.@grpc/grpc-js/build/src/channel-credentials.ChannelCredentials, options : @grpc/grpc-js.@grpc/grpc-js/build/src/client.ClientOptions): @grpc/grpc-js.@grpc/grpc-js/build/src/channel.Channel} */
@js.native
trait ClientOptions extends js.Object {
  var channelFactoryOverride: js.UndefOr[
    js.Function3[
      /* address */ String, 
      /* credentials */ ChannelCredentials, 
      /* options */ ClientOptions, 
      Channel
    ]
  ] = js.native
  var channelOverride: js.UndefOr[Channel] = js.native
  @JSName("grpc.default_authority")
  var grpcDotdefault_authority: js.UndefOr[String] = js.native
  @JSName("grpc.initial_reconnect_backoff_ms")
  var grpcDotinitial_reconnect_backoff_ms: js.UndefOr[Double] = js.native
  @JSName("grpc.keepalive_time_ms")
  var grpcDotkeepalive_time_ms: js.UndefOr[Double] = js.native
  @JSName("grpc.keepalive_timeout_ms")
  var grpcDotkeepalive_timeout_ms: js.UndefOr[Double] = js.native
  @JSName("grpc.max_concurrent_streams")
  var grpcDotmax_concurrent_streams: js.UndefOr[Double] = js.native
  @JSName("grpc.max_reconnect_backoff_ms")
  var grpcDotmax_reconnect_backoff_ms: js.UndefOr[Double] = js.native
  @JSName("grpc.primary_user_agent")
  var grpcDotprimary_user_agent: js.UndefOr[String] = js.native
  @JSName("grpc.secondary_user_agent")
  var grpcDotsecondary_user_agent: js.UndefOr[String] = js.native
  @JSName("grpc.service_config")
  var grpcDotservice_config: js.UndefOr[String] = js.native
  @JSName("grpc.ssl_target_name_override")
  var grpcDotssl_target_name_override: js.UndefOr[String] = js.native
  @JSName("grpc.use_local_subchannel_pool")
  var grpcDotuse_local_subchannel_pool: js.UndefOr[Double] = js.native
}

object ClientOptions {
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelFactoryOverride(
      value: (/* address */ String, /* credentials */ ChannelCredentials, /* options */ ClientOptions) => Channel
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelFactoryOverride")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutChannelFactoryOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelFactoryOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelOverride(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withGrpcDotdefault_authority(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpc.default_authority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrpcDotdefault_authority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpc.default_authority")(js.undefined)
        ret
    }
    @scala.inline
    def withGrpcDotinitial_reconnect_backoff_ms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpc.initial_reconnect_backoff_ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrpcDotinitial_reconnect_backoff_ms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpc.initial_reconnect_backoff_ms")(js.undefined)
        ret
    }
    @scala.inline
    def withGrpcDotkeepalive_time_ms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpc.keepalive_time_ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrpcDotkeepalive_time_ms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpc.keepalive_time_ms")(js.undefined)
        ret
    }
    @scala.inline
    def withGrpcDotkeepalive_timeout_ms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpc.keepalive_timeout_ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrpcDotkeepalive_timeout_ms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpc.keepalive_timeout_ms")(js.undefined)
        ret
    }
    @scala.inline
    def withGrpcDotmax_concurrent_streams(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpc.max_concurrent_streams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrpcDotmax_concurrent_streams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpc.max_concurrent_streams")(js.undefined)
        ret
    }
    @scala.inline
    def withGrpcDotmax_reconnect_backoff_ms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpc.max_reconnect_backoff_ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrpcDotmax_reconnect_backoff_ms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpc.max_reconnect_backoff_ms")(js.undefined)
        ret
    }
    @scala.inline
    def withGrpcDotprimary_user_agent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpc.primary_user_agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrpcDotprimary_user_agent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpc.primary_user_agent")(js.undefined)
        ret
    }
    @scala.inline
    def withGrpcDotsecondary_user_agent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpc.secondary_user_agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrpcDotsecondary_user_agent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpc.secondary_user_agent")(js.undefined)
        ret
    }
    @scala.inline
    def withGrpcDotservice_config(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpc.service_config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrpcDotservice_config: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpc.service_config")(js.undefined)
        ret
    }
    @scala.inline
    def withGrpcDotssl_target_name_override(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpc.ssl_target_name_override")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrpcDotssl_target_name_override: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpc.ssl_target_name_override")(js.undefined)
        ret
    }
    @scala.inline
    def withGrpcDotuse_local_subchannel_pool(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpc.use_local_subchannel_pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrpcDotuse_local_subchannel_pool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpc.use_local_subchannel_pool")(js.undefined)
        ret
    }
  }
  
}

