package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventTopicsResult extends js.Object {
  /**
    * A list of SNS topic names that receive status messages from the specified Directory ID.
    */
  var EventTopics: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.EventTopics] = js.native
}

object DescribeEventTopicsResult {
  @scala.inline
  def apply(): DescribeEventTopicsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventTopicsResult]
  }
  @scala.inline
  implicit class DescribeEventTopicsResultOps[Self <: DescribeEventTopicsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventTopics(value: EventTopics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventTopics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTopics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventTopics")(js.undefined)
        ret
    }
  }
  
}

