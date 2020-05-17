package typingsSlinky.expo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelId extends js.Object {
  var channelId: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var icon: js.UndefOr[String] = js.native
  var link: js.UndefOr[String] = js.native
  var sticky: js.UndefOr[Boolean] = js.native
}

object ChannelId {
  @scala.inline
  def apply(): ChannelId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelId]
  }
  @scala.inline
  implicit class ChannelIdOps[Self <: ChannelId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withSticky(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticky")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSticky: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticky")(js.undefined)
        ret
    }
  }
  
}

