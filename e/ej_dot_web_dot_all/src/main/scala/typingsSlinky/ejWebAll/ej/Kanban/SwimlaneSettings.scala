package typingsSlinky.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwimlaneSettings extends js.Object {
  /** To enable or disable DragAndDrop across swim lane.
    * @Default {false}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.native
  /** Gets or sets an object that indicates to render the swimlane rows with specified swimlane headers.
    * @Default {[]}
    */
  var headers: js.UndefOr[js.Array[SwimlaneSettingsHeader]] = js.native
  /** To enable or disable items count in swim lane.
    * @Default {true}
    */
  var showCount: js.UndefOr[Boolean] = js.native
  /** To enable or disable empty swimlane on Kanban board.  It is used to shown empty swimlane when no data's present on headers key mapping value.
    * @Default {false}
    */
  var showEmptySwimlane: js.UndefOr[Boolean] = js.native
  /** Customize the settings for unassigned category of swim lane.
    * @Default {Object}
    */
  var unassignedGroup: js.UndefOr[SwimlaneSettingsUnassignedGroup] = js.native
}

object SwimlaneSettings {
  @scala.inline
  def apply(): SwimlaneSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwimlaneSettings]
  }
  @scala.inline
  implicit class SwimlaneSettingsOps[Self <: SwimlaneSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDragAndDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragAndDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDragAndDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragAndDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Array[SwimlaneSettingsHeader]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCount")(js.undefined)
        ret
    }
    @scala.inline
    def withShowEmptySwimlane(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEmptySwimlane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowEmptySwimlane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEmptySwimlane")(js.undefined)
        ret
    }
    @scala.inline
    def withUnassignedGroup(value: SwimlaneSettingsUnassignedGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unassignedGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnassignedGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unassignedGroup")(js.undefined)
        ret
    }
  }
  
}

