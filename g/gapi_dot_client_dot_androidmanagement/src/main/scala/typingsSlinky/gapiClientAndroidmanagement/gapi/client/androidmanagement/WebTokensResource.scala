package typingsSlinky.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAndroidmanagement.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebTokensResource extends js.Object {
  /** Creates a web token to access an embeddable managed Google Play web UI for a given enterprise. */
  def create(request: Key): Request[WebToken] = js.native
}

object WebTokensResource {
  @scala.inline
  def apply(create: Key => Request[WebToken]): WebTokensResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[WebTokensResource]
  }
  @scala.inline
  implicit class WebTokensResourceOps[Self <: WebTokensResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: Key => Request[WebToken]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

