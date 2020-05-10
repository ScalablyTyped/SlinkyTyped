package typingsSlinky.awsSdkClientS3Browser.typesCorsruleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CORSRule extends js.Object {
  /**
    * <p>Specifies which headers are allowed in a pre-flight OPTIONS request.</p>
    */
  var AllowedHeaders: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
  /**
    * <p>Identifies HTTP methods that the domain/origin specified in the rule is allowed to execute.</p>
    */
  var AllowedMethods: js.Array[String] | js.Iterable[String] = js.native
  /**
    * <p>One or more origins you want customers to be able to access the bucket from.</p>
    */
  var AllowedOrigins: js.Array[String] | js.Iterable[String] = js.native
  /**
    * <p>One or more headers in the response that you want customers to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object).</p>
    */
  var ExposeHeaders: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
  /**
    * <p>The time in seconds that your browser is to cache the preflight response for the specified resource.</p>
    */
  var MaxAgeSeconds: js.UndefOr[Double] = js.native
}

object CORSRule {
  @scala.inline
  def apply(
    AllowedMethods: js.Array[String] | js.Iterable[String],
    AllowedOrigins: js.Array[String] | js.Iterable[String]
  ): CORSRule = {
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
    def withAllowedMethodsIterable(value: js.Iterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedMethods(value: js.Array[String] | js.Iterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedOriginsIterable(value: js.Iterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedOrigins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedOrigins(value: js.Array[String] | js.Iterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedOrigins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedHeadersIterable(value: js.Iterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedHeaders(value: js.Array[String] | js.Iterable[String]): Self = {
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
    def withExposeHeadersIterable(value: js.Iterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExposeHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExposeHeaders(value: js.Array[String] | js.Iterable[String]): Self = {
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
    def withMaxAgeSeconds(value: Double): Self = {
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

