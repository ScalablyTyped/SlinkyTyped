package typingsSlinky.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A configured rewrite that will direct any requests to a Cloud Run service.
  * If the Cloud Run service does not exist when setting or updating your
  * Firebase Hosting configuration then the request will fail. Any errors from
  * the Cloud Run service (including when the service has been deleted) will be
  * passed back down to the end user.
  */
@js.native
trait SchemaCloudRunRewrite extends js.Object {
  /**
    * Optional. The region where the Cloud Run service is hosted.  Defaults to
    * `us-central1` if not supplied.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Required. User supplied ID of the Cloud Run service.
    */
  var serviceId: js.UndefOr[String] = js.native
}

object SchemaCloudRunRewrite {
  @scala.inline
  def apply(): SchemaCloudRunRewrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudRunRewrite]
  }
  @scala.inline
  implicit class SchemaCloudRunRewriteOps[Self <: SchemaCloudRunRewrite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceId")(js.undefined)
        ret
    }
  }
  
}

