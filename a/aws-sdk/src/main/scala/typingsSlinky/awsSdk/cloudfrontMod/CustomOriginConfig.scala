package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomOriginConfig extends js.Object {
  /**
    * The HTTP port the custom origin listens on.
    */
  var HTTPPort: integer = js.native
  /**
    * The HTTPS port the custom origin listens on.
    */
  var HTTPSPort: integer = js.native
  /**
    * You can create a custom keep-alive timeout. All timeout units are in seconds. The default keep-alive timeout is 5 seconds, but you can configure custom timeout lengths using the CloudFront API. The minimum timeout length is 1 second; the maximum is 60 seconds. If you need to increase the maximum time limit, contact the AWS Support Center.
    */
  var OriginKeepaliveTimeout: js.UndefOr[integer] = js.native
  /**
    * The origin protocol policy to apply to your origin.
    */
  var OriginProtocolPolicy: typingsSlinky.awsSdk.cloudfrontMod.OriginProtocolPolicy = js.native
  /**
    * You can create a custom origin read timeout. All timeout units are in seconds. The default origin read timeout is 30 seconds, but you can configure custom timeout lengths using the CloudFront API. The minimum timeout length is 4 seconds; the maximum is 60 seconds. If you need to increase the maximum time limit, contact the AWS Support Center.
    */
  var OriginReadTimeout: js.UndefOr[integer] = js.native
  /**
    * The SSL/TLS protocols that you want CloudFront to use when communicating with your origin over HTTPS.
    */
  var OriginSslProtocols: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.OriginSslProtocols] = js.native
}

object CustomOriginConfig {
  @scala.inline
  def apply(HTTPPort: integer, HTTPSPort: integer, OriginProtocolPolicy: OriginProtocolPolicy): CustomOriginConfig = {
    val __obj = js.Dynamic.literal(HTTPPort = HTTPPort.asInstanceOf[js.Any], HTTPSPort = HTTPSPort.asInstanceOf[js.Any], OriginProtocolPolicy = OriginProtocolPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomOriginConfig]
  }
  @scala.inline
  implicit class CustomOriginConfigOps[Self <: CustomOriginConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHTTPPort(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTTPPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHTTPSPort(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTTPSPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginProtocolPolicy(value: OriginProtocolPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginProtocolPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginKeepaliveTimeout(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginKeepaliveTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginKeepaliveTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginKeepaliveTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginReadTimeout(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginReadTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginReadTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginReadTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginSslProtocols(value: OriginSslProtocols): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginSslProtocols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginSslProtocols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginSslProtocols")(js.undefined)
        ret
    }
  }
  
}

