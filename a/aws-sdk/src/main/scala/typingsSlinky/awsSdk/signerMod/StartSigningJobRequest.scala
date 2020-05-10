package typingsSlinky.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSigningJobRequest extends js.Object {
  /**
    * String that identifies the signing request. All calls after the first that use this token return the same response as the first call.
    */
  var clientRequestToken: ClientRequestToken = js.native
  /**
    * The S3 bucket in which to save your signed object. The destination contains the name of your bucket and an optional prefix.
    */
  var destination: Destination = js.native
  /**
    * The name of the signing profile.
    */
  var profileName: js.UndefOr[ProfileName] = js.native
  /**
    * The S3 bucket that contains the object to sign or a BLOB that contains your raw code.
    */
  var source: Source = js.native
}

object StartSigningJobRequest {
  @scala.inline
  def apply(clientRequestToken: ClientRequestToken, destination: Destination, source: Source): StartSigningJobRequest = {
    val __obj = js.Dynamic.literal(clientRequestToken = clientRequestToken.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSigningJobRequest]
  }
  @scala.inline
  implicit class StartSigningJobRequestOps[Self <: StartSigningJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestination(value: Destination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: Source): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfileName(value: ProfileName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileName")(js.undefined)
        ret
    }
  }
  
}

