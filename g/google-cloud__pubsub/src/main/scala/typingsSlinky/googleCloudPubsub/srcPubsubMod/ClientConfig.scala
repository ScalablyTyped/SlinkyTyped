package typingsSlinky.googleCloudPubsub.srcPubsubMod

import typingsSlinky.googleGax.grpcMod.GrpcClientOptions
import typingsSlinky.grpcGrpcJs.mod.ChannelCredentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientConfig extends GrpcClientOptions {
  var apiEndpoint: js.UndefOr[String] = js.native
  var port: js.UndefOr[String | Double] = js.native
  var servicePath: js.UndefOr[String] = js.native
  var sslCreds: js.UndefOr[ChannelCredentials] = js.native
}

object ClientConfig {
  @scala.inline
  def apply(): ClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientConfig]
  }
  @scala.inline
  implicit class ClientConfigOps[Self <: ClientConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withServicePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServicePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicePath")(js.undefined)
        ret
    }
    @scala.inline
    def withSslCreds(value: ChannelCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCreds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslCreds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCreds")(js.undefined)
        ret
    }
  }
  
}

