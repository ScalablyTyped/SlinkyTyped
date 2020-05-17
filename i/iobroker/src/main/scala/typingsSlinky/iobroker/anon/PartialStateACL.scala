package typingsSlinky.iobroker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<iobroker.iobroker.<global>.ioBroker.StateACL> */
@js.native
trait PartialStateACL extends js.Object {
  var `object`: js.UndefOr[Double] = js.native
  var owner: js.UndefOr[String] = js.native
  var ownerGroup: js.UndefOr[String] = js.native
  var state: js.UndefOr[Double] = js.native
}

object PartialStateACL {
  @scala.inline
  def apply(): PartialStateACL = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStateACL]
  }
  @scala.inline
  implicit class PartialStateACLOps[Self <: PartialStateACL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObject(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

