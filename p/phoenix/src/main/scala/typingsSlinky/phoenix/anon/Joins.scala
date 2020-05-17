package typingsSlinky.phoenix.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Joins extends js.Object {
  var joins: js.Object = js.native
  var leaves: js.Object = js.native
}

object Joins {
  @scala.inline
  def apply(joins: js.Object, leaves: js.Object): Joins = {
    val __obj = js.Dynamic.literal(joins = joins.asInstanceOf[js.Any], leaves = leaves.asInstanceOf[js.Any])
    __obj.asInstanceOf[Joins]
  }
  @scala.inline
  implicit class JoinsOps[Self <: Joins] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJoins(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeaves(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaves")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

