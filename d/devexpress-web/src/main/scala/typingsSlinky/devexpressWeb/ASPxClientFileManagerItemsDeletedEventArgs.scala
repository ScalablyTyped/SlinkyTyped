package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.ItemsDeleted event.
  */
@js.native
trait ASPxClientFileManagerItemsDeletedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets an array of the currently processed items.
    */
  var items: js.Array[ASPxClientFileManagerItem] = js.native
}

object ASPxClientFileManagerItemsDeletedEventArgs {
  @scala.inline
  def apply(items: js.Array[ASPxClientFileManagerItem]): ASPxClientFileManagerItemsDeletedEventArgs = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerItemsDeletedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientFileManagerItemsDeletedEventArgsOps[Self <: ASPxClientFileManagerItemsDeletedEventArgs] (val x: Self) extends AnyVal {
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
  }
  
}

