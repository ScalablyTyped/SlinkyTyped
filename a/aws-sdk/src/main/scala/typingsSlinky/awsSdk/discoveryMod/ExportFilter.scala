package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportFilter extends js.Object {
  /**
    * Supported condition: EQUALS 
    */
  var condition: Condition = js.native
  /**
    * A single ExportFilter name. Supported filters: agentId.
    */
  var name: FilterName = js.native
  /**
    * A single agentId for a Discovery Agent. An agentId can be found using the DescribeAgents action. Typically an ADS agentId is in the form o-0123456789abcdef0.
    */
  var values: FilterValues = js.native
}

object ExportFilter {
  @scala.inline
  def apply(condition: Condition, name: FilterName, values: FilterValues): ExportFilter = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportFilter]
  }
  @scala.inline
  implicit class ExportFilterOps[Self <: ExportFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondition(value: Condition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: FilterName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: FilterValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

