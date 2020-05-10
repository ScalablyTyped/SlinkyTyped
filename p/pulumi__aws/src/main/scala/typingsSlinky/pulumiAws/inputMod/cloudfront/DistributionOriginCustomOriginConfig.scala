package typingsSlinky.pulumiAws.inputMod.cloudfront

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionOriginCustomOriginConfig extends js.Object {
  /**
    * The HTTP port the custom origin listens on.
    */
  var httpPort: Input[Double] = js.native
  /**
    * The HTTPS port the custom origin listens on.
    */
  var httpsPort: Input[Double] = js.native
  /**
    * The Custom KeepAlive timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
    */
  var originKeepaliveTimeout: js.UndefOr[Input[Double]] = js.native
  /**
    * The origin protocol policy to apply to
    * your origin. One of `http-only`, `https-only`, or `match-viewer`.
    */
  var originProtocolPolicy: Input[String] = js.native
  /**
    * The Custom Read timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
    */
  var originReadTimeout: js.UndefOr[Input[Double]] = js.native
  /**
    * The SSL/TLS protocols that you want
    * CloudFront to use when communicating with your origin over HTTPS. A list of
    * one or more of `SSLv3`, `TLSv1`, `TLSv1.1`, and `TLSv1.2`.
    */
  var originSslProtocols: Input[js.Array[Input[String]]] = js.native
}

object DistributionOriginCustomOriginConfig {
  @scala.inline
  def apply(
    httpPort: Input[Double],
    httpsPort: Input[Double],
    originProtocolPolicy: Input[String],
    originSslProtocols: Input[js.Array[Input[String]]]
  ): DistributionOriginCustomOriginConfig = {
    val __obj = js.Dynamic.literal(httpPort = httpPort.asInstanceOf[js.Any], httpsPort = httpsPort.asInstanceOf[js.Any], originProtocolPolicy = originProtocolPolicy.asInstanceOf[js.Any], originSslProtocols = originSslProtocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOriginCustomOriginConfig]
  }
  @scala.inline
  implicit class DistributionOriginCustomOriginConfigOps[Self <: DistributionOriginCustomOriginConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpPort(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpsPort(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpsPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginProtocolPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originProtocolPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginSslProtocols(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originSslProtocols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginKeepaliveTimeout(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originKeepaliveTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginKeepaliveTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originKeepaliveTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginReadTimeout(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originReadTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginReadTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originReadTimeout")(js.undefined)
        ret
    }
  }
  
}

