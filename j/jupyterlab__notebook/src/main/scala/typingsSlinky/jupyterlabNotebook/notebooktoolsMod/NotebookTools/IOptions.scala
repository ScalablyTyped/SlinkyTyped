package typingsSlinky.jupyterlabNotebook.notebooktoolsMod.NotebookTools

import typingsSlinky.jupyterlabNotebook.tokensMod.INotebookTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a NotebookTools object.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The notebook tracker used by the notebook tools.
    */
  var tracker: INotebookTracker = js.native
}

object IOptions {
  @scala.inline
  def apply(tracker: INotebookTracker): IOptions = {
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
    def withTracker(value: INotebookTracker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracker")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

