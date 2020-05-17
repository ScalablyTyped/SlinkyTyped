package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.SelectedFileChanged and ASPxClientFileManager.SelectedFileOpened events.
  */
@js.native
trait ASPxClientFileManagerFileEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a file related to the event.
    */
  var file: ASPxClientFileManagerFile = js.native
}

object ASPxClientFileManagerFileEventArgs {
  @scala.inline
  def apply(file: ASPxClientFileManagerFile): ASPxClientFileManagerFileEventArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFileEventArgs]
  }
  @scala.inline
  implicit class ASPxClientFileManagerFileEventArgsOps[Self <: ASPxClientFileManagerFileEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: ASPxClientFileManagerFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

