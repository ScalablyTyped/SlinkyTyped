package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFindingsRequest extends js.Object {
  /**
    * The ARN that specifies the finding that you want to describe.
    */
  var findingArns: BatchDescribeArnList = js.native
  /**
    * The locale into which you want to translate a finding description, recommendation, and the short description that identifies the finding.
    */
  var locale: js.UndefOr[Locale] = js.native
}

object DescribeFindingsRequest {
  @scala.inline
  def apply(findingArns: BatchDescribeArnList): DescribeFindingsRequest = {
    val __obj = js.Dynamic.literal(findingArns = findingArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFindingsRequest]
  }
  @scala.inline
  implicit class DescribeFindingsRequestOps[Self <: DescribeFindingsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindingArns(value: BatchDescribeArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findingArns")(value.asInstanceOf[js.Any])
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

