package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateInstanceProfileRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the instance profile.
    */
  var arn: AmazonResourceName = js.native
  /**
    * The updated description for your instance profile.
    */
  var description: js.UndefOr[Message] = js.native
  /**
    * An array of strings that specifies the list of app packages that should not be cleaned up from the device after a test run is over. The list of packages is only considered if you set packageCleanup to true.
    */
  var excludeAppPackagesFromCleanup: js.UndefOr[PackageIds] = js.native
  /**
    * The updated name for your instance profile.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The updated choice for whether you want to specify package cleanup. The default value is false for private devices.
    */
  var packageCleanup: js.UndefOr[Boolean] = js.native
  /**
    * The updated choice for whether you want to reboot the device after use. The default value is true.
    */
  var rebootAfterUse: js.UndefOr[Boolean] = js.native
}

object UpdateInstanceProfileRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): UpdateInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInstanceProfileRequest]
  }
  @scala.inline
  implicit class UpdateInstanceProfileRequestOps[Self <: UpdateInstanceProfileRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeAppPackagesFromCleanup(value: PackageIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeAppPackagesFromCleanup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeAppPackagesFromCleanup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeAppPackagesFromCleanup")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
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
    @scala.inline
    def withPackageCleanup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageCleanup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageCleanup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageCleanup")(js.undefined)
        ret
    }
    @scala.inline
    def withRebootAfterUse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rebootAfterUse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRebootAfterUse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rebootAfterUse")(js.undefined)
        ret
    }
  }
  
}

