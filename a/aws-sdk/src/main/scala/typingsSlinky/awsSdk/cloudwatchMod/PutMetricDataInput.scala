package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutMetricDataInput extends js.Object {
  /**
    * The data for the metric. The array can include no more than 20 metrics per call.
    */
  var MetricData: typingsSlinky.awsSdk.cloudwatchMod.MetricData = js.native
  /**
    * The namespace for the metric data. To avoid conflicts with AWS service namespaces, you should not specify a namespace that begins with AWS/ 
    */
  var Namespace: typingsSlinky.awsSdk.cloudwatchMod.Namespace = js.native
}

object PutMetricDataInput {
  @scala.inline
  def apply(MetricData: MetricData, Namespace: Namespace): PutMetricDataInput = {
    val __obj = js.Dynamic.literal(MetricData = MetricData.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutMetricDataInput]
  }
  @scala.inline
  implicit class PutMetricDataInputOps[Self <: PutMetricDataInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricData(value: MetricData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: Namespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Namespace")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

