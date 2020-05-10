package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNotebookInstancesOutput extends js.Object {
  /**
    * If the response to the previous ListNotebookInstances request was truncated, Amazon SageMaker returns this token. To retrieve the next set of notebook instances, use the token in the next request.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * An array of NotebookInstanceSummary objects, one for each notebook instance.
    */
  var NotebookInstances: js.UndefOr[NotebookInstanceSummaryList] = js.native
}

object ListNotebookInstancesOutput {
  @scala.inline
  def apply(): ListNotebookInstancesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotebookInstancesOutput]
  }
  @scala.inline
  implicit class ListNotebookInstancesOutputOps[Self <: ListNotebookInstancesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withNotebookInstances(value: NotebookInstanceSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebookInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstances")(js.undefined)
        ret
    }
  }
  
}

