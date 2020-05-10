package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSigningJobParameter extends js.Object {
  /**
    * The location to write the code-signed file.
    */
  var destination: js.UndefOr[Destination] = js.native
  /**
    * The code-signing profile name.
    */
  var signingProfileName: js.UndefOr[SigningProfileName] = js.native
  /**
    * Describes the code-signing profile.
    */
  var signingProfileParameter: js.UndefOr[SigningProfileParameter] = js.native
}

object StartSigningJobParameter {
  @scala.inline
  def apply(): StartSigningJobParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSigningJobParameter]
  }
  @scala.inline
  implicit class StartSigningJobParameterOps[Self <: StartSigningJobParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: Destination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withSigningProfileName(value: SigningProfileName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingProfileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningProfileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingProfileName")(js.undefined)
        ret
    }
    @scala.inline
    def withSigningProfileParameter(value: SigningProfileParameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingProfileParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningProfileParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingProfileParameter")(js.undefined)
        ret
    }
  }
  
}

