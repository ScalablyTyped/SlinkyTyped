package typingsSlinky.reactNativeNavigation.optionsMod

import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.auto
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.hidden
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.leading
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.overlay
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.trailing
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsSplitView extends js.Object {
  /**
    * Master view display mode
    * @default 'auto'
    */
  var displayMode: js.UndefOr[auto | visible | hidden | overlay] = js.native
  /**
    * Set the maximum width of master view
    */
  var maxWidth: js.UndefOr[Double] = js.native
  /**
    * Set the minimum width of master view
    */
  var minWidth: js.UndefOr[Double] = js.native
  /**
    * Master view side. Leading is left. Trailing is right.
    * @default 'leading'
    */
  var primaryEdge: js.UndefOr[leading | trailing] = js.native
}

object OptionsSplitView {
  @scala.inline
  def apply(): OptionsSplitView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsSplitView]
  }
  @scala.inline
  implicit class OptionsSplitViewOps[Self <: OptionsSplitView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayMode(value: auto | visible | hidden | overlay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMode")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryEdge(value: leading | trailing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryEdge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryEdge")(js.undefined)
        ret
    }
  }
  
}

