package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDataConfig extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset group.
    */
  var DatasetGroupArn: Arn = js.native
  /**
    * An array of supplementary features. The only supported feature is a holiday calendar.
    */
  var SupplementaryFeatures: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.SupplementaryFeatures] = js.native
}

object InputDataConfig {
  @scala.inline
  def apply(DatasetGroupArn: Arn): InputDataConfig = {
    val __obj = js.Dynamic.literal(DatasetGroupArn = DatasetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputDataConfig]
  }
  @scala.inline
  implicit class InputDataConfigOps[Self <: InputDataConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatasetGroupArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupplementaryFeatures(value: SupplementaryFeatures): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupplementaryFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupplementaryFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupplementaryFeatures")(js.undefined)
        ret
    }
  }
  
}

