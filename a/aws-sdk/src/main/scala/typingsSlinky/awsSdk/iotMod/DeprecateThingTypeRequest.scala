package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeprecateThingTypeRequest extends js.Object {
  /**
    * The name of the thing type to deprecate.
    */
  var thingTypeName: ThingTypeName = js.native
  /**
    * Whether to undeprecate a deprecated thing type. If true, the thing type will not be deprecated anymore and you can associate it with things.
    */
  var undoDeprecate: js.UndefOr[UndoDeprecate] = js.native
}

object DeprecateThingTypeRequest {
  @scala.inline
  def apply(thingTypeName: ThingTypeName): DeprecateThingTypeRequest = {
    val __obj = js.Dynamic.literal(thingTypeName = thingTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecateThingTypeRequest]
  }
  @scala.inline
  implicit class DeprecateThingTypeRequestOps[Self <: DeprecateThingTypeRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withUndoDeprecate(value: UndoDeprecate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undoDeprecate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUndoDeprecate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undoDeprecate")(js.undefined)
        ret
    }
  }
  
}

