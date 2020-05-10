package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelArtifacts extends js.Object {
  /**
    * The path of the S3 object that contains the model artifacts. For example, s3://bucket-name/keynameprefix/model.tar.gz.
    */
  var S3ModelArtifacts: S3Uri = js.native
}

object ModelArtifacts {
  @scala.inline
  def apply(S3ModelArtifacts: S3Uri): ModelArtifacts = {
    val __obj = js.Dynamic.literal(S3ModelArtifacts = S3ModelArtifacts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelArtifacts]
  }
  @scala.inline
  implicit class ModelArtifactsOps[Self <: ModelArtifacts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3ModelArtifacts(value: S3Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3ModelArtifacts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

