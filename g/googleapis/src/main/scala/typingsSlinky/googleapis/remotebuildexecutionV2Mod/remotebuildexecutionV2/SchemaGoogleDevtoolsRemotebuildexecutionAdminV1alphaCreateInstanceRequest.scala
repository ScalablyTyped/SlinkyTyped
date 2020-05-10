package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request used for `CreateInstance`.
  */
@js.native
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateInstanceRequest extends js.Object {
  /**
    * Specifies the instance to create. The name in the instance, if specified
    * in the instance, is ignored.
    */
  var instance: js.UndefOr[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance] = js.native
  /**
    * ID of the created instance. A valid `instance_id` must: be 6-50
    * characters long, contain only lowercase letters, digits, hyphens and
    * underscores, start with a lowercase letter, and end with a lowercase
    * letter or a digit.
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * Resource name of the project containing the instance. Format:
    * `projects/[PROJECT_ID]`.
    */
  var parent: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateInstanceRequest {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateInstanceRequest]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateInstanceRequestOps[Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateInstanceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstance(value: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
  }
  
}

