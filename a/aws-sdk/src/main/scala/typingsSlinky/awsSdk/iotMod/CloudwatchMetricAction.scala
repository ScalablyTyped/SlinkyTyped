package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudwatchMetricAction extends js.Object {
  /**
    * The CloudWatch metric name.
    */
  var metricName: String = js.native
  /**
    * The CloudWatch metric namespace name.
    */
  var metricNamespace: String = js.native
  /**
    * An optional Unix timestamp.
    */
  var metricTimestamp: js.UndefOr[String] = js.native
  /**
    * The metric unit supported by CloudWatch.
    */
  var metricUnit: String = js.native
  /**
    * The CloudWatch metric value.
    */
  var metricValue: String = js.native
  /**
    * The IAM role that allows access to the CloudWatch metric.
    */
  var roleArn: AwsArn = js.native
}

object CloudwatchMetricAction {
  @scala.inline
  def apply(
    metricName: String,
    metricNamespace: String,
    metricUnit: String,
    metricValue: String,
    roleArn: AwsArn
  ): CloudwatchMetricAction = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], metricNamespace = metricNamespace.asInstanceOf[js.Any], metricUnit = metricUnit.asInstanceOf[js.Any], metricValue = metricValue.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudwatchMetricAction]
  }
  @scala.inline
  implicit class CloudwatchMetricActionOps[Self <: CloudwatchMetricAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetricNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetricUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetricValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: AwsArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetricTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricTimestamp")(js.undefined)
        ret
    }
  }
  
}

