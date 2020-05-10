package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsCredentials extends js.Object {
  /**
    * Temporary key allowing access to the Amazon GameLift S3 account.
    */
  var AccessKeyId: js.UndefOr[NonEmptyString] = js.native
  /**
    * Temporary secret key allowing access to the Amazon GameLift S3 account.
    */
  var SecretAccessKey: js.UndefOr[NonEmptyString] = js.native
  /**
    * Token used to associate a specific build ID with the files uploaded using these credentials.
    */
  var SessionToken: js.UndefOr[NonEmptyString] = js.native
}

object AwsCredentials {
  @scala.inline
  def apply(): AwsCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCredentials]
  }
  @scala.inline
  implicit class AwsCredentialsOps[Self <: AwsCredentials] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessKeyId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretAccessKey(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretAccessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretAccessKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretAccessKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionToken(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionToken")(js.undefined)
        ret
    }
  }
  
}

