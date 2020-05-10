package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsLambdaLayerVersionDetails extends js.Object {
  /**
    * The layer's compatible runtimes. Maximum number of 5 items. Valid values: nodejs10.x | nodejs12.x | java8 | java11 | python2.7 | python3.6 | python3.7 | python3.8 | dotnetcore1.0 | dotnetcore2.1 | go1.x | ruby2.5 | provided 
    */
  var CompatibleRuntimes: js.UndefOr[NonEmptyStringList] = js.native
  /**
    * The date that the version was created, in ISO 8601 format. For example, 2018-11-27T15:10:45.123+0000. 
    */
  var CreatedDate: js.UndefOr[NonEmptyString] = js.native
  /**
    * The version number.
    */
  var Version: js.UndefOr[AwsLambdaLayerVersionNumber] = js.native
}

object AwsLambdaLayerVersionDetails {
  @scala.inline
  def apply(): AwsLambdaLayerVersionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaLayerVersionDetails]
  }
  @scala.inline
  implicit class AwsLambdaLayerVersionDetailsOps[Self <: AwsLambdaLayerVersionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompatibleRuntimes(value: NonEmptyStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompatibleRuntimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompatibleRuntimes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompatibleRuntimes")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDate(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: AwsLambdaLayerVersionNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
        ret
    }
  }
  
}

