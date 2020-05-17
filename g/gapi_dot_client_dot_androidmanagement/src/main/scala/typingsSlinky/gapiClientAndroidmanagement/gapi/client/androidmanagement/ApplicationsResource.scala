package typingsSlinky.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAndroidmanagement.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationsResource extends js.Object {
  /** Gets info about an application. */
  def get(request: Accesstoken): Request[Application] = js.native
}

object ApplicationsResource {
  @scala.inline
  def apply(get: Accesstoken => Request[Application]): ApplicationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[ApplicationsResource]
  }
  @scala.inline
  implicit class ApplicationsResourceOps[Self <: ApplicationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Accesstoken => Request[Application]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

