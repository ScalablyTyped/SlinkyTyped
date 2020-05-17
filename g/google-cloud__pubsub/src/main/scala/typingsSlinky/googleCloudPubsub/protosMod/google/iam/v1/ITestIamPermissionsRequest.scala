package typingsSlinky.googleCloudPubsub.protosMod.google.iam.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a TestIamPermissionsRequest. */
@js.native
trait ITestIamPermissionsRequest extends js.Object {
  /** TestIamPermissionsRequest permissions */
  var permissions: js.UndefOr[js.Array[String] | Null] = js.native
  /** TestIamPermissionsRequest resource */
  var resource: js.UndefOr[String | Null] = js.native
}

object ITestIamPermissionsRequest {
  @scala.inline
  def apply(): ITestIamPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestIamPermissionsRequest]
  }
  @scala.inline
  implicit class ITestIamPermissionsRequestOps[Self <: ITestIamPermissionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPermissions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(null)
        ret
    }
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(null)
        ret
    }
  }
  
}

