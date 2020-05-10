package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Instance failover request.
  */
@js.native
trait SchemaInstancesFailoverRequest extends js.Object {
  /**
    * Failover Context.
    */
  var failoverContext: js.UndefOr[SchemaFailoverContext] = js.native
}

object SchemaInstancesFailoverRequest {
  @scala.inline
  def apply(): SchemaInstancesFailoverRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesFailoverRequest]
  }
  @scala.inline
  implicit class SchemaInstancesFailoverRequestOps[Self <: SchemaInstancesFailoverRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailoverContext(value: SchemaFailoverContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failoverContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailoverContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failoverContext")(js.undefined)
        ret
    }
  }
  
}

