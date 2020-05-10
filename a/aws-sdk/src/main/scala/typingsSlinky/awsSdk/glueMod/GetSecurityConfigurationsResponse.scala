package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecurityConfigurationsResponse extends js.Object {
  /**
    * A continuation token, if there are more security configurations to return.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
  /**
    * A list of security configurations.
    */
  var SecurityConfigurations: js.UndefOr[SecurityConfigurationList] = js.native
}

object GetSecurityConfigurationsResponse {
  @scala.inline
  def apply(): GetSecurityConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSecurityConfigurationsResponse]
  }
  @scala.inline
  implicit class GetSecurityConfigurationsResponseOps[Self <: GetSecurityConfigurationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityConfigurations(value: SecurityConfigurationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityConfigurations")(js.undefined)
        ret
    }
  }
  
}

