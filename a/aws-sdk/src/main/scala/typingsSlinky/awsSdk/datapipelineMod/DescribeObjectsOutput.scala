package typingsSlinky.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeObjectsOutput extends js.Object {
  /**
    * Indicates whether there are more results to return.
    */
  var hasMoreResults: js.UndefOr[Boolean] = js.native
  /**
    * The starting point for the next page of results. To view the next page of results, call DescribeObjects again with this marker value. If the value is null, there are no more results.
    */
  var marker: js.UndefOr[String] = js.native
  /**
    * An array of object definitions.
    */
  var pipelineObjects: PipelineObjectList = js.native
}

object DescribeObjectsOutput {
  @scala.inline
  def apply(pipelineObjects: PipelineObjectList): DescribeObjectsOutput = {
    val __obj = js.Dynamic.literal(pipelineObjects = pipelineObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeObjectsOutput]
  }
  @scala.inline
  implicit class DescribeObjectsOutputOps[Self <: DescribeObjectsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPipelineObjects(value: PipelineObjectList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasMoreResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMoreResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasMoreResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMoreResults")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
  }
  
}

