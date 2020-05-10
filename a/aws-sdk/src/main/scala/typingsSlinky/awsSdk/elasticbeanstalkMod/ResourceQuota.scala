package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceQuota extends js.Object {
  /**
    * The maximum number of instances of this Elastic Beanstalk resource type that an AWS account can use.
    */
  var Maximum: js.UndefOr[BoxedInt] = js.native
}

object ResourceQuota {
  @scala.inline
  def apply(): ResourceQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceQuota]
  }
  @scala.inline
  implicit class ResourceQuotaOps[Self <: ResourceQuota] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximum(value: BoxedInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Maximum")(js.undefined)
        ret
    }
  }
  
}

