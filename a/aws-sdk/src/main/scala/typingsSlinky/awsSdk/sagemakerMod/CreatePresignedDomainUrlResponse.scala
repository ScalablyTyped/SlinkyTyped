package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePresignedDomainUrlResponse extends js.Object {
  /**
    * The presigned URL.
    */
  var AuthorizedUrl: js.UndefOr[PresignedDomainUrl] = js.native
}

object CreatePresignedDomainUrlResponse {
  @scala.inline
  def apply(): CreatePresignedDomainUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePresignedDomainUrlResponse]
  }
  @scala.inline
  implicit class CreatePresignedDomainUrlResponseOps[Self <: CreatePresignedDomainUrlResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizedUrl(value: PresignedDomainUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizedUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizedUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizedUrl")(js.undefined)
        ret
    }
  }
  
}

