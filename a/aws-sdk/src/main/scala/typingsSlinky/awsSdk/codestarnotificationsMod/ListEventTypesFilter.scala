package typingsSlinky.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEventTypesFilter extends js.Object {
  /**
    * The system-generated name of the filter type you want to filter by.
    */
  var Name: ListEventTypesFilterName = js.native
  /**
    * The name of the resource type (for example, pipeline) or service name (for example, CodePipeline) that you want to filter by.
    */
  var Value: ListEventTypesFilterValue = js.native
}

object ListEventTypesFilter {
  @scala.inline
  def apply(Name: ListEventTypesFilterName, Value: ListEventTypesFilterValue): ListEventTypesFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEventTypesFilter]
  }
  @scala.inline
  implicit class ListEventTypesFilterOps[Self <: ListEventTypesFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: ListEventTypesFilterName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: ListEventTypesFilterValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

