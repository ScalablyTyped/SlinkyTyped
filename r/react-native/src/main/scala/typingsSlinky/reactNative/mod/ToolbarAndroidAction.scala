package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.always
import typingsSlinky.reactNative.reactNativeStrings.ifRoom
import typingsSlinky.reactNative.reactNativeStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarAndroidAction extends js.Object {
  /**
    * icon: the icon for this action, e.g. require('./some_icon.png')
    */
  var icon: js.UndefOr[ImageURISource] = js.native
  /**
    * show: when to show this action as an icon or hide it in the overflow menu: always, ifRoom or never
    */
  var show: js.UndefOr[always | ifRoom | never] = js.native
  /**
    * showWithText: boolean, whether to show text alongside the icon or not
    */
  var showWithText: js.UndefOr[Boolean] = js.native
  /**
    *  title: required, the title of this action
    */
  var title: String = js.native
}

object ToolbarAndroidAction {
  @scala.inline
  def apply(title: String): ToolbarAndroidAction = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarAndroidAction]
  }
  @scala.inline
  implicit class ToolbarAndroidActionOps[Self <: ToolbarAndroidAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: ImageURISource): Self = {
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
    def withShow(value: always | ifRoom | never): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withShowWithText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWithText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowWithText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWithText")(js.undefined)
        ret
    }
  }
  
}

