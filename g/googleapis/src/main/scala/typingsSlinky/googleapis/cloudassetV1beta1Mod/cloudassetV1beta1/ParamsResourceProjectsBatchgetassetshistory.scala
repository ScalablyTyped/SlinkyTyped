package typingsSlinky.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsBatchgetassetshistory extends StandardParameters {
  /**
    * A list of the full names of the assets. For example:
    * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
    * See [Resource
    * Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
    * for more info.  The request becomes a no-op if the asset name list is
    * empty, and the max size of the asset name list is 100 in one request.
    */
  var assetNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The content type.
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * Required. The relative name of the root asset. It can only be an
    * organization number (such as "organizations/123"), a project ID (such as
    * "projects/my-project-id")", or a project number (such as
    * "projects/12345").
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * End time of the time window (inclusive). Current timestamp if not
    * specified.
    */
  @JSName("readTimeWindow.endTime")
  var readTimeWindowDotendTime: js.UndefOr[String] = js.native
  /**
    * Start time of the time window (exclusive).
    */
  @JSName("readTimeWindow.startTime")
  var readTimeWindowDotstartTime: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsBatchgetassetshistory {
  @scala.inline
  def apply(): ParamsResourceProjectsBatchgetassetshistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsBatchgetassetshistory]
  }
  @scala.inline
  implicit class ParamsResourceProjectsBatchgetassetshistoryOps[Self <: ParamsResourceProjectsBatchgetassetshistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetNames")(js.undefined)
        ret
    }
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
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
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
    @scala.inline
    def withReadTimeWindowDotendTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTimeWindow.endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadTimeWindowDotendTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTimeWindow.endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withReadTimeWindowDotstartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTimeWindow.startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadTimeWindowDotstartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTimeWindow.startTime")(js.undefined)
        ret
    }
  }
  
}

