package typingsSlinky.jpegJs.anon

import typingsSlinky.jpegJs.jpegJsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseTArray extends js.Object {
  var colorTransform: js.UndefOr[Boolean] = js.native
  var useTArray: js.UndefOr[`false`] = js.native
}

object UseTArray {
  @scala.inline
  def apply(): UseTArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseTArray]
  }
  @scala.inline
  implicit class UseTArrayOps[Self <: UseTArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorTransform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTArray(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTArray")(js.undefined)
        ret
    }
  }
  
}

