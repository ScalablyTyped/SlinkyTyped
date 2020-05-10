package typingsSlinky.pulumiAws.glueSecurityConfigurationMod

import typingsSlinky.pulumiAws.inputMod.glue.SecurityConfigurationEncryptionConfiguration
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityConfigurationArgs extends js.Object {
  /**
    * Configuration block containing encryption configuration. Detailed below.
    */
  val encryptionConfiguration: Input[SecurityConfigurationEncryptionConfiguration] = js.native
  /**
    * Name of the security configuration.
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object SecurityConfigurationArgs {
  @scala.inline
  def apply(encryptionConfiguration: Input[SecurityConfigurationEncryptionConfiguration]): SecurityConfigurationArgs = {
    val __obj = js.Dynamic.literal(encryptionConfiguration = encryptionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityConfigurationArgs]
  }
  @scala.inline
  implicit class SecurityConfigurationArgsOps[Self <: SecurityConfigurationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptionConfiguration(value: Input[SecurityConfigurationEncryptionConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

