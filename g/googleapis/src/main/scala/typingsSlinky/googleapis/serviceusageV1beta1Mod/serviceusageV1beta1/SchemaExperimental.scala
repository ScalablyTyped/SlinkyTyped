package typingsSlinky.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Experimental service configuration. These configuration options can only be
  * used by whitelisted users.
  */
@js.native
trait SchemaExperimental extends js.Object {
  /**
    * Authorization configuration.
    */
  var authorization: js.UndefOr[SchemaAuthorizationConfig] = js.native
}

object SchemaExperimental {
  @scala.inline
  def apply(): SchemaExperimental = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExperimental]
  }
  @scala.inline
  implicit class SchemaExperimentalOps[Self <: SchemaExperimental] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorization(value: SchemaAuthorizationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(js.undefined)
        ret
    }
  }
  
}

