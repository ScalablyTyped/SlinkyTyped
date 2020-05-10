package typingsSlinky.pulumiKubernetes.outputMod.storage.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VolumeError captures an error encountered during a volume operation.
  */
@js.native
trait VolumeError extends js.Object {
  /**
    * String detailing the error encountered during Attach or Detach operation. This string may
    * be logged, so it should not contain sensitive information.
    */
  val message: String = js.native
  /**
    * Time the error was encountered.
    */
  val time: String = js.native
}

object VolumeError {
  @scala.inline
  def apply(message: String, time: String): VolumeError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeError]
  }
  @scala.inline
  implicit class VolumeErrorOps[Self <: VolumeError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

