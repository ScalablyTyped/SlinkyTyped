package typingsSlinky.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Unordered extends js.Object {
  var unordered: js.UndefOr[Boolean] = js.native
  var weak: js.UndefOr[Boolean] = js.native
}

object Unordered {
  @scala.inline
  def apply(): Unordered = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Unordered]
  }
  @scala.inline
  implicit class UnorderedOps[Self <: Unordered] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnordered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unordered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnordered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unordered")(js.undefined)
        ret
    }
    @scala.inline
    def withWeak(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weak")(js.undefined)
        ret
    }
  }
  
}

