package typingsSlinky.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidmanagement.AnonCallbackUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignupUrlsResource extends js.Object {
  /** Creates an enterprise signup URL. */
  def create(request: AnonCallbackUrl): Request_[SignupUrl] = js.native
}

object SignupUrlsResource {
  @scala.inline
  def apply(create: AnonCallbackUrl => Request_[SignupUrl]): SignupUrlsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[SignupUrlsResource]
  }
  @scala.inline
  implicit class SignupUrlsResourceOps[Self <: SignupUrlsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonCallbackUrl => Request_[SignupUrl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

