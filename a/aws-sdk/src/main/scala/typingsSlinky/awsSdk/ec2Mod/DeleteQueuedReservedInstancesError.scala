package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteQueuedReservedInstancesError extends js.Object {
  /**
    * The error code.
    */
  var Code: js.UndefOr[DeleteQueuedReservedInstancesErrorCode] = js.native
  /**
    * The error message.
    */
  var Message: js.UndefOr[String] = js.native
}

object DeleteQueuedReservedInstancesError {
  @scala.inline
  def apply(): DeleteQueuedReservedInstancesError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteQueuedReservedInstancesError]
  }
  @scala.inline
  implicit class DeleteQueuedReservedInstancesErrorOps[Self <: DeleteQueuedReservedInstancesError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: DeleteQueuedReservedInstancesErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
  }
  
}

