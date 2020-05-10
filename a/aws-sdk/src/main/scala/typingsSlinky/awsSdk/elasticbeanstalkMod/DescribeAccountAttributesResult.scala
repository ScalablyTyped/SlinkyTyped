package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountAttributesResult extends js.Object {
  /**
    * The Elastic Beanstalk resource quotas associated with the calling AWS account.
    */
  var ResourceQuotas: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ResourceQuotas] = js.native
}

object DescribeAccountAttributesResult {
  @scala.inline
  def apply(): DescribeAccountAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAttributesResult]
  }
  @scala.inline
  implicit class DescribeAccountAttributesResultOps[Self <: DescribeAccountAttributesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceQuotas(value: ResourceQuotas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceQuotas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceQuotas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceQuotas")(js.undefined)
        ret
    }
  }
  
}

