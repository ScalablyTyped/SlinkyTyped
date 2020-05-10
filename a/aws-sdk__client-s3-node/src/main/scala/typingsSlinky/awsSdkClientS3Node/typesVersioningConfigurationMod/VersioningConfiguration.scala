package typingsSlinky.awsSdkClientS3Node.typesVersioningConfigurationMod

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Disabled
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Enabled
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Suspended
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersioningConfiguration extends js.Object {
  /**
    * <p>Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only returned if the bucket has been configured with MFA delete. If the bucket has never been so configured, this element is not returned.</p>
    */
  var MFADelete: js.UndefOr[Enabled | Disabled | String] = js.native
  /**
    * <p>The versioning state of the bucket.</p>
    */
  var Status: js.UndefOr[Enabled | Suspended | String] = js.native
}

object VersioningConfiguration {
  @scala.inline
  def apply(): VersioningConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VersioningConfiguration]
  }
  @scala.inline
  implicit class VersioningConfigurationOps[Self <: VersioningConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMFADelete(value: Enabled | Disabled | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MFADelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMFADelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MFADelete")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Enabled | Suspended | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

