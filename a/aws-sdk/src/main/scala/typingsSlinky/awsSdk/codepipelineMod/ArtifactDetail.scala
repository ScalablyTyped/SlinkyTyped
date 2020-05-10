package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactDetail extends js.Object {
  /**
    * The artifact object name for the action execution.
    */
  var name: js.UndefOr[ArtifactName] = js.native
  /**
    * The Amazon S3 artifact location for the action execution.
    */
  var s3location: js.UndefOr[S3Location] = js.native
}

object ArtifactDetail {
  @scala.inline
  def apply(): ArtifactDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactDetail]
  }
  @scala.inline
  implicit class ArtifactDetailOps[Self <: ArtifactDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: ArtifactName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withS3location(value: S3Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3location: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3location")(js.undefined)
        ret
    }
  }
  
}

