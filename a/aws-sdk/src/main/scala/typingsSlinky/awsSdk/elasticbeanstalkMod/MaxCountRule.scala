package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxCountRule extends js.Object {
  /**
    * Set to true to delete a version's source bundle from Amazon S3 when Elastic Beanstalk deletes the application version.
    */
  var DeleteSourceFromS3: js.UndefOr[BoxedBoolean] = js.native
  /**
    * Specify true to apply the rule, or false to disable it.
    */
  var Enabled: BoxedBoolean = js.native
  /**
    * Specify the maximum number of application versions to retain.
    */
  var MaxCount: js.UndefOr[BoxedInt] = js.native
}

object MaxCountRule {
  @scala.inline
  def apply(Enabled: BoxedBoolean): MaxCountRule = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxCountRule]
  }
  @scala.inline
  implicit class MaxCountRuleOps[Self <: MaxCountRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: BoxedBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteSourceFromS3(value: BoxedBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteSourceFromS3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteSourceFromS3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteSourceFromS3")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxCount(value: BoxedInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxCount")(js.undefined)
        ret
    }
  }
  
}

