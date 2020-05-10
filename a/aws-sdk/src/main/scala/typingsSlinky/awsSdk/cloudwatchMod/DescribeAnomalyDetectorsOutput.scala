package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAnomalyDetectorsOutput extends js.Object {
  /**
    * The list of anomaly detection models returned by the operation.
    */
  var AnomalyDetectors: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.AnomalyDetectors] = js.native
  /**
    * A token that you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.NextToken] = js.native
}

object DescribeAnomalyDetectorsOutput {
  @scala.inline
  def apply(): DescribeAnomalyDetectorsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAnomalyDetectorsOutput]
  }
  @scala.inline
  implicit class DescribeAnomalyDetectorsOutputOps[Self <: DescribeAnomalyDetectorsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnomalyDetectors(value: AnomalyDetectors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnomalyDetectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnomalyDetectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnomalyDetectors")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

