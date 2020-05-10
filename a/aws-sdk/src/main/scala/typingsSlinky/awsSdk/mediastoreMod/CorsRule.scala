package typingsSlinky.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CorsRule extends js.Object {
  /**
    * Specifies which headers are allowed in a preflight OPTIONS request through the Access-Control-Request-Headers header. Each header name that is specified in Access-Control-Request-Headers must have a corresponding entry in the rule. Only the headers that were requested are sent back.  This element can contain only one wildcard character (*).
    */
  var AllowedHeaders: typingsSlinky.awsSdk.mediastoreMod.AllowedHeaders = js.native
  /**
    * Identifies an HTTP method that the origin that is specified in the rule is allowed to execute. Each CORS rule must contain at least one AllowedMethods and one AllowedOrigins element.
    */
  var AllowedMethods: js.UndefOr[typingsSlinky.awsSdk.mediastoreMod.AllowedMethods] = js.native
  /**
    * One or more response headers that you want users to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object). Each CORS rule must have at least one AllowedOrigins element. The string value can include only one wildcard character (*), for example, http:// *.example.com. Additionally, you can specify only one wildcard character to allow cross-origin access for all origins.
    */
  var AllowedOrigins: typingsSlinky.awsSdk.mediastoreMod.AllowedOrigins = js.native
  /**
    * One or more headers in the response that you want users to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object). This element is optional for each rule.
    */
  var ExposeHeaders: js.UndefOr[typingsSlinky.awsSdk.mediastoreMod.ExposeHeaders] = js.native
  /**
    * The time in seconds that your browser caches the preflight response for the specified resource. A CORS rule can have only one MaxAgeSeconds element.
    */
  var MaxAgeSeconds: js.UndefOr[typingsSlinky.awsSdk.mediastoreMod.MaxAgeSeconds] = js.native
}

object CorsRule {
  @scala.inline
  def apply(AllowedHeaders: AllowedHeaders, AllowedOrigins: AllowedOrigins): CorsRule = {
    val __obj = js.Dynamic.literal(AllowedHeaders = AllowedHeaders.asInstanceOf[js.Any], AllowedOrigins = AllowedOrigins.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorsRule]
  }
  @scala.inline
  implicit class CorsRuleOps[Self <: CorsRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedHeaders(value: AllowedHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedOrigins(value: AllowedOrigins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedOrigins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedMethods(value: AllowedMethods): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withExposeHeaders(value: ExposeHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExposeHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposeHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExposeHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAgeSeconds(value: MaxAgeSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxAgeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAgeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxAgeSeconds")(js.undefined)
        ret
    }
  }
  
}

