package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for CreateInstance.
  */
@js.native
trait SchemaCreateInstanceRequest extends js.Object {
  /**
    * Required. The instance to create.  The name may be omitted, but if
    * specified must be `&lt;parent&gt;/instances/&lt;instance_id&gt;`.
    */
  var instance: js.UndefOr[SchemaInstance] = js.native
  /**
    * Required. The ID of the instance to create.  Valid identifiers are of the
    * form `a-z*[a-z0-9]` and must be between 6 and 30 characters in length.
    */
  var instanceId: js.UndefOr[String] = js.native
}

object SchemaCreateInstanceRequest {
  @scala.inline
  def apply(): SchemaCreateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateInstanceRequest]
  }
  @scala.inline
  implicit class SchemaCreateInstanceRequestOps[Self <: SchemaCreateInstanceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstance(value: SchemaInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(js.undefined)
        ret
    }
  }
  
}

