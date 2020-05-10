package typingsSlinky.pulumiAws.amiLaunchPermissionMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmiLaunchPermissionState extends js.Object {
  /**
    * An AWS Account ID to add launch permissions.
    */
  val accountId: js.UndefOr[Input[String]] = js.native
  /**
    * A region-unique name for the AMI.
    */
  val imageId: js.UndefOr[Input[String]] = js.native
}

object AmiLaunchPermissionState {
  @scala.inline
  def apply(): AmiLaunchPermissionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmiLaunchPermissionState]
  }
  @scala.inline
  implicit class AmiLaunchPermissionStateOps[Self <: AmiLaunchPermissionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withImageId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageId")(js.undefined)
        ret
    }
  }
  
}

