package typingsSlinky.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManifestsListResponse extends js.Object {
  /** Output only. Manifests contained in this list response. */
  var manifests: js.UndefOr[js.Array[Manifest]] = js.native
  /** Output only. A token used to continue a truncated list request. */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ManifestsListResponse {
  @scala.inline
  def apply(): ManifestsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManifestsListResponse]
  }
  @scala.inline
  implicit class ManifestsListResponseOps[Self <: ManifestsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManifests(value: js.Array[Manifest]): Self = {
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

