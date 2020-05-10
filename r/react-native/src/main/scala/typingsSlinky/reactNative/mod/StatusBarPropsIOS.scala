package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.fade
import typingsSlinky.reactNative.reactNativeStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusBarPropsIOS extends js.Object {
  /**
    * Sets the color of the status bar text.
    */
  var barStyle: js.UndefOr[StatusBarStyle] = js.native
  /**
    * If the network activity indicator should be visible.
    */
  var networkActivityIndicatorVisible: js.UndefOr[Boolean] = js.native
  /**
    * The transition effect when showing and hiding the status bar using
    * the hidden prop. Defaults to 'fade'.
    */
  var showHideTransition: js.UndefOr[fade | slide] = js.native
}

object StatusBarPropsIOS {
  @scala.inline
  def apply(): StatusBarPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusBarPropsIOS]
  }
  @scala.inline
  implicit class StatusBarPropsIOSOps[Self <: StatusBarPropsIOS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarStyle(value: StatusBarStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkActivityIndicatorVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkActivityIndicatorVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkActivityIndicatorVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkActivityIndicatorVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHideTransition(value: fade | slide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHideTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHideTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHideTransition")(js.undefined)
        ret
    }
  }
  
}

