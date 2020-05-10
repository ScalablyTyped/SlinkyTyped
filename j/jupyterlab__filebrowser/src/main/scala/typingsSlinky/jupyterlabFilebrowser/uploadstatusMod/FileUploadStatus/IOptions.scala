package typingsSlinky.jupyterlabFilebrowser.uploadstatusMod.FileUploadStatus

import typingsSlinky.jupyterlabApputils.mod.WidgetTracker
import typingsSlinky.jupyterlabFilebrowser.mod.FileBrowser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for creating the upload status item.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The application file browser tracker.
    */
  val tracker: WidgetTracker[FileBrowser] = js.native
}

object IOptions {
  @scala.inline
  def apply(tracker: WidgetTracker[FileBrowser]): IOptions = {
    val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTracker(value: WidgetTracker[FileBrowser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracker")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

