package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowTemplateFilter extends js.Object {
  /**
    * The name of the search filter field.
    */
  var name: FlowTemplateFilterName = js.native
  /**
    * An array of string values for the search filter field. Multiple values function as AND criteria in the search.
    */
  var value: FlowTemplateFilterValues = js.native
}

object FlowTemplateFilter {
  @scala.inline
  def apply(name: FlowTemplateFilterName, value: FlowTemplateFilterValues): FlowTemplateFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowTemplateFilter]
  }
  @scala.inline
  implicit class FlowTemplateFilterOps[Self <: FlowTemplateFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: FlowTemplateFilterName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: FlowTemplateFilterValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

