package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBuildOutput extends js.Object {
  /**
    * The newly created build record, including a unique build IDs and status. 
    */
  var Build: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.Build] = js.native
  /**
    * Amazon S3 location for your game build file, including bucket name and key.
    */
  var StorageLocation: js.UndefOr[S3Location] = js.native
  /**
    * This element is returned only when the operation is called without a storage location. It contains credentials to use when you are uploading a build file to an Amazon S3 bucket that is owned by Amazon GameLift. Credentials have a limited life span. To refresh these credentials, call RequestUploadCredentials. 
    */
  var UploadCredentials: js.UndefOr[AwsCredentials] = js.native
}

object CreateBuildOutput {
  @scala.inline
  def apply(): CreateBuildOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBuildOutput]
  }
  @scala.inline
  implicit class CreateBuildOutputOps[Self <: CreateBuildOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: Build): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Build")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageLocation(value: S3Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadCredentials(value: AwsCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadCredentials")(js.undefined)
        ret
    }
  }
  
}

