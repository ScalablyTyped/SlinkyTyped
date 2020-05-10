package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricDefinition extends js.Object {
  /**
    * The name of the metric.
    */
  var Name: MetricName = js.native
  /**
    * A regular expression that searches the output of a training job and gets the value of the metric. For more information about using regular expressions to define metrics, see Defining Objective Metrics.
    */
  var Regex: MetricRegex = js.native
}

object MetricDefinition {
  @scala.inline
  def apply(Name: MetricName, Regex: MetricRegex): MetricDefinition = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Regex = Regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDefinition]
  }
  @scala.inline
  implicit class MetricDefinitionOps[Self <: MetricDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: MetricName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegex(value: MetricRegex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Regex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

