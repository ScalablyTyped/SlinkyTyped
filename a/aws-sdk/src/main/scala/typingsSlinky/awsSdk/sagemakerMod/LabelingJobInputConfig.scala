package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelingJobInputConfig extends js.Object {
  /**
    * Attributes of the data specified by the customer.
    */
  var DataAttributes: js.UndefOr[LabelingJobDataAttributes] = js.native
  /**
    * The location of the input data.
    */
  var DataSource: LabelingJobDataSource = js.native
}

object LabelingJobInputConfig {
  @scala.inline
  def apply(DataSource: LabelingJobDataSource): LabelingJobInputConfig = {
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobInputConfig]
  }
  @scala.inline
  implicit class LabelingJobInputConfigOps[Self <: LabelingJobInputConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSource(value: LabelingJobDataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataAttributes(value: LabelingJobDataAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataAttributes")(js.undefined)
        ret
    }
  }
  
}

