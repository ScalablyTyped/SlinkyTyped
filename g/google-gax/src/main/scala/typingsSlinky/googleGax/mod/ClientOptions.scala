package typingsSlinky.googleGax.mod

import typingsSlinky.googleGax.gaxMod.ClientConfig
import typingsSlinky.googleGax.grpcMod.ClientStubOptions
import typingsSlinky.googleGax.grpcMod.GrpcClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOptions
  extends GrpcClientOptions
     with ClientStubOptions {
  var apiEndpoint: js.UndefOr[String] = js.native
  var clientConfig: js.UndefOr[ClientConfig] = js.native
  var fallback: js.UndefOr[Boolean] = js.native
  var libName: js.UndefOr[String] = js.native
  var libVersion: js.UndefOr[String] = js.native
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
    def withClientConfig(value: ClientConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withFallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(js.undefined)
        ret
    }
    @scala.inline
    def withLibName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLibName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libName")(js.undefined)
        ret
    }
    @scala.inline
    def withLibVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLibVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libVersion")(js.undefined)
        ret
    }
  }
  
}

