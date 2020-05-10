package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecurityConfigurationResponse extends js.Object {
  /**
    * The requested security configuration.
    */
  var SecurityConfiguration: js.UndefOr[typingsSlinky.awsSdk.glueMod.SecurityConfiguration] = js.native
}

object GetSecurityConfigurationResponse {
  @scala.inline
  def apply(): GetSecurityConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSecurityConfigurationResponse]
  }
  @scala.inline
  implicit class GetSecurityConfigurationResponseOps[Self <: GetSecurityConfigurationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecurityConfiguration(value: SecurityConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityConfiguration")(js.undefined)
        ret
    }
  }
  
}

