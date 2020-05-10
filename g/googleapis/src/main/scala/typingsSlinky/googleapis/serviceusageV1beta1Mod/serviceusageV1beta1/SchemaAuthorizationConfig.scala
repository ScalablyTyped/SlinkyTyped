package typingsSlinky.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration of authorization.  This section determines the authorization
  * provider, if unspecified, then no authorization check will be done.
  * Example:      experimental:       authorization:         provider:
  * firebaserules.googleapis.com
  */
@js.native
trait SchemaAuthorizationConfig extends js.Object {
  /**
    * The name of the authorization provider, such as
    * firebaserules.googleapis.com.
    */
  var provider: js.UndefOr[String] = js.native
}

object SchemaAuthorizationConfig {
  @scala.inline
  def apply(): SchemaAuthorizationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthorizationConfig]
  }
  @scala.inline
  implicit class SchemaAuthorizationConfigOps[Self <: SchemaAuthorizationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(js.undefined)
        ret
    }
  }
  
}

