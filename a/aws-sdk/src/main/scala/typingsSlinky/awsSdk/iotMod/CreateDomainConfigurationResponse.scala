package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDomainConfigurationResponse extends js.Object {
  /**
    * The ARN of the domain configuration.
    */
  var domainConfigurationArn: js.UndefOr[DomainConfigurationArn] = js.native
  /**
    * The name of the domain configuration.
    */
  var domainConfigurationName: js.UndefOr[DomainConfigurationName] = js.native
}

object CreateDomainConfigurationResponse {
  @scala.inline
  def apply(): CreateDomainConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDomainConfigurationResponse]
  }
  @scala.inline
  implicit class CreateDomainConfigurationResponseOps[Self <: CreateDomainConfigurationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainConfigurationArn(value: DomainConfigurationArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainConfigurationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainConfigurationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainConfigurationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainConfigurationName(value: DomainConfigurationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainConfigurationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainConfigurationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainConfigurationName")(js.undefined)
        ret
    }
  }
  
}

