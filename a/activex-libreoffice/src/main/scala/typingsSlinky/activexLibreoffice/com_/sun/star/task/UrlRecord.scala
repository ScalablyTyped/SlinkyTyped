package typingsSlinky.activexLibreoffice.com_.sun.star.task

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlRecord extends js.Object {
  var Url: String = js.native
  var UserList: SafeArray[UserRecord] = js.native
}

object UrlRecord {
  @scala.inline
  def apply(Url: String, UserList: SafeArray[UserRecord]): UrlRecord = {
    val __obj = js.Dynamic.literal(Url = Url.asInstanceOf[js.Any], UserList = UserList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlRecord]
  }
  @scala.inline
  implicit class UrlRecordOps[Self <: UrlRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserList(value: SafeArray[UserRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

