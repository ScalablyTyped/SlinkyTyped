package typingsSlinky.awsLambda.cloudfrontMod

import typingsSlinky.awsLambda.awsLambdaStrings.http
import typingsSlinky.awsLambda.awsLambdaStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFrontCustomOrigin extends js.Object {
  var customHeaders: CloudFrontHeaders = js.native
  var domainName: String = js.native
  var keepaliveTimeout: Double = js.native
  var path: String = js.native
  var port: Double = js.native
  var protocol: http | https = js.native
  var readTimeout: Double = js.native
  var sslProtocols: js.Array[String] = js.native
}

object CloudFrontCustomOrigin {
  @scala.inline
  def apply(
    customHeaders: CloudFrontHeaders,
    domainName: String,
    keepaliveTimeout: Double,
    path: String,
    port: Double,
    protocol: http | https,
    readTimeout: Double,
    sslProtocols: js.Array[String]
  ): CloudFrontCustomOrigin = {
    val __obj = js.Dynamic.literal(customHeaders = customHeaders.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], keepaliveTimeout = keepaliveTimeout.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], readTimeout = readTimeout.asInstanceOf[js.Any], sslProtocols = sslProtocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontCustomOrigin]
  }
  @scala.inline
  implicit class CloudFrontCustomOriginOps[Self <: CloudFrontCustomOrigin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomHeaders(value: CloudFrontHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepaliveTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepaliveTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: http | https): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSslProtocols(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslProtocols")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

