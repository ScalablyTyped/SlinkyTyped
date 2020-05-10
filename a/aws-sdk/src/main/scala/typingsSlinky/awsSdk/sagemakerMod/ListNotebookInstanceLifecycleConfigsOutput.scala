package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNotebookInstanceLifecycleConfigsOutput extends js.Object {
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To get the next set of lifecycle configurations, use it in the next request. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * An array of NotebookInstanceLifecycleConfiguration objects, each listing a lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigs: js.UndefOr[NotebookInstanceLifecycleConfigSummaryList] = js.native
}

object ListNotebookInstanceLifecycleConfigsOutput {
  @scala.inline
  def apply(): ListNotebookInstanceLifecycleConfigsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotebookInstanceLifecycleConfigsOutput]
  }
  @scala.inline
  implicit class ListNotebookInstanceLifecycleConfigsOutputOps[Self <: ListNotebookInstanceLifecycleConfigsOutput] (val x: Self) extends AnyVal {
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
    def withNotebookInstanceLifecycleConfigs(value: NotebookInstanceLifecycleConfigSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceLifecycleConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebookInstanceLifecycleConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceLifecycleConfigs")(js.undefined)
        ret
    }
  }
  
}

