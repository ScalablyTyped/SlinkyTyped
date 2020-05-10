package typingsSlinky.awsSdkClientDynamodbNode.typesProvisionedThroughputDescriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledProvisionedThroughputDescription extends ProvisionedThroughputDescription {
  /**
    * <p>The date and time of the last provisioned throughput decrease for this table.</p>
    */
  @JSName("LastDecreaseDateTime")
  var LastDecreaseDateTime_UnmarshalledProvisionedThroughputDescription: js.UndefOr[js.Date] = js.native
  /**
    * <p>The date and time of the last provisioned throughput increase for this table.</p>
    */
  @JSName("LastIncreaseDateTime")
  var LastIncreaseDateTime_UnmarshalledProvisionedThroughputDescription: js.UndefOr[js.Date] = js.native
}

object UnmarshalledProvisionedThroughputDescription {
  @scala.inline
  def apply(): UnmarshalledProvisionedThroughputDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledProvisionedThroughputDescription]
  }
  @scala.inline
  implicit class UnmarshalledProvisionedThroughputDescriptionOps[Self <: UnmarshalledProvisionedThroughputDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastDecreaseDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastDecreaseDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastDecreaseDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastDecreaseDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastIncreaseDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastIncreaseDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastIncreaseDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastIncreaseDateTime")(js.undefined)
        ret
    }
  }
  
}

