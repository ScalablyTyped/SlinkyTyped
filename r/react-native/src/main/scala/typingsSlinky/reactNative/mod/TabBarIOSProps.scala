package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.auto
import typingsSlinky.reactNative.reactNativeStrings.center
import typingsSlinky.reactNative.reactNativeStrings.fill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabBarIOSProps extends ViewProps {
  /**
    * Background color of the tab bar
    */
  var barTintColor: js.UndefOr[String] = js.native
  /**
    * Specifies tab bar item positioning. Available values are:
    * - fill - distributes items across the entire width of the tab bar
    * - center - centers item in the available tab bar space
    * - auto (default) - distributes items dynamically according to the
    * user interface idiom. In a horizontally compact environment (e.g. iPhone 5)
    * this value defaults to `fill`, in a horizontally regular one (e.g. iPad)
    * it defaults to center.
    */
  var itemPositioning: js.UndefOr[fill | center | auto] = js.native
  /**
    * Color of the currently selected tab icon
    */
  var tintColor: js.UndefOr[String] = js.native
  /**
    * A Boolean value that indicates whether the tab bar is translucent
    */
  var translucent: js.UndefOr[Boolean] = js.native
  /**
    * Color of unselected tab icons. Available since iOS 10.
    */
  var unselectedItemTintColor: js.UndefOr[String] = js.native
  /**
    * Color of text on unselected tabs
    */
  var unselectedTintColor: js.UndefOr[String] = js.native
}

object TabBarIOSProps {
  @scala.inline
  def apply(): TabBarIOSProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabBarIOSProps]
  }
  @scala.inline
  implicit class TabBarIOSPropsOps[Self <: TabBarIOSProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barTintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barTintColor")(js.undefined)
        ret
    }
    @scala.inline
    def withItemPositioning(value: fill | center | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemPositioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemPositioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemPositioning")(js.undefined)
        ret
    }
    @scala.inline
    def withTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslucent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translucent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslucent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translucent")(js.undefined)
        ret
    }
    @scala.inline
    def withUnselectedItemTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectedItemTintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnselectedItemTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectedItemTintColor")(js.undefined)
        ret
    }
    @scala.inline
    def withUnselectedTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectedTintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnselectedTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectedTintColor")(js.undefined)
        ret
    }
  }
  
}

