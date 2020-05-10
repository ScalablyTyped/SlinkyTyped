package typingsSlinky.edtrIoMathquill

import typingsSlinky.edtrIoMathquill.mod.MQ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEdit extends js.Object {
  var edit: js.UndefOr[js.Function1[/* mathField */ MQ, _]] = js.native
  var enter: js.UndefOr[js.Function1[/* mathField */ MQ, _]] = js.native
  var moveOutOf: js.UndefOr[js.Function2[/* direction */ Double, /* mathField */ MQ, _]] = js.native
  var upOutOf: js.UndefOr[js.Function1[/* mathField */ MQ, _]] = js.native
}

object AnonEdit {
  @scala.inline
  def apply(): AnonEdit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEdit]
  }
  @scala.inline
  implicit class AnonEditOps[Self <: AnonEdit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdit(value: /* mathField */ MQ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(js.undefined)
        ret
    }
    @scala.inline
    def withEnter(value: /* mathField */ MQ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveOutOf(value: (/* direction */ Double, /* mathField */ MQ) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveOutOf")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMoveOutOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveOutOf")(js.undefined)
        ret
    }
    @scala.inline
    def withUpOutOf(value: /* mathField */ MQ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upOutOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpOutOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upOutOf")(js.undefined)
        ret
    }
  }
  
}

