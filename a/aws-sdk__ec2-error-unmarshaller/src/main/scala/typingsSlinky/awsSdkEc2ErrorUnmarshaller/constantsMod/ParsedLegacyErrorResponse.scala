package typingsSlinky.awsSdkEc2ErrorUnmarshaller.constantsMod

import typingsSlinky.awsSdkEc2ErrorUnmarshaller.anon.Error
import typingsSlinky.awsSdkEc2ErrorUnmarshaller.anon.RequestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedLegacyErrorResponse extends js.Object {
  @JSName("$metadata")
  var $metadata: RequestId = js.native
  var Errors: js.UndefOr[Error] = js.native
}

object ParsedLegacyErrorResponse {
  @scala.inline
  def apply($metadata: RequestId): ParsedLegacyErrorResponse = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedLegacyErrorResponse]
  }
  @scala.inline
  implicit class ParsedLegacyErrorResponseOps[Self <: ParsedLegacyErrorResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$metadata(value: RequestId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrors(value: Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Errors")(js.undefined)
        ret
    }
  }
  
}

