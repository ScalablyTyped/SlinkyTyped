package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketMetricsConfigurationOutput extends js.Object {
  /**
    * Specifies the metrics configuration.
    */
  var MetricsConfiguration: js.UndefOr[typingsSlinky.awsSdk.s3Mod.MetricsConfiguration] = js.native
}

object GetBucketMetricsConfigurationOutput {
  @scala.inline
  def apply(): GetBucketMetricsConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketMetricsConfigurationOutput]
  }
  @scala.inline
  implicit class GetBucketMetricsConfigurationOutputOps[Self <: GetBucketMetricsConfigurationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricsConfiguration(value: MetricsConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricsConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricsConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricsConfiguration")(js.undefined)
        ret
    }
  }
  
}

