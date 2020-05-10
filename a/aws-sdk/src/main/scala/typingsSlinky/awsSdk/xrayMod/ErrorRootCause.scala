package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorRootCause extends js.Object {
  /**
    * A list of services corresponding to an error. A service identifies a segment and it contains a name, account ID, type, and inferred flag.
    */
  var Services: js.UndefOr[ErrorRootCauseServices] = js.native
}

object ErrorRootCause {
  @scala.inline
  def apply(): ErrorRootCause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorRootCause]
  }
  @scala.inline
  implicit class ErrorRootCauseOps[Self <: ErrorRootCause] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServices(value: ErrorRootCauseServices): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Services")(js.undefined)
        ret
    }
  }
  
}

