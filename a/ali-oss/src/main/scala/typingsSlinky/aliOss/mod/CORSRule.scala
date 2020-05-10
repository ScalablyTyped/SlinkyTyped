package typingsSlinky.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CORSRule extends js.Object {
   // configure for Access-Control-Allow-Methods header
  var allowedHeader: js.UndefOr[String | js.Array[String]] = js.native
   // configure for Access-Control-Allow-Origin header
  var allowedMethod: String | js.Array[String] = js.native
  var allowedOrigin: String | js.Array[String] = js.native
   // configure for Access-Control-Allow-Headers header
  var exposeHeader: js.UndefOr[String | js.Array[String]] = js.native
   // configure for Access-Control-Expose-Headers header
  var maxAgeSeconds: js.UndefOr[String | js.Array[String]] = js.native
}

object CORSRule {
  @scala.inline
  def apply(allowedMethod: String | js.Array[String], allowedOrigin: String | js.Array[String]): CORSRule = {
    val __obj = js.Dynamic.literal(allowedMethod = allowedMethod.asInstanceOf[js.Any], allowedOrigin = allowedOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CORSRule]
  }
  @scala.inline
  implicit class CORSRuleOps[Self <: CORSRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedMethod(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedOrigin(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedHeader(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withExposeHeader(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposeHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposeHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposeHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAgeSeconds(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAgeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAgeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAgeSeconds")(js.undefined)
        ret
    }
  }
  
}

