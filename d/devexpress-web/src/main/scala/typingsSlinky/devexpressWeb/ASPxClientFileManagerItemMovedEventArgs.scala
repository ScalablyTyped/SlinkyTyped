package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.ItemMoved event.
  */
@js.native
trait ASPxClientFileManagerItemMovedEventArgs extends ASPxClientFileManagerActionEventArgsBase {
  /**
    * Gets the full name of the folder from which an item is moved.
    */
  var oldFolderFullName: String = js.native
}

object ASPxClientFileManagerItemMovedEventArgs {
  @scala.inline
  def apply(fullName: String, isFolder: Boolean, name: String, oldFolderFullName: String): ASPxClientFileManagerItemMovedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oldFolderFullName = oldFolderFullName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerItemMovedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientFileManagerItemMovedEventArgsOps[Self <: ASPxClientFileManagerItemMovedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOldFolderFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldFolderFullName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

