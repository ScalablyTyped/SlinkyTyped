package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseConfiguration extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the license configuration.
    */
  var LicenseConfigurationArn: js.UndefOr[String] = js.native
}

object LicenseConfiguration {
  @scala.inline
  def apply(): LicenseConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseConfiguration]
  }
  @scala.inline
  implicit class LicenseConfigurationOps[Self <: LicenseConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLicenseConfigurationArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseConfigurationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseConfigurationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseConfigurationArn")(js.undefined)
        ret
    }
  }
  
}

