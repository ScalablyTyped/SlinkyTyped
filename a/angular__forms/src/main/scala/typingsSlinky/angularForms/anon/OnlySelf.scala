package typingsSlinky.angularForms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnlySelf extends js.Object {
  var onlySelf: js.UndefOr[Boolean] = js.native
}

object OnlySelf {
  @scala.inline
  def apply(): OnlySelf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlySelf]
  }
  @scala.inline
  implicit class OnlySelfOps[Self <: OnlySelf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnlySelf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlySelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlySelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlySelf")(js.undefined)
        ret
    }
  }
  
}

