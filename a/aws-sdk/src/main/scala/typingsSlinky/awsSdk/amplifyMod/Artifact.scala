package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Artifact extends js.Object {
  /**
    *  File name for the artifact. 
    */
  var artifactFileName: ArtifactFileName = js.native
  /**
    *  Unique Id for a artifact. 
    */
  var artifactId: ArtifactId = js.native
}

object Artifact {
  @scala.inline
  def apply(artifactFileName: ArtifactFileName, artifactId: ArtifactId): Artifact = {
    val __obj = js.Dynamic.literal(artifactFileName = artifactFileName.asInstanceOf[js.Any], artifactId = artifactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artifact]
  }
  @scala.inline
  implicit class ArtifactOps[Self <: Artifact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifactFileName(value: ArtifactFileName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifactId(value: ArtifactId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

