package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateChangeSetResponse extends js.Object {
  /**
    * Location of the Amazon S3 object.
    */
  var s3Location: js.UndefOr[S3Location] = js.native
}

object GenerateChangeSetResponse {
  @scala.inline
  def apply(): GenerateChangeSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateChangeSetResponse]
  }
  @scala.inline
  implicit class GenerateChangeSetResponseOps[Self <: GenerateChangeSetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3Location(value: S3Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Location: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Location")(js.undefined)
        ret
    }
  }
  
}

