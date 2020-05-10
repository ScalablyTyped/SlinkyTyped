package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldToMatch extends js.Object {
  /**
    * Inspect all query arguments. 
    */
  var AllQueryArguments: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.AllQueryArguments] = js.native
  /**
    * Inspect the request body, which immediately follows the request headers. This is the part of a request that contains any additional data that you want to send to your web server as the HTTP request body, such as data from a form.  Note that only the first 8 KB (8192 bytes) of the request body are forwarded to AWS WAF for inspection by the underlying host service. If you don't need to inspect more than 8 KB, you can guarantee that you don't allow additional bytes in by combining a statement that inspects the body of the web request, such as ByteMatchStatement or RegexPatternSetReferenceStatement, with a SizeConstraintStatement that enforces an 8 KB size limit on the body of the request. AWS WAF doesn't support inspecting the entire contents of web requests whose bodies exceed the 8 KB limit.
    */
  var Body: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.Body] = js.native
  /**
    * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform. 
    */
  var Method: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.Method] = js.native
  /**
    * Inspect the query string. This is the part of a URL that appears after a ? character, if any.
    */
  var QueryString: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.QueryString] = js.native
  /**
    * Inspect a single header. Provide the name of the header to inspect, for example, User-Agent or Referer. This setting isn't case sensitive.
    */
  var SingleHeader: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.SingleHeader] = js.native
  /**
    * Inspect a single query argument. Provide the name of the query argument to inspect, such as UserName or SalesRegion. The name can be up to 30 characters long and isn't case sensitive.  This is used only to indicate the web request component for AWS WAF to inspect, in the FieldToMatch specification. 
    */
  var SingleQueryArgument: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.SingleQueryArgument] = js.native
  /**
    * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, /images/daily-ad.jpg.
    */
  var UriPath: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.UriPath] = js.native
}

object FieldToMatch {
  @scala.inline
  def apply(): FieldToMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldToMatch]
  }
  @scala.inline
  implicit class FieldToMatchOps[Self <: FieldToMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllQueryArguments(value: AllQueryArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllQueryArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllQueryArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllQueryArguments")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: Method): Self = {
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
    def withQueryString(value: QueryString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryString")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleHeader(value: SingleHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SingleHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SingleHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleQueryArgument(value: SingleQueryArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SingleQueryArgument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleQueryArgument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SingleQueryArgument")(js.undefined)
        ret
    }
    @scala.inline
    def withUriPath(value: UriPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UriPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUriPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UriPath")(js.undefined)
        ret
    }
  }
  
}

