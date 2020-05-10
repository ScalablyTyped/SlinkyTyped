package typingsSlinky.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTargetsFilter extends js.Object {
  /**
    * The name of the attribute you want to use to filter the returned targets.
    */
  var Name: ListTargetsFilterName = js.native
  /**
    * The value of the attribute you want to use to filter the returned targets. For example, if you specify SNS for the Target type, you could specify an Amazon Resource Name (ARN) for a topic as the value.
    */
  var Value: ListTargetsFilterValue = js.native
}

object ListTargetsFilter {
  @scala.inline
  def apply(Name: ListTargetsFilterName, Value: ListTargetsFilterValue): ListTargetsFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTargetsFilter]
  }
  @scala.inline
  implicit class ListTargetsFilterOps[Self <: ListTargetsFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: ListTargetsFilterName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: ListTargetsFilterValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

