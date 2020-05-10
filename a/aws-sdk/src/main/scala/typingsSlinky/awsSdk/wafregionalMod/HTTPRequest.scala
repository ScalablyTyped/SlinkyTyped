package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTTPRequest extends js.Object {
  /**
    * The IP address that the request originated from. If the WebACL is associated with a CloudFront distribution, this is the value of one of the following fields in CloudFront access logs:    c-ip, if the viewer did not use an HTTP proxy or a load balancer to send the request    x-forwarded-for, if the viewer did use an HTTP proxy or a load balancer to send the request  
    */
  var ClientIP: js.UndefOr[IPString] = js.native
  /**
    * The two-letter country code for the country that the request originated from. For a current list of country codes, see the Wikipedia entry ISO 3166-1 alpha-2.
    */
  var Country: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.Country] = js.native
  /**
    * The HTTP version specified in the sampled web request, for example, HTTP/1.1.
    */
  var HTTPVersion: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.HTTPVersion] = js.native
  /**
    * A complex type that contains two values for each header in the sampled web request: the name of the header and the value of the header.
    */
  var Headers: js.UndefOr[HTTPHeaders] = js.native
  /**
    * The HTTP method specified in the sampled web request. CloudFront supports the following methods: DELETE, GET, HEAD, OPTIONS, PATCH, POST, and PUT. 
    */
  var Method: js.UndefOr[HTTPMethod] = js.native
  /**
    * The part of a web request that identifies the resource, for example, /images/daily-ad.jpg.
    */
  var URI: js.UndefOr[URIString] = js.native
}

object HTTPRequest {
  @scala.inline
  def apply(): HTTPRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTTPRequest]
  }
  @scala.inline
  implicit class HTTPRequestOps[Self <: HTTPRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientIP(value: IPString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientIP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientIP")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: Country): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Country")(js.undefined)
        ret
    }
    @scala.inline
    def withHTTPVersion(value: HTTPVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTTPVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHTTPVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTTPVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: HTTPHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Headers")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: HTTPMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Method")(js.undefined)
        ret
    }
    @scala.inline
    def withURI(value: URIString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutURI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URI")(js.undefined)
        ret
    }
  }
  
}

