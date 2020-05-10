package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientYoutube.AnonRegionCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoCategoriesResource extends js.Object {
  /** Returns a list of categories that can be associated with YouTube videos. */
  def list(request: AnonRegionCode): Request_[VideoCategoryListResponse] = js.native
}

object VideoCategoriesResource {
  @scala.inline
  def apply(list: AnonRegionCode => Request_[VideoCategoryListResponse]): VideoCategoriesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[VideoCategoriesResource]
  }
  @scala.inline
  implicit class VideoCategoriesResourceOps[Self <: VideoCategoriesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonRegionCode => Request_[VideoCategoryListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

