package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLSecurityConfig extends js.Object {
  /**
    * Whether to use traffic encryption between the container layers.
    */
  var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.native
  /**
    * The key used to encrypt stored data.
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.native
  /**
    * VPC configuration.
    */
  var VpcConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.VpcConfig] = js.native
}

object AutoMLSecurityConfig {
  @scala.inline
  def apply(): AutoMLSecurityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLSecurityConfig]
  }
  @scala.inline
  implicit class AutoMLSecurityConfigOps[Self <: AutoMLSecurityConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableInterContainerTrafficEncryption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableInterContainerTrafficEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableInterContainerTrafficEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableInterContainerTrafficEncryption")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeKmsKeyId(value: KmsKeyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeKmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeKmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcConfig(value: VpcConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfig")(js.undefined)
        ret
    }
  }
  
}

