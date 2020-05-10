package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetArtifactUrlResult extends js.Object {
  /**
    *  Unique Id for a artifact. 
    */
  var artifactId: ArtifactId = js.native
  /**
    *  Presigned url for the artifact. 
    */
  var artifactUrl: ArtifactUrl = js.native
}

object GetArtifactUrlResult {
  @scala.inline
  def apply(artifactId: ArtifactId, artifactUrl: ArtifactUrl): GetArtifactUrlResult = {
    val __obj = js.Dynamic.literal(artifactId = artifactId.asInstanceOf[js.Any], artifactUrl = artifactUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetArtifactUrlResult]
  }
  @scala.inline
  implicit class GetArtifactUrlResultOps[Self <: GetArtifactUrlResult] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withArtifactUrl(value: ArtifactUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

