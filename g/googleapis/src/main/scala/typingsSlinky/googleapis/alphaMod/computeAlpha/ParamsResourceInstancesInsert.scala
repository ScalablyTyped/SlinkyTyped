package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceInstancesInsert extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaInstance] = js.native
  /**
    * An optional request ID to identify requests. Specify a unique request ID
    * so that if you must retry your request, the server will know to ignore
    * the request if it has already been completed.  For example, consider a
    * situation where you make an initial request and the request times out. If
    * you make the request again with the same request ID, the server can check
    * if original operation with the same request ID was received, and if so,
    * will ignore the second request. This prevents clients from accidentally
    * creating duplicate commitments.  The request ID must be a valid UUID with
    * the exception that zero UUID is not supported
    * (00000000-0000-0000-0000-000000000000).
    */
  var requestId: js.UndefOr[String] = js.native
  /**
    * Specifies instance template to create the instance.  This field is
    * optional. It can be a full or partial URL. For example, the following are
    * all valid URLs to an instance template:   -
    * https://www.googleapis.com/compute/v1/projects/project/global/instanceTemplates/instanceTemplate
    * - projects/project/global/instanceTemplates/instanceTemplate  -
    * global/instanceTemplates/instanceTemplate
    */
  var sourceInstanceTemplate: js.UndefOr[String] = js.native
  /**
    * Specifies instance machine to create the instance.  This field is
    * optional. It can be a full or partial URL. For example, the following are
    * all valid URLs to an instance template:   -
    * https://www.googleapis.com/compute/v1/projects/project/global/global/machineImages/machineImage
    * - projects/project/global/global/machineImages/machineImage  -
    * global/machineImages/machineImage
    */
  var sourceMachineImage: js.UndefOr[String] = js.native
  /**
    * The name of the zone for this request.
    */
  var zone: js.UndefOr[String] = js.native
}

object ParamsResourceInstancesInsert {
  @scala.inline
  def apply(): ParamsResourceInstancesInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInstancesInsert]
  }
  @scala.inline
  implicit class ParamsResourceInstancesInsertOps[Self <: ParamsResourceInstancesInsert] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestBody(value: SchemaInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceInstanceTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceInstanceTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceInstanceTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceInstanceTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMachineImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMachineImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMachineImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMachineImage")(js.undefined)
        ret
    }
    @scala.inline
    def withZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(js.undefined)
        ret
    }
  }
  
}

