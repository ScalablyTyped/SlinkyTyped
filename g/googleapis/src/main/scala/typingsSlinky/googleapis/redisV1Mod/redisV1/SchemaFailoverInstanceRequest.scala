package typingsSlinky.googleapis.redisV1Mod.redisV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for Failover.
  */
@js.native
trait SchemaFailoverInstanceRequest extends js.Object {
  /**
    * Optional. Available data protection modes that the user can choose. If
    * it&#39;s unspecified, data protection mode will be LIMITED_DATA_LOSS by
    * default.
    */
  var dataProtectionMode: js.UndefOr[String] = js.native
}

object SchemaFailoverInstanceRequest {
  @scala.inline
  def apply(): SchemaFailoverInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFailoverInstanceRequest]
  }
  @scala.inline
  implicit class SchemaFailoverInstanceRequestOps[Self <: SchemaFailoverInstanceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataProtectionMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataProtectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataProtectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataProtectionMode")(js.undefined)
        ret
    }
  }
  
}

