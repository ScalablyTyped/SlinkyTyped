package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CORSRule extends js.Object {
  /**
    * Headers that are specified in the Access-Control-Request-Headers header. These headers are allowed in a preflight OPTIONS request. In response to any preflight OPTIONS request, Amazon S3 returns any requested headers that are allowed.
    */
  var AllowedHeaders: js.UndefOr[typingsSlinky.awsSdk.s3Mod.AllowedHeaders] = js.native
  /**
    * An HTTP method that you allow the origin to execute. Valid values are GET, PUT, HEAD, POST, and DELETE.
    */
  var AllowedMethods: typingsSlinky.awsSdk.s3Mod.AllowedMethods = js.native
  /**
    * One or more origins you want customers to be able to access the bucket from.
    */
  var AllowedOrigins: typingsSlinky.awsSdk.s3Mod.AllowedOrigins = js.native
  /**
    * One or more headers in the response that you want customers to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object).
    */
  var ExposeHeaders: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ExposeHeaders] = js.native
  /**
    * The time in seconds that your browser is to cache the preflight response for the specified resource.
    */
  var MaxAgeSeconds: js.UndefOr[typingsSlinky.awsSdk.s3Mod.MaxAgeSeconds] = js.native
}

object CORSRule {
  @scala.inline
  def apply(AllowedMethods: AllowedMethods, AllowedOrigins: AllowedOrigins): CORSRule = {
    val __obj = js.Dynamic.literal(AllowedMethods = AllowedMethods.asInstanceOf[js.Any], AllowedOrigins = AllowedOrigins.asInstanceOf[js.Any])
    __obj.asInstanceOf[CORSRule]
  }
  @scala.inline
  implicit class CORSRuleOps[Self <: CORSRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedMethods(value: AllowedMethods): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedOrigins(value: AllowedOrigins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedOrigins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedHeaders(value: AllowedHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedHeaders")(js.undefined)
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

