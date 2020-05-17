package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.SelectionChanged event.
  */
@js.native
trait ASPxClientFileManagerSelectionChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the full name of the file currently being processed.
    */
  var fullName: String = js.native
  /**
    * Gets whether the item has been selected.
    */
  var isSelected: Boolean = js.native
  /**
    * Gets the file manager item object related to the event.
    */
  var item: ASPxClientFileManagerItem = js.native
  /**
    * Gets the name of the currently processed file.
    */
  var name: String = js.native
}

object ASPxClientFileManagerSelectionChangedEventArgs {
  @scala.inline
  def apply(fullName: String, isSelected: Boolean, item: ASPxClientFileManagerItem, name: String): ASPxClientFileManagerSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerSelectionChangedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientFileManagerSelectionChangedEventArgsOps[Self <: ASPxClientFileManagerSelectionChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: ASPxClientFileManagerItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

