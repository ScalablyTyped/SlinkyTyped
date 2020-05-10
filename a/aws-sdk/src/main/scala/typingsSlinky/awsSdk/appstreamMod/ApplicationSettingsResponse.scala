package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationSettingsResponse extends js.Object {
  /**
    * Specifies whether persistent application settings are enabled for users during their streaming sessions.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * The S3 bucket where users’ persistent application settings are stored. When persistent application settings are enabled for the first time for an account in an AWS Region, an S3 bucket is created. The bucket is unique to the AWS account and the Region. 
    */
  var S3BucketName: js.UndefOr[String] = js.native
  /**
    * The path prefix for the S3 bucket where users’ persistent application settings are stored.
    */
  var SettingsGroup: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.SettingsGroup] = js.native
}

object ApplicationSettingsResponse {
  @scala.inline
  def apply(): ApplicationSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationSettingsResponse]
  }
  @scala.inline
  implicit class ApplicationSettingsResponseOps[Self <: ApplicationSettingsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withS3BucketName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3BucketName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BucketName")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsGroup(value: SettingsGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsGroup")(js.undefined)
        ret
    }
  }
  
}

