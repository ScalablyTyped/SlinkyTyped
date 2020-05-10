package typingsSlinky.awsSdkQueryErrorUnmarshaller.constantsMod

import typingsSlinky.awsSdkQueryErrorUnmarshaller.AnonCode
import typingsSlinky.awsSdkQueryErrorUnmarshaller.AnonRequestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedErrorResponse extends js.Object {
  @JSName("$metadata")
  var $metadata: AnonRequestId = js.native
  var Error: js.UndefOr[AnonCode] = js.native
}

object ParsedErrorResponse {
  @scala.inline
  def apply($metadata: AnonRequestId): ParsedErrorResponse = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedErrorResponse]
  }
  @scala.inline
  implicit class ParsedErrorResponseOps[Self <: ParsedErrorResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$metadata(value: AnonRequestId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: AnonCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Error")(js.undefined)
        ret
    }
  }
  
}

