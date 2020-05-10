package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeApplicationsMessage extends js.Object {
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to only include those with the specified names.
    */
  var ApplicationNames: js.UndefOr[ApplicationNamesList] = js.native
}

object DescribeApplicationsMessage {
  @scala.inline
  def apply(): DescribeApplicationsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeApplicationsMessage]
  }
  @scala.inline
  implicit class DescribeApplicationsMessageOps[Self <: DescribeApplicationsMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationNames(value: ApplicationNamesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationNames")(js.undefined)
        ret
    }
  }
  
}

