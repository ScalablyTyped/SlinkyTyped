package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowDropSettings extends js.Object {
  /** Gets or sets a value that indicates whether move or copy a record from one grid to another or within the grid
    * @Default {ej.Grid.DragBehavior.Move}
    */
  var dragBehavior: js.UndefOr[DragBehavior | String] = js.native
  /** This helps in mapping server-side action when rows are dragged from Grid.
    * @Default {null}
    */
  var dragMapper: js.UndefOr[String] = js.native
  /** This helps in mapping server-side action when rows are dropped in Grid.
    * @Default {null}
    */
  var dropMapper: js.UndefOr[String] = js.native
  /** This specifies the grid to drop the grid rows only at particular target element.
    * @Default {null}
    */
  var dropTargetID: js.UndefOr[js.Any] = js.native
}

object RowDropSettings {
  @scala.inline
  def apply(): RowDropSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowDropSettings]
  }
  @scala.inline
  implicit class RowDropSettingsOps[Self <: RowDropSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDragBehavior(value: DragBehavior | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withDragMapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragMapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragMapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragMapper")(js.undefined)
        ret
    }
    @scala.inline
    def withDropMapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropMapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropMapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropMapper")(js.undefined)
        ret
    }
    @scala.inline
    def withDropTargetID(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropTargetID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropTargetID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropTargetID")(js.undefined)
        ret
    }
  }
  
}

