package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollChangeEventArgs extends js.Object {
  /** parameter returns whether or not to cancel the dragOver event
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Parameter returns the new zoom value, horizontal and vertical scroll offsets.
    */
  var cause: js.UndefOr[String] = js.native
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.native
  /** Parameter returns the new zoom value, horizontal and vertical scroll offsets.
    */
  var newValues: js.UndefOr[js.Any] = js.native
  /** parameter returns the previous zoom value, horizontal and vertical scroll offsets.
    */
  var oldValues: js.UndefOr[js.Any] = js.native
}

object ScrollChangeEventArgs {
  @scala.inline
  def apply(): ScrollChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollChangeEventArgs]
  }
  @scala.inline
  implicit class ScrollChangeEventArgsOps[Self <: ScrollChangeEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withCause(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cause")(js.undefined)
        ret
    }
    @scala.inline
    def withDiagramId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagramId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagramId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagramId")(js.undefined)
        ret
    }
    @scala.inline
    def withNewValues(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValues")(js.undefined)
        ret
    }
    @scala.inline
    def withOldValues(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValues")(js.undefined)
        ret
    }
  }
  
}

