package typingsSlinky.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputConfiguration extends js.Object {
  /**
    * The time the input was created.
    */
  var creationTime: js.Date = js.native
  /**
    * The ARN of the input.
    */
  var inputArn: InputArn = js.native
  /**
    * A brief description of the input.
    */
  var inputDescription: js.UndefOr[InputDescription] = js.native
  /**
    * The name of the input.
    */
  var inputName: InputName = js.native
  /**
    * The last time the input was updated.
    */
  var lastUpdateTime: js.Date = js.native
  /**
    * The status of the input.
    */
  var status: InputStatus = js.native
}

object InputConfiguration {
  @scala.inline
  def apply(
    creationTime: js.Date,
    inputArn: InputArn,
    inputName: InputName,
    lastUpdateTime: js.Date,
    status: InputStatus
  ): InputConfiguration = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], inputArn = inputArn.asInstanceOf[js.Any], inputName = inputName.asInstanceOf[js.Any], lastUpdateTime = lastUpdateTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputConfiguration]
  }
  @scala.inline
  implicit class InputConfigurationOps[Self <: InputConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputArn(value: InputArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputName(value: InputName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: InputStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputDescription(value: InputDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputDescription")(js.undefined)
        ret
    }
  }
  
}

