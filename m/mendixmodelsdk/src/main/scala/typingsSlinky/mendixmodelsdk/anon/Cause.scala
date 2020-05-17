package typingsSlinky.mendixmodelsdk.anon

import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.fail
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.CannotFixAppState
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.IEnvironmentStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cause extends IEnvironmentStatus {
  var cause: js.UndefOr[String] = js.native
  var message: js.UndefOr[String] = js.native
  var state: CannotFixAppState = js.native
  var `type`: fail = js.native
}

object Cause {
  @scala.inline
  def apply(state: CannotFixAppState, `type`: fail): Cause = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cause]
  }
  @scala.inline
  implicit class CauseOps[Self <: Cause] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: CannotFixAppState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: fail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCause(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cause")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
  }
  
}

