package typingsSlinky.pulumiAws.outputMod.cloudwatch

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricAlarmMetricQueryMetric extends js.Object {
  
  /**
    * The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  var dimensions: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The name for this metric.
    * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  var metricName: String = js.native
  
  /**
    * The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
    * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  var namespace: js.UndefOr[String] = js.native
  
  /**
    * The period in seconds over which the specified `stat` is applied.
    */
  var period: Double = js.native
  
  /**
    * The statistic to apply to this metric.
    * Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
    */
  var stat: String = js.native
  
  /**
    * The unit for this metric.
    */
  var unit: js.UndefOr[String] = js.native
}
object MetricAlarmMetricQueryMetric {
  
  @scala.inline
  def apply(metricName: String, period: Double, stat: String): MetricAlarmMetricQueryMetric = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricAlarmMetricQueryMetric]
  }
  
  @scala.inline
  implicit class MetricAlarmMetricQueryMetricOps[Self <: MetricAlarmMetricQueryMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMetricName(value: String): Self = this.set("metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriod(value: Double): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStat(value: String): Self = this.set("stat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensions(value: StringDictionary[String]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
