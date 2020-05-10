package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomErrorResponse extends js.Object {
  /**
    * The minimum amount of time, in seconds, that you want CloudFront to cache the HTTP status code specified in ErrorCode. When this time period has elapsed, CloudFront queries your origin to see whether the problem that caused the error has been resolved and the requested object is now available. For more information, see Customizing Error Responses in the Amazon CloudFront Developer Guide.
    */
  var ErrorCachingMinTTL: js.UndefOr[long] = js.native
  /**
    * The HTTP status code for which you want to specify a custom error page and/or a caching duration.
    */
  var ErrorCode: integer = js.native
  /**
    * The HTTP status code that you want CloudFront to return to the viewer along with the custom error page. There are a variety of reasons that you might want CloudFront to return a status code different from the status code that your origin returned to CloudFront, for example:   Some Internet devices (some firewalls and corporate proxies, for example) intercept HTTP 4xx and 5xx and prevent the response from being returned to the viewer. If you substitute 200, the response typically won't be intercepted.   If you don't care about distinguishing among different client errors or server errors, you can specify 400 or 500 as the ResponseCode for all 4xx or 5xx errors.   You might want to return a 200 status code (OK) and static website so your customers don't know that your website is down.   If you specify a value for ResponseCode, you must also specify a value for ResponsePagePath.
    */
  var ResponseCode: js.UndefOr[String] = js.native
  /**
    * The path to the custom error page that you want CloudFront to return to a viewer when your origin returns the HTTP status code specified by ErrorCode, for example, /4xx-errors/403-forbidden.html. If you want to store your objects and your custom error pages in different locations, your distribution must include a cache behavior for which the following is true:   The value of PathPattern matches the path to your custom error messages. For example, suppose you saved custom error pages for 4xx errors in an Amazon S3 bucket in a directory named /4xx-errors. Your distribution must include a cache behavior for which the path pattern routes requests for your custom error pages to that location, for example, /4xx-errors/ *.    The value of TargetOriginId specifies the value of the ID element for the origin that contains your custom error pages.   If you specify a value for ResponsePagePath, you must also specify a value for ResponseCode. We recommend that you store custom error pages in an Amazon S3 bucket. If you store custom error pages on an HTTP server and the server starts to return 5xx errors, CloudFront can't get the files that you want to return to viewers because the origin server is unavailable.
    */
  var ResponsePagePath: js.UndefOr[String] = js.native
}

object CustomErrorResponse {
  @scala.inline
  def apply(ErrorCode: integer): CustomErrorResponse = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomErrorResponse]
  }
  @scala.inline
  implicit class CustomErrorResponseOps[Self <: CustomErrorResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorCachingMinTTL(value: long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCachingMinTTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCachingMinTTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCachingMinTTL")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseCode")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsePagePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponsePagePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsePagePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponsePagePath")(js.undefined)
        ret
    }
  }
  
}

