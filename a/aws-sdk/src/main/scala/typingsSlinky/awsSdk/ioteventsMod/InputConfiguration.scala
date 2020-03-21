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
    status: InputStatus,
    inputDescription: InputDescription = null
  ): InputConfiguration = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], inputArn = inputArn.asInstanceOf[js.Any], inputName = inputName.asInstanceOf[js.Any], lastUpdateTime = lastUpdateTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (inputDescription != null) __obj.updateDynamic("inputDescription")(inputDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputConfiguration]
  }
}

