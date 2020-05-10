package typingsSlinky.pulumiAws.getInstanceProfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceProfileResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the instance profile.
    */
  val arn: String = js.native
  /**
    * The string representation of the date the instance profile
    * was created.
    */
  val createDate: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val name: String = js.native
  /**
    * The path to the instance profile.
    */
  val path: String = js.native
  /**
    * The role arn associated with this instance profile.
    */
  val roleArn: String = js.native
  /**
    * The role id associated with this instance profile.
    */
  val roleId: String = js.native
  /**
    * The role name associated with this instance profile.
    */
  val roleName: String = js.native
}

object GetInstanceProfileResult {
  @scala.inline
  def apply(
    arn: String,
    createDate: String,
    id: String,
    name: String,
    path: String,
    roleArn: String,
    roleId: String,
    roleName: String
  ): GetInstanceProfileResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createDate = createDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], roleId = roleId.asInstanceOf[js.Any], roleName = roleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceProfileResult]
  }
  @scala.inline
  implicit class GetInstanceProfileResultOps[Self <: GetInstanceProfileResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

