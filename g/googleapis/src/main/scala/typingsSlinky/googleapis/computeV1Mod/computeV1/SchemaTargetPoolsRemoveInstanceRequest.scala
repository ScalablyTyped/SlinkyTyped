package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetPoolsRemoveInstanceRequest extends js.Object {
  /**
    * URLs of the instances to be removed from target pool.
    */
  var instances: js.UndefOr[js.Array[SchemaInstanceReference]] = js.native
}

object SchemaTargetPoolsRemoveInstanceRequest {
  @scala.inline
  def apply(): SchemaTargetPoolsRemoveInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetPoolsRemoveInstanceRequest]
  }
  @scala.inline
  implicit class SchemaTargetPoolsRemoveInstanceRequestOps[Self <: SchemaTargetPoolsRemoveInstanceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstances(value: js.Array[SchemaInstanceReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instances")(js.undefined)
        ret
    }
  }
  
}

