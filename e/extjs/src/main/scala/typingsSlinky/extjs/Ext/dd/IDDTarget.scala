package typingsSlinky.extjs.Ext.dd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDDTarget extends IDragDrop {
  /** [Method] toString method
  		* @returns String string representation of the dd obj
  		*/
  @JSName("toString")
  var toString_FIDDTarget: js.UndefOr[js.Function0[String]] = js.native
}

object IDDTarget {
  @scala.inline
  def apply(): IDDTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDDTarget]
  }
  @scala.inline
  implicit class IDDTargetOps[Self <: IDDTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.undefined)
        ret
    }
  }
  
}

