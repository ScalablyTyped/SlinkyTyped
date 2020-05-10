package typingsSlinky.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMessageStoreUrl extends js.Object {
  var messageStoreUrl: js.UndefOr[String] = js.native
  var noteStoreUrl: js.UndefOr[String] = js.native
  var userStoreUrl: js.UndefOr[String] = js.native
  var userWebSocketUrl: js.UndefOr[String] = js.native
  var utilityUrl: js.UndefOr[String] = js.native
  var webApiUrlPrefix: js.UndefOr[String] = js.native
}

object AnonMessageStoreUrl {
  @scala.inline
  def apply(): AnonMessageStoreUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMessageStoreUrl]
  }
  @scala.inline
  implicit class AnonMessageStoreUrlOps[Self <: AnonMessageStoreUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageStoreUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageStoreUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageStoreUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageStoreUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withNoteStoreUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteStoreUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoteStoreUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteStoreUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withUserStoreUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStoreUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserStoreUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStoreUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withUserWebSocketUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userWebSocketUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserWebSocketUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userWebSocketUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withUtilityUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utilityUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtilityUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utilityUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withWebApiUrlPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webApiUrlPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebApiUrlPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webApiUrlPrefix")(js.undefined)
        ret
    }
  }
  
}

