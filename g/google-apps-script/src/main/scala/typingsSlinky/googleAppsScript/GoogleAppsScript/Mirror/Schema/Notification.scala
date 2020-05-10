package typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notification extends js.Object {
  var collection: js.UndefOr[String] = js.native
  var itemId: js.UndefOr[String] = js.native
  var operation: js.UndefOr[String] = js.native
  var userActions: js.UndefOr[js.Array[UserAction]] = js.native
  var userToken: js.UndefOr[String] = js.native
  var verifyToken: js.UndefOr[String] = js.native
}

object Notification {
  @scala.inline
  def apply(): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notification]
  }
  @scala.inline
  implicit class NotificationOps[Self <: Notification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(js.undefined)
        ret
    }
    @scala.inline
    def withItemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(js.undefined)
        ret
    }
    @scala.inline
    def withOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.undefined)
        ret
    }
    @scala.inline
    def withUserActions(value: js.Array[UserAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userActions")(js.undefined)
        ret
    }
    @scala.inline
    def withUserToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userToken")(js.undefined)
        ret
    }
    @scala.inline
    def withVerifyToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifyToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyToken")(js.undefined)
        ret
    }
  }
  
}

