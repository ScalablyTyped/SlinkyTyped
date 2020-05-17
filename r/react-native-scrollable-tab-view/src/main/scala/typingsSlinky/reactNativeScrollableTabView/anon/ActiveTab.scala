package typingsSlinky.reactNativeScrollableTabView.anon

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.Animated.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveTab extends js.Object {
  var activeTab: js.UndefOr[Double] = js.native
  var containerWidth: js.UndefOr[Double] = js.native
  var goToPage: js.UndefOr[js.Function1[/* pageNumber */ Double, Unit]] = js.native
  var scrollValue: js.UndefOr[Value] = js.native
  var tabs: js.UndefOr[js.Array[ReactElement]] = js.native
}

object ActiveTab {
  @scala.inline
  def apply(): ActiveTab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveTab]
  }
  @scala.inline
  implicit class ActiveTabOps[Self <: ActiveTab] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveTab(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTab")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGoToPage(value: /* pageNumber */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToPage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGoToPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToPage")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollValue(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTabs(value: js.Array[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabs")(js.undefined)
        ret
    }
  }
  
}

