package typingsSlinky.rethinkdb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseOutdated extends js.Object {
  var useOutdated: Boolean = js.native
}

object UseOutdated {
  @scala.inline
  def apply(useOutdated: Boolean): UseOutdated = {
    val __obj = js.Dynamic.literal(useOutdated = useOutdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseOutdated]
  }
  @scala.inline
  implicit class UseOutdatedOps[Self <: UseOutdated] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseOutdated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useOutdated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

