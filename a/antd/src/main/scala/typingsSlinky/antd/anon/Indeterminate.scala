package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Indeterminate extends js.Object {
  var indeterminate: Boolean = js.native
}

object Indeterminate {
  @scala.inline
  def apply(indeterminate: Boolean): Indeterminate = {
    val __obj = js.Dynamic.literal(indeterminate = indeterminate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indeterminate]
  }
  @scala.inline
  implicit class IndeterminateOps[Self <: Indeterminate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndeterminate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indeterminate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

