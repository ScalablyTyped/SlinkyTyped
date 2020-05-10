package typingsSlinky.angularToasty.toasty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGlobalConfig extends js.Object {
  /**
    * Whether clicking the toast closes it.
    */
  var clickToClose: js.UndefOr[Boolean] = js.native
  /**
    * Whether HTML is allowed in toast.
    */
  var html: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of toasts to show at once.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * The toast's message.
    */
  var msg: js.UndefOr[String] = js.native
  /**
    * The window position where the toast pops up.
    *
    */
  var position: js.UndefOr[String] = js.native
  /**
    * Whether to shake the toast.
    */
  var shake: js.UndefOr[Boolean] = js.native
  /**
    * Whether to show the 'X' icon to close the toast.
    */
  var showClose: js.UndefOr[Boolean] = js.native
  /**
    * Whether to play a sound when a toast is added.
    */
  var sound: js.UndefOr[Boolean] = js.native
  /**
    * What theme to use.
    * - 'default'
    * - 'material'
    * - 'bootstrap'
    */
  var theme: js.UndefOr[String] = js.native
  /**
    * How long (in miliseconds) the toast shows before it's removed. Set to false to disable.
    */
  var timeout: js.UndefOr[Double | Boolean] = js.native
  /**
    * The toast's title.
    */
  var title: js.UndefOr[String] = js.native
}

object IGlobalConfig {
  @scala.inline
  def apply(): IGlobalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGlobalConfig]
  }
  @scala.inline
  implicit class IGlobalConfigOps[Self <: IGlobalConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClickToClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickToClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToClose")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withShake(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shake")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShake: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shake")(js.undefined)
        ret
    }
    @scala.inline
    def withShowClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClose")(js.undefined)
        ret
    }
    @scala.inline
    def withSound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

