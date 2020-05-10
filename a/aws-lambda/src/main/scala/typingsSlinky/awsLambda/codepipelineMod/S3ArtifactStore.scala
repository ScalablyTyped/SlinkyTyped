package typingsSlinky.awsLambda.codepipelineMod

import typingsSlinky.awsLambda.awsLambdaStrings.S3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ArtifactStore extends js.Object {
  var s3Location: S3ArtifactLocation = js.native
  var `type`: S3 = js.native
}

object S3ArtifactStore {
  @scala.inline
  def apply(s3Location: S3ArtifactLocation, `type`: S3): S3ArtifactStore = {
    val __obj = js.Dynamic.literal(s3Location = s3Location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ArtifactStore]
  }
  @scala.inline
  implicit class S3ArtifactStoreOps[Self <: S3ArtifactStore] (val x: Self) extends AnyVal {
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
    def withType(value: S3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

