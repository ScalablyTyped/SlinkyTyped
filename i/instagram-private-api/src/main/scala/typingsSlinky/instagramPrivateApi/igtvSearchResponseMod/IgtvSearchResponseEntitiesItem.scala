package typingsSlinky.instagramPrivateApi.igtvSearchResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgtvSearchResponseEntitiesItem extends js.Object {
  var hashtag: js.UndefOr[IgtvSearchResponseHashtag] = js.native
  var user: js.UndefOr[IgtvSearchResponseUser] = js.native
}

object IgtvSearchResponseEntitiesItem {
  @scala.inline
  def apply(): IgtvSearchResponseEntitiesItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgtvSearchResponseEntitiesItem]
  }
  @scala.inline
  implicit class IgtvSearchResponseEntitiesItemOps[Self <: IgtvSearchResponseEntitiesItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashtag(value: IgtvSearchResponseHashtag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtag")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: IgtvSearchResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

