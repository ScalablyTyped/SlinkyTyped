package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactLocation extends js.Object {
  /**
    * The S3 bucket that contains the artifact.
    */
  var s3Location: js.UndefOr[S3ArtifactLocation] = js.native
  /**
    * The type of artifact in the location.
    */
  var `type`: js.UndefOr[ArtifactLocationType] = js.native
}

object ArtifactLocation {
  @scala.inline
  def apply(): ArtifactLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactLocation]
  }
  @scala.inline
  implicit class ArtifactLocationOps[Self <: ArtifactLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3Location(value: S3ArtifactLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Location: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Location")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ArtifactLocationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

