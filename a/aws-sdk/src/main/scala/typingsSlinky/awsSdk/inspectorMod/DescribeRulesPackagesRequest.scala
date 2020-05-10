package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRulesPackagesRequest extends js.Object {
  /**
    * The locale that you want to translate a rules package description into.
    */
  var locale: js.UndefOr[Locale] = js.native
  /**
    * The ARN that specifies the rules package that you want to describe.
    */
  var rulesPackageArns: BatchDescribeArnList = js.native
}

object DescribeRulesPackagesRequest {
  @scala.inline
  def apply(rulesPackageArns: BatchDescribeArnList): DescribeRulesPackagesRequest = {
    val __obj = js.Dynamic.literal(rulesPackageArns = rulesPackageArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRulesPackagesRequest]
  }
  @scala.inline
  implicit class DescribeRulesPackagesRequestOps[Self <: DescribeRulesPackagesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRulesPackageArns(value: BatchDescribeArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesPackageArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
  }
  
}

