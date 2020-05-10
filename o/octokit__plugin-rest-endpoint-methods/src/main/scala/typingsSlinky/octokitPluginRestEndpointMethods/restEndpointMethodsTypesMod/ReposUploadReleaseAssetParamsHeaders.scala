package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposUploadReleaseAssetParamsHeaders extends js.Object {
  var `content-length`: Double = js.native
  var `content-type`: String = js.native
}

object ReposUploadReleaseAssetParamsHeaders {
  @scala.inline
  def apply(`content-length`: Double, `content-type`: String): ReposUploadReleaseAssetParamsHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content-length")(`content-length`.asInstanceOf[js.Any])
    __obj.updateDynamic("content-type")(`content-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUploadReleaseAssetParamsHeaders]
  }
  @scala.inline
  implicit class ReposUploadReleaseAssetParamsHeadersOps[Self <: ReposUploadReleaseAssetParamsHeaders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withContent-length`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content-length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withContent-type`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content-type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

