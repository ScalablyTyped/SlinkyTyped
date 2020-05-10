package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeThingTypeRequest extends js.Object {
  /**
    * The name of the thing type.
    */
  var thingTypeName: ThingTypeName = js.native
}

object DescribeThingTypeRequest {
  @scala.inline
  def apply(thingTypeName: ThingTypeName): DescribeThingTypeRequest = {
    val __obj = js.Dynamic.literal(thingTypeName = thingTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeThingTypeRequest]
  }
  @scala.inline
  implicit class DescribeThingTypeRequestOps[Self <: DescribeThingTypeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThingTypeName(value: ThingTypeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingTypeName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

