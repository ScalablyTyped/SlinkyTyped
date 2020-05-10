package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppEdit extends js.Object {
  /** The time at which the edit will expire and will be no longer valid for use in any subsequent API calls (encoded as seconds since the Epoch). */
  var expiryTimeSeconds: js.UndefOr[String] = js.native
  /** The ID of the edit that can be used in subsequent API calls. */
  var id: js.UndefOr[String] = js.native
}

object AppEdit {
  @scala.inline
  def apply(): AppEdit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppEdit]
  }
  @scala.inline
  implicit class AppEditOps[Self <: AppEdit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpiryTimeSeconds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiryTimeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiryTimeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiryTimeSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

