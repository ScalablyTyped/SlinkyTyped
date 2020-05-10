package typingsSlinky.firebaseFirestore.specTestRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecWriteFailure extends js.Object {
  /** The error the backend uses to fail the write. */
  var error: SpecError = js.native
  /**
    * Whether we should keep the write in our internal queue. This should be set
    * to 'true' for transient errors or if the client ignores the failure
    * (e.g. a secondary client which ignores write rejections).
    *
    * Defaults to false.
    */
  var keepInQueue: js.UndefOr[Boolean] = js.native
}

object SpecWriteFailure {
  @scala.inline
  def apply(error: SpecError): SpecWriteFailure = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecWriteFailure]
  }
  @scala.inline
  implicit class SpecWriteFailureOps[Self <: SpecWriteFailure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: SpecError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepInQueue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepInQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepInQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepInQueue")(js.undefined)
        ret
    }
  }
  
}

