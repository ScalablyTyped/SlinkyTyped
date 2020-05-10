package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsIotAnalyticsParameters extends js.Object {
  /**
    * Dataset name.
    */
  var DataSetName: typingsSlinky.awsSdk.quicksightMod.DataSetName = js.native
}

object AwsIotAnalyticsParameters {
  @scala.inline
  def apply(DataSetName: DataSetName): AwsIotAnalyticsParameters = {
    val __obj = js.Dynamic.literal(DataSetName = DataSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsIotAnalyticsParameters]
  }
  @scala.inline
  implicit class AwsIotAnalyticsParametersOps[Self <: AwsIotAnalyticsParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSetName(value: DataSetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSetName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

