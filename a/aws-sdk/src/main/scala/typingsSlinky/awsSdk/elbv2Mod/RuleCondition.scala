package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleCondition extends js.Object {
  /**
    * The field in the HTTP request. The following are the possible values:    http-header     http-request-method     host-header     path-pattern     query-string     source-ip   
    */
  var Field: js.UndefOr[ConditionFieldName] = js.native
  /**
    * Information for a host header condition. Specify only when Field is host-header.
    */
  var HostHeaderConfig: js.UndefOr[HostHeaderConditionConfig] = js.native
  /**
    * Information for an HTTP header condition. Specify only when Field is http-header.
    */
  var HttpHeaderConfig: js.UndefOr[HttpHeaderConditionConfig] = js.native
  /**
    * Information for an HTTP method condition. Specify only when Field is http-request-method.
    */
  var HttpRequestMethodConfig: js.UndefOr[HttpRequestMethodConditionConfig] = js.native
  /**
    * Information for a path pattern condition. Specify only when Field is path-pattern.
    */
  var PathPatternConfig: js.UndefOr[PathPatternConditionConfig] = js.native
  /**
    * Information for a query string condition. Specify only when Field is query-string.
    */
  var QueryStringConfig: js.UndefOr[QueryStringConditionConfig] = js.native
  /**
    * Information for a source IP condition. Specify only when Field is source-ip.
    */
  var SourceIpConfig: js.UndefOr[SourceIpConditionConfig] = js.native
  /**
    * The condition value. You can use Values if the rule contains only host-header and path-pattern conditions. Otherwise, you can use HostHeaderConfig for host-header conditions and PathPatternConfig for path-pattern conditions. If Field is host-header, you can specify a single host name (for example, my.example.com). A host name is case insensitive, can be up to 128 characters in length, and can contain any of the following characters.   A-Z, a-z, 0-9   - .   * (matches 0 or more characters)   ? (matches exactly 1 character)   If Field is path-pattern, you can specify a single path pattern (for example, /img/ *). A path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of the following characters.   A-Z, a-z, 0-9   _ - . $ / ~ " ' @ : +   &amp; (using &amp;amp;)   * (matches 0 or more characters)   ? (matches exactly 1 character)  
    */
  var Values: js.UndefOr[ListOfString] = js.native
}

object RuleCondition {
  @scala.inline
  def apply(): RuleCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleCondition]
  }
  @scala.inline
  implicit class RuleConditionOps[Self <: RuleCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: ConditionFieldName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Field")(js.undefined)
        ret
    }
    @scala.inline
    def withHostHeaderConfig(value: HostHeaderConditionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostHeaderConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostHeaderConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostHeaderConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpHeaderConfig(value: HttpHeaderConditionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpHeaderConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpHeaderConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpHeaderConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpRequestMethodConfig(value: HttpRequestMethodConditionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpRequestMethodConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpRequestMethodConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpRequestMethodConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withPathPatternConfig(value: PathPatternConditionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PathPatternConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathPatternConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PathPatternConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryStringConfig(value: QueryStringConditionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryStringConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryStringConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryStringConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceIpConfig(value: SourceIpConditionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceIpConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceIpConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceIpConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: ListOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(js.undefined)
        ret
    }
  }
  
}

