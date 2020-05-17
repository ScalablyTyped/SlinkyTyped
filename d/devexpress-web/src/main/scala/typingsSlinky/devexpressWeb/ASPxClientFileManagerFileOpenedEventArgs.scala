package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.SelectedFileOpened event.
  */
@js.native
trait ASPxClientFileManagerFileOpenedEventArgs extends ASPxClientFileManagerFileEventArgs {
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  var processOnServer: Boolean = js.native
}

object ASPxClientFileManagerFileOpenedEventArgs {
  @scala.inline
  def apply(file: ASPxClientFileManagerFile, processOnServer: Boolean): ASPxClientFileManagerFileOpenedEventArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFileOpenedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientFileManagerFileOpenedEventArgsOps[Self <: ASPxClientFileManagerFileOpenedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProcessOnServer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processOnServer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

