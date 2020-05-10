package typingsSlinky.awsSdkClientDynamodbNode.typesContinuousBackupsDescriptionMod

import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DISABLED
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ENABLED
import typingsSlinky.awsSdkClientDynamodbNode.typesPointInTimeRecoveryDescriptionMod.UnmarshalledPointInTimeRecoveryDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledContinuousBackupsDescription extends ContinuousBackupsDescription {
  /**
    * <p>The description of the point in time recovery settings applied to the table.</p>
    */
  @JSName("PointInTimeRecoveryDescription")
  var PointInTimeRecoveryDescription_UnmarshalledContinuousBackupsDescription: js.UndefOr[UnmarshalledPointInTimeRecoveryDescription] = js.native
}

object UnmarshalledContinuousBackupsDescription {
  @scala.inline
  def apply(ContinuousBackupsStatus: ENABLED | DISABLED | String): UnmarshalledContinuousBackupsDescription = {
    val __obj = js.Dynamic.literal(ContinuousBackupsStatus = ContinuousBackupsStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledContinuousBackupsDescription]
  }
  @scala.inline
  implicit class UnmarshalledContinuousBackupsDescriptionOps[Self <: UnmarshalledContinuousBackupsDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPointInTimeRecoveryDescription(value: UnmarshalledPointInTimeRecoveryDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PointInTimeRecoveryDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointInTimeRecoveryDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PointInTimeRecoveryDescription")(js.undefined)
        ret
    }
  }
  
}

