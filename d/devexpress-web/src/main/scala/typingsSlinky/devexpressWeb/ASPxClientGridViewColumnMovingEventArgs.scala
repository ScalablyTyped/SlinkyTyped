package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.ColumnMoving event.
  */
@js.native
trait ASPxClientGridViewColumnMovingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets whether a column is allowed to be moved.
    */
  var allow: Boolean = js.native
  /**
    * Gets the target column, before or after which the source column will be inserted (if dropped).
    */
  var destinationColumn: ASPxClientGridViewColumn = js.native
  /**
    * Gets whether the source column will be inserted before the target column (if dropped).
    */
  var isDropBefore: Boolean = js.native
  /**
    * Gets whether the source column is currently over the Group Panel.
    */
  var isGroupPanel: Boolean = js.native
  /**
    * Gets the column currently being dragged by an end-user.
    */
  var sourceColumn: ASPxClientGridViewColumn = js.native
}

object ASPxClientGridViewColumnMovingEventArgs {
  @scala.inline
  def apply(
    allow: Boolean,
    destinationColumn: ASPxClientGridViewColumn,
    isDropBefore: Boolean,
    isGroupPanel: Boolean,
    sourceColumn: ASPxClientGridViewColumn
  ): ASPxClientGridViewColumnMovingEventArgs = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], destinationColumn = destinationColumn.asInstanceOf[js.Any], isDropBefore = isDropBefore.asInstanceOf[js.Any], isGroupPanel = isGroupPanel.asInstanceOf[js.Any], sourceColumn = sourceColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewColumnMovingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientGridViewColumnMovingEventArgsOps[Self <: ASPxClientGridViewColumnMovingEventArgs] (val x: Self) extends AnyVal {
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
    def withDestinationColumn(value: ASPxClientGridViewColumn): Self = {
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
    def withSourceColumn(value: ASPxClientGridViewColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceColumn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

