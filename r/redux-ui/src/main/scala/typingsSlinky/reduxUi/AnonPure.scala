package typingsSlinky.reduxUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPure extends js.Object {
  var pure: js.UndefOr[Boolean] = js.native
  var withRef: js.UndefOr[Boolean] = js.native
}

object AnonPure {
  @scala.inline
  def apply(): AnonPure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonPure]
  }
  @scala.inline
  implicit class AnonPureOps[Self <: AnonPure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pure")(js.undefined)
        ret
    }
    @scala.inline
    def withWithRef(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withRef")(js.undefined)
        ret
    }
  }
  
}

