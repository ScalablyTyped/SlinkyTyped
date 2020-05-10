package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNotebookInstanceOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the notebook instance. 
    */
  var NotebookInstanceArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceArn] = js.native
}

object CreateNotebookInstanceOutput {
  @scala.inline
  def apply(): CreateNotebookInstanceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNotebookInstanceOutput]
  }
  @scala.inline
  implicit class CreateNotebookInstanceOutputOps[Self <: CreateNotebookInstanceOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotebookInstanceArn(value: NotebookInstanceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebookInstanceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceArn")(js.undefined)
        ret
    }
  }
  
}

