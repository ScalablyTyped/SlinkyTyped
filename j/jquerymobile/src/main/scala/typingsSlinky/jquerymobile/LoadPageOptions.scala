package typingsSlinky.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadPageOptions extends js.Object {
  var data: js.UndefOr[js.Any] = js.native
  var loadMsgDelay: js.UndefOr[Double] = js.native
  var pageContainer: js.UndefOr[JQuery] = js.native
  var reloadPage: js.UndefOr[Boolean] = js.native
  var role: js.UndefOr[String] = js.native
  var showLoadMsg: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object LoadPageOptions {
  @scala.inline
  def apply(): LoadPageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadPageOptions]
  }
  @scala.inline
  implicit class LoadPageOptionsOps[Self <: LoadPageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadMsgDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMsgDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadMsgDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMsgDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withPageContainer(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withReloadPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReloadPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadPage")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLoadMsg(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLoadMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLoadMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLoadMsg")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

