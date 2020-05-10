package typingsSlinky.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGoogleCloudMlV1Capability extends js.Object {
  /**
    * Available accelerators for the capability.
    */
  var availableAccelerators: js.UndefOr[js.Array[String]] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudMlV1Capability {
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1Capability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1Capability]
  }
  @scala.inline
  implicit class SchemaGoogleCloudMlV1CapabilityOps[Self <: SchemaGoogleCloudMlV1Capability] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableAccelerators(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableAccelerators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableAccelerators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableAccelerators")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

