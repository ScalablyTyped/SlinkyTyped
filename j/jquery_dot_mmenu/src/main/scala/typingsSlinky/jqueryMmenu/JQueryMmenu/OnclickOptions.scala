package typingsSlinky.jqueryMmenu.JQueryMmenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnclickOptions extends js.Object {
  /**
    * Whether or not the menu should close after clicking a link inside it.
    * The default value varies per link: true if the default behavior for
    * the clicked link is prevented, false otherwise.
    * Default: null
    */
  var close: js.UndefOr[Boolean | js.Any] = js.native
  /**
    * Whether or not to prevent the default behavior for the clicked link.
    * The default value varies per link: true if its href is equal to
    * or starts with a hash (#), false otherwise.
    * Default: null
    */
  var preventDefault: js.UndefOr[Boolean | js.Any] = js.native
  /**
    * Whether or not the clicked link should be visibly "selected".
    * Default: true
    */
  var setSelected: js.UndefOr[Boolean | js.Any] = js.native
}

object OnclickOptions {
  @scala.inline
  def apply(): OnclickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnclickOptions]
  }
  @scala.inline
  implicit class OnclickOptionsOps[Self <: OnclickOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: Boolean | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDefault(value: Boolean | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSelected(value: Boolean | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelected")(js.undefined)
        ret
    }
  }
  
}

