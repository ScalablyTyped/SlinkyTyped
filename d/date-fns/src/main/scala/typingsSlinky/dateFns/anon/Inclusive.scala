package typingsSlinky.dateFns.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inclusive extends js.Object {
  var inclusive: js.UndefOr[Boolean] = js.native
}

object Inclusive {
  @scala.inline
  def apply(): Inclusive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inclusive]
  }
  @scala.inline
  implicit class InclusiveOps[Self <: Inclusive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInclusive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclusive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusive")(js.undefined)
        ret
    }
  }
  
}

