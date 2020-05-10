package typingsSlinky.clmtrackr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUseWebWorkers extends js.Object {
  /** whether to use web workers for face detection (default is true) */
  var useWebWorkers: js.UndefOr[Boolean] = js.native
}

object AnonUseWebWorkers {
  @scala.inline
  def apply(): AnonUseWebWorkers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonUseWebWorkers]
  }
  @scala.inline
  implicit class AnonUseWebWorkersOps[Self <: AnonUseWebWorkers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseWebWorkers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWebWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseWebWorkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWebWorkers")(js.undefined)
        ret
    }
  }
  
}

