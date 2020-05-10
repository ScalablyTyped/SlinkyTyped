package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopNotebookInstanceInput extends js.Object {
  /**
    * The name of the notebook instance to terminate.
    */
  var NotebookInstanceName: typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceName = js.native
}

object StopNotebookInstanceInput {
  @scala.inline
  def apply(NotebookInstanceName: NotebookInstanceName): StopNotebookInstanceInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopNotebookInstanceInput]
  }
  @scala.inline
  implicit class StopNotebookInstanceInputOps[Self <: StopNotebookInstanceInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotebookInstanceName(value: NotebookInstanceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

