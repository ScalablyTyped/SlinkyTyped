package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemClickEventArgs extends js.Object {
  /** parameter returns the object that was actually clicked
    */
  var actualObject: js.UndefOr[js.Any] = js.native
  /** parameter returns whether or not to cancel the drop event
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.native
  /** parameter returns the model of the diagram
    */
  var event: js.UndefOr[js.Any] = js.native
  /** parameter returns the object that is selected
    */
  var selectedObject: js.UndefOr[js.Any] = js.native
}

object ItemClickEventArgs {
  @scala.inline
  def apply(): ItemClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemClickEventArgs]
  }
  @scala.inline
  implicit class ItemClickEventArgsOps[Self <: ItemClickEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActualObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActualObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualObject")(js.undefined)
        ret
    }
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
    def withEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedObject")(js.undefined)
        ret
    }
  }
  
}

