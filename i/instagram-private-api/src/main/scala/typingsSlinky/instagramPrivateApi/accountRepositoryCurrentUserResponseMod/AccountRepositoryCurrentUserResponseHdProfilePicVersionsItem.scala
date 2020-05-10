package typingsSlinky.instagramPrivateApi.accountRepositoryCurrentUserResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem extends js.Object {
  var height: Double = js.native
  var url: String = js.native
  var width: Double = js.native
}

object AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem {
  @scala.inline
  def apply(height: Double, url: String, width: Double): AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem]
  }
  @scala.inline
  implicit class AccountRepositoryCurrentUserResponseHdProfilePicVersionsItemOps[Self <: AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

