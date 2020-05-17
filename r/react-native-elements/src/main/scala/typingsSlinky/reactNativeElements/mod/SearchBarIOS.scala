package typingsSlinky.reactNativeElements.mod

import typingsSlinky.reactNativeElements.anon.PartialTouchableOpacityPr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBarIOS extends SearchBarPlatform {
  /**
    * Props passed to cancel button
    */
  var cancelButtonProps: js.UndefOr[PartialTouchableOpacityPr] = js.native
  /**
    * title of cancel button on iOS.  Default: 'Cancel'.
    */
  var cancelButtonTitle: js.UndefOr[String] = js.native
  /**
    * When `true` the cancel button will stay visible after blur events.
    */
  var showCancel: js.UndefOr[Boolean] = js.native
}

object SearchBarIOS {
  @scala.inline
  def apply(): SearchBarIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBarIOS]
  }
  @scala.inline
  implicit class SearchBarIOSOps[Self <: SearchBarIOS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelButtonProps(value: PartialTouchableOpacityPr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelButtonTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCancel")(js.undefined)
        ret
    }
  }
  
}

