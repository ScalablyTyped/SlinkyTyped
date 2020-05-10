package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentOwnerAdvertisingOption extends js.Object {
  var allowedOptions: js.UndefOr[AllowedAdvertisingOptions] = js.native
  var claimedVideoOptions: js.UndefOr[ClaimedVideoDefaults] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
}

object ContentOwnerAdvertisingOption {
  @scala.inline
  def apply(): ContentOwnerAdvertisingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentOwnerAdvertisingOption]
  }
  @scala.inline
  implicit class ContentOwnerAdvertisingOptionOps[Self <: ContentOwnerAdvertisingOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedOptions(value: AllowedAdvertisingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withClaimedVideoOptions(value: ClaimedVideoDefaults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimedVideoOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaimedVideoOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimedVideoOptions")(js.undefined)
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
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

