package typingsSlinky.pulumiAws.logMetricFilterMod

import typingsSlinky.pulumiAws.inputMod.cloudwatch.LogMetricFilterMetricTransformation
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogMetricFilterState extends js.Object {
  
  /**
    * The name of the log group to associate the metric filter with.
    */
  val logGroupName: js.UndefOr[Input[String]] = js.native
  
  /**
    * A block defining collection of information needed to define how metric data gets emitted. See below.
    */
  val metricTransformation: js.UndefOr[Input[LogMetricFilterMetricTransformation]] = js.native
  
  /**
    * A name for the metric filter.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
    * for extracting metric data out of ingested log events.
    */
  val pattern: js.UndefOr[Input[String]] = js.native
}
object LogMetricFilterState {
  
  @scala.inline
  def apply(): LogMetricFilterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogMetricFilterState]
  }
  
  @scala.inline
  implicit class LogMetricFilterStateOps[Self <: LogMetricFilterState] (val x: Self) extends AnyVal {
    
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
    def setLogGroupName(value: Input[String]): Self = this.set("logGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogGroupName: Self = this.set("logGroupName", js.undefined)
    
    @scala.inline
    def setMetricTransformation(value: Input[LogMetricFilterMetricTransformation]): Self = this.set("metricTransformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricTransformation: Self = this.set("metricTransformation", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPattern(value: Input[String]): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
  }
}
