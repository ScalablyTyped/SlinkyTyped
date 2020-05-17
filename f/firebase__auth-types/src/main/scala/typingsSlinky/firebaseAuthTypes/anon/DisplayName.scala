package typingsSlinky.firebaseAuthTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayName extends js.Object {
  var displayName: js.UndefOr[String | Null] = js.native
  var photoURL: js.UndefOr[String | Null] = js.native
}

object DisplayName {
  @scala.inline
  def apply(): DisplayName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayName]
  }
  @scala.inline
  implicit class DisplayNameOps[Self <: DisplayName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(null)
        ret
    }
    @scala.inline
    def withPhotoURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhotoURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoURL")(js.undefined)
        ret
    }
    @scala.inline
    def withPhotoURLNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoURL")(null)
        ret
    }
  }
  
}

