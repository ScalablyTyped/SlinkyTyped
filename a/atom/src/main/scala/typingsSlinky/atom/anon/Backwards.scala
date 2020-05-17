package typingsSlinky.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backwards extends js.Object {
  var backwards: js.UndefOr[Boolean] = js.native
}

object Backwards {
  @scala.inline
  def apply(): Backwards = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Backwards]
  }
  @scala.inline
  implicit class BackwardsOps[Self <: Backwards] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackwards(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backwards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackwards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backwards")(js.undefined)
        ret
    }
  }
  
}

