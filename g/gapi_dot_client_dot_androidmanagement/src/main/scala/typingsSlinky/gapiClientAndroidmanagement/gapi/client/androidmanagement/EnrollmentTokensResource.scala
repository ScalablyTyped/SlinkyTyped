package typingsSlinky.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidmanagement.AnonAlt
import typingsSlinky.gapiClientAndroidmanagement.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnrollmentTokensResource extends js.Object {
  /** Creates an enrollment token for a given enterprise. */
  def create(request: AnonKey): Request_[EnrollmentToken] = js.native
  /** Deletes an enrollment token, which prevents future use of the token. */
  def delete(request: AnonAlt): Request_[js.Object] = js.native
}

object EnrollmentTokensResource {
  @scala.inline
  def apply(create: AnonKey => Request_[EnrollmentToken], delete: AnonAlt => Request_[js.Object]): EnrollmentTokensResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete))
    __obj.asInstanceOf[EnrollmentTokensResource]
  }
  @scala.inline
  implicit class EnrollmentTokensResourceOps[Self <: EnrollmentTokensResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonKey => Request_[EnrollmentToken]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonAlt => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

