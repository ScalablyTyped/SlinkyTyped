package typingsSlinky.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDownloadUrlForLayerResponse extends js.Object {
  /**
    * The pre-signed Amazon S3 download URL for the requested layer.
    */
  var downloadUrl: js.UndefOr[Url] = js.native
  /**
    * The digest of the image layer to download.
    */
  var layerDigest: js.UndefOr[LayerDigest] = js.native
}

object GetDownloadUrlForLayerResponse {
  @scala.inline
  def apply(): GetDownloadUrlForLayerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDownloadUrlForLayerResponse]
  }
  @scala.inline
  implicit class GetDownloadUrlForLayerResponseOps[Self <: GetDownloadUrlForLayerResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownloadUrl(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerDigest(value: LayerDigest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerDigest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerDigest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerDigest")(js.undefined)
        ret
    }
  }
  
}

