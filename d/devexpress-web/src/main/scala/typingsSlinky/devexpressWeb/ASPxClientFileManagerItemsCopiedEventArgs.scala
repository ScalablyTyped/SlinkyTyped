package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.ItemsCopied event.
  */
@js.native
trait ASPxClientFileManagerItemsCopiedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets an array of the currently processed items.
    */
  var items: js.Array[ASPxClientFileManagerItem] = js.native
  /**
    * Gets the full name of the folder from which items are copied.
    */
  var oldFolderFullName: String = js.native
}

object ASPxClientFileManagerItemsCopiedEventArgs {
  @scala.inline
  def apply(items: js.Array[ASPxClientFileManagerItem], oldFolderFullName: String): ASPxClientFileManagerItemsCopiedEventArgs = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], oldFolderFullName = oldFolderFullName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerItemsCopiedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientFileManagerItemsCopiedEventArgsOps[Self <: ASPxClientFileManagerItemsCopiedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[ASPxClientFileManagerItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldFolderFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldFolderFullName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

