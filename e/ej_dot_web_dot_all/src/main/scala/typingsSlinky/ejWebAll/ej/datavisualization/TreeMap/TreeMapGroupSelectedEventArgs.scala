package typingsSlinky.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeMapGroupSelectedEventArgs extends js.Object {
  /** Returns the  selected group of treeMapItems as  object.
    */
  var originalEvent: js.UndefOr[js.Any] = js.native
}

object TreeMapGroupSelectedEventArgs {
  @scala.inline
  def apply(): TreeMapGroupSelectedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeMapGroupSelectedEventArgs]
  }
  @scala.inline
  implicit class TreeMapGroupSelectedEventArgsOps[Self <: TreeMapGroupSelectedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOriginalEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEvent")(js.undefined)
        ret
    }
  }
  
}

