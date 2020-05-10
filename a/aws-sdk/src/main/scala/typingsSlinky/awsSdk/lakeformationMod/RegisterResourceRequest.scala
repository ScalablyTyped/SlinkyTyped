package typingsSlinky.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource that you want to register.
    */
  var ResourceArn: ResourceArnString = js.native
  /**
    * The identifier for the role.
    */
  var RoleArn: js.UndefOr[IAMRoleArn] = js.native
  /**
    * Designates a trusted caller, an IAM principal, by registering this caller with the Data Catalog. 
    */
  var UseServiceLinkedRole: js.UndefOr[NullableBoolean] = js.native
}

object RegisterResourceRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArnString): RegisterResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterResourceRequest]
  }
  @scala.inline
  implicit class RegisterResourceRequestOps[Self <: RegisterResourceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceArn(value: ResourceArnString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: IAMRoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withUseServiceLinkedRole(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseServiceLinkedRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseServiceLinkedRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseServiceLinkedRole")(js.undefined)
        ret
    }
  }
  
}

