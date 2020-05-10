package typingsSlinky.pulumiAws.inputMod.elastictranscoder

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineContentConfigPermission extends js.Object {
  /**
    * The permission that you want to give to the AWS user that you specified in `thumbnail_config_permissions.grantee`.
    */
  var accesses: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The AWS user or group that you want to have access to thumbnail files.
    */
  var grantee: js.UndefOr[Input[String]] = js.native
  /**
    * Specify the type of value that appears in the `thumbnail_config_permissions.grantee` object.
    */
  var granteeType: js.UndefOr[Input[String]] = js.native
}

object PipelineContentConfigPermission {
  @scala.inline
  def apply(): PipelineContentConfigPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineContentConfigPermission]
  }
  @scala.inline
  implicit class PipelineContentConfigPermissionOps[Self <: PipelineContentConfigPermission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccesses(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accesses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccesses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accesses")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantee(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grantee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grantee")(js.undefined)
        ret
    }
    @scala.inline
    def withGranteeType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granteeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGranteeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granteeType")(js.undefined)
        ret
    }
  }
  
}

