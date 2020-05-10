package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3MachineLearningModelResourceData extends js.Object {
  /**
    * The absolute local path of the resource inside the Lambda environment.
    */
  var DestinationPath: js.UndefOr[string] = js.native
  var OwnerSetting: js.UndefOr[ResourceDownloadOwnerSetting] = js.native
  /**
    * The URI of the source model in an S3 bucket. The model package must be in tar.gz or .zip format.
    */
  var S3Uri: js.UndefOr[string] = js.native
}

object S3MachineLearningModelResourceData {
  @scala.inline
  def apply(): S3MachineLearningModelResourceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3MachineLearningModelResourceData]
  }
  @scala.inline
  implicit class S3MachineLearningModelResourceDataOps[Self <: S3MachineLearningModelResourceData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationPath(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationPath")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerSetting(value: ResourceDownloadOwnerSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Uri(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Uri")(js.undefined)
        ret
    }
  }
  
}

