package typingsSlinky.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterAllocationExplainParams extends GenericParams {
  var includeDiskInfo: js.UndefOr[Boolean] = js.native
  var includeYesDecisions: js.UndefOr[Boolean] = js.native
}

object ClusterAllocationExplainParams {
  @scala.inline
  def apply(): ClusterAllocationExplainParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterAllocationExplainParams]
  }
  @scala.inline
  implicit class ClusterAllocationExplainParamsOps[Self <: ClusterAllocationExplainParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeDiskInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDiskInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeDiskInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDiskInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeYesDecisions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeYesDecisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeYesDecisions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeYesDecisions")(js.undefined)
        ret
    }
  }
  
}

