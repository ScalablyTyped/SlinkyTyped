package typingsSlinky.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyDelta extends js.Object {
  /** The delta for Bindings between two policies. */
  var bindingDeltas: js.UndefOr[js.Array[BindingDelta]] = js.native
}

object PolicyDelta {
  @scala.inline
  def apply(): PolicyDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyDelta]
  }
  @scala.inline
  implicit class PolicyDeltaOps[Self <: PolicyDelta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindingDeltas(value: js.Array[BindingDelta]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingDeltas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindingDeltas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingDeltas")(js.undefined)
        ret
    }
  }
  
}

