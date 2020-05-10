package typingsSlinky.awsSdkClientS3Node.typesCorsruleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledCORSRule extends CORSRule {
  /**
    * <p>Specifies which headers are allowed in a pre-flight OPTIONS request.</p>
    */
  @JSName("AllowedHeaders")
  var AllowedHeaders_UnmarshalledCORSRule: js.UndefOr[js.Array[String]] = js.native
  /**
    * <p>Identifies HTTP methods that the domain/origin specified in the rule is allowed to execute.</p>
    */
  @JSName("AllowedMethods")
  var AllowedMethods_UnmarshalledCORSRule: js.Array[String] = js.native
  /**
    * <p>One or more origins you want customers to be able to access the bucket from.</p>
    */
  @JSName("AllowedOrigins")
  var AllowedOrigins_UnmarshalledCORSRule: js.Array[String] = js.native
  /**
    * <p>One or more headers in the response that you want customers to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object).</p>
    */
  @JSName("ExposeHeaders")
  var ExposeHeaders_UnmarshalledCORSRule: js.UndefOr[js.Array[String]] = js.native
}

object UnmarshalledCORSRule {
  @scala.inline
  def apply(AllowedMethods: js.Array[String], AllowedOrigins: js.Array[String]): UnmarshalledCORSRule = {
    val __obj = js.Dynamic.literal(AllowedMethods = AllowedMethods.asInstanceOf[js.Any], AllowedOrigins = AllowedOrigins.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledCORSRule]
  }
  @scala.inline
  implicit class UnmarshalledCORSRuleOps[Self <: UnmarshalledCORSRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedMethods(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedOrigins(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedOrigins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedHeaders(value: js.Array[String]): Self = {
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
    def withExposeHeaders(value: js.Array[String]): Self = {
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
  }
  
}

