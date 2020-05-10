package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPipelinesOutput extends js.Object {
  /**
    * If the amount of returned information is significantly large, an identifier is also returned. It can be used in a subsequent list pipelines call to return the next set of pipelines in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The list of pipelines.
    */
  var pipelines: js.UndefOr[PipelineList] = js.native
}

object ListPipelinesOutput {
  @scala.inline
  def apply(): ListPipelinesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipelinesOutput]
  }
  @scala.inline
  implicit class ListPipelinesOutputOps[Self <: ListPipelinesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPipelines(value: PipelineList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipelines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelines")(js.undefined)
        ret
    }
  }
  
}

