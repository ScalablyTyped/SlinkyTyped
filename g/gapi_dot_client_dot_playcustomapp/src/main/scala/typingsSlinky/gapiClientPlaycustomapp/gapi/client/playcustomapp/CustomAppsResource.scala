package typingsSlinky.gapiClientPlaycustomapp.gapi.client.playcustomapp

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientPlaycustomapp.anon.Account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomAppsResource extends js.Object {
  /** Create and publish a new custom app. */
  def create(request: Account): Request[CustomApp] = js.native
}

object CustomAppsResource {
  @scala.inline
  def apply(create: Account => Request[CustomApp]): CustomAppsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[CustomAppsResource]
  }
  @scala.inline
  implicit class CustomAppsResourceOps[Self <: CustomAppsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: Account => Request[CustomApp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

