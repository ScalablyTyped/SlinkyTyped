package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/selection
  */
@js.native
trait SingularSelection extends js.Object {
  /**
    * Get whether the element's selection state is mutable.
    * http://js.cytoscape.org/#ele.selectable
    */
  def selectable(): Boolean = js.native
  /**
    * Get whether the element is selected.
    * http://js.cytoscape.org/#ele.selected
    */
  def selected(): Boolean = js.native
}

object SingularSelection {
  @scala.inline
  def apply(selectable: () => Boolean, selected: () => Boolean): SingularSelection = {
    val __obj = js.Dynamic.literal(selectable = js.Any.fromFunction0(selectable), selected = js.Any.fromFunction0(selected))
    __obj.asInstanceOf[SingularSelection]
  }
  @scala.inline
  implicit class SingularSelectionOps[Self <: SingularSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelected(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

