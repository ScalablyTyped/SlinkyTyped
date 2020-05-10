package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeExclusionsRequest extends js.Object {
  /**
    * The list of ARNs that specify the exclusions that you want to describe.
    */
  var exclusionArns: BatchDescribeExclusionsArnList = js.native
  /**
    * The locale into which you want to translate the exclusion's title, description, and recommendation.
    */
  var locale: js.UndefOr[Locale] = js.native
}

object DescribeExclusionsRequest {
  @scala.inline
  def apply(exclusionArns: BatchDescribeExclusionsArnList): DescribeExclusionsRequest = {
    val __obj = js.Dynamic.literal(exclusionArns = exclusionArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExclusionsRequest]
  }
  @scala.inline
  implicit class DescribeExclusionsRequestOps[Self <: DescribeExclusionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclusionArns(value: BatchDescribeExclusionsArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusionArns")(value.asInstanceOf[js.Any])
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

