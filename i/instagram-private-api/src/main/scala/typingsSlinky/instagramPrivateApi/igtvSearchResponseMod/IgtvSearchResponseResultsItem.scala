package typingsSlinky.instagramPrivateApi.igtvSearchResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgtvSearchResponseResultsItem extends js.Object {
  var channel: IgtvSearchResponseChannel = js.native
  var `type`: String = js.native
  var user: IgtvSearchResponseUser = js.native
}

object IgtvSearchResponseResultsItem {
  @scala.inline
  def apply(channel: IgtvSearchResponseChannel, `type`: String, user: IgtvSearchResponseUser): IgtvSearchResponseResultsItem = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvSearchResponseResultsItem]
  }
  @scala.inline
  implicit class IgtvSearchResponseResultsItemOps[Self <: IgtvSearchResponseResultsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel(value: IgtvSearchResponseChannel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: IgtvSearchResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

