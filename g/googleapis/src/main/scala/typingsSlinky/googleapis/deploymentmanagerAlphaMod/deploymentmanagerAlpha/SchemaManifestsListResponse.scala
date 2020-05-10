package typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response containing a partial list of manifests and a page token used to
  * build the next request if the request has been truncated.
  */
@js.native
trait SchemaManifestsListResponse extends js.Object {
  /**
    * Output only. Manifests contained in this list response.
    */
  var manifests: js.UndefOr[js.Array[SchemaManifest]] = js.native
  /**
    * Output only. A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaManifestsListResponse {
  @scala.inline
  def apply(): SchemaManifestsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManifestsListResponse]
  }
  @scala.inline
  implicit class SchemaManifestsListResponseOps[Self <: SchemaManifestsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManifests(value: js.Array[SchemaManifest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifests")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

