package typingsSlinky.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlapResultTuple extends js.Object {
  /**
  	 * Returns an array of $.ig.OlapResultTuple objects which form the axis.
  	 */
  def members(): js.Array[_] = js.native
}

object OlapResultTuple {
  @scala.inline
  def apply(members: () => js.Array[_]): OlapResultTuple = {
    val __obj = js.Dynamic.literal(members = js.Any.fromFunction0(members))
    __obj.asInstanceOf[OlapResultTuple]
  }
  @scala.inline
  implicit class OlapResultTupleOps[Self <: OlapResultTuple] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMembers(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

