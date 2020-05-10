package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridViewColumnMovingEventArgs extends EventArgs {
  var allow: Boolean = js.native
  val destinationColumn: BootstrapGridViewColumn = js.native
  val isDropBefore: Boolean = js.native
  val isGroupPanel: Boolean = js.native
  val sourceColumn: BootstrapGridViewColumn = js.native
}

object GridViewColumnMovingEventArgs {
  @scala.inline
  def apply(
    allow: Boolean,
    destinationColumn: BootstrapGridViewColumn,
    isDropBefore: Boolean,
    isGroupPanel: Boolean,
    sender: Control,
    sourceColumn: BootstrapGridViewColumn
  ): GridViewColumnMovingEventArgs = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], destinationColumn = destinationColumn.asInstanceOf[js.Any], isDropBefore = isDropBefore.asInstanceOf[js.Any], isGroupPanel = isGroupPanel.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], sourceColumn = sourceColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewColumnMovingEventArgs]
  }
  @scala.inline
  implicit class GridViewColumnMovingEventArgsOps[Self <: GridViewColumnMovingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationColumn(value: BootstrapGridViewColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDropBefore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDropBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGroupPanel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGroupPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceColumn(value: BootstrapGridViewColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceColumn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

