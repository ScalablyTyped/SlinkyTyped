package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetArtifactUrlRequest extends js.Object {
  /**
    *  Unique Id for a artifact. 
    */
  var artifactId: ArtifactId = js.native
}

object GetArtifactUrlRequest {
  @scala.inline
  def apply(artifactId: ArtifactId): GetArtifactUrlRequest = {
    val __obj = js.Dynamic.literal(artifactId = artifactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetArtifactUrlRequest]
  }
  @scala.inline
  implicit class GetArtifactUrlRequestOps[Self <: GetArtifactUrlRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifactId(value: ArtifactId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

