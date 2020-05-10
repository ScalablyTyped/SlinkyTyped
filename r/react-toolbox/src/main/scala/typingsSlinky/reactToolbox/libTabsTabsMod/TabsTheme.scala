package typingsSlinky.reactToolbox.libTabsTabsMod

import typingsSlinky.reactToolbox.tabsTabMod.TabTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.reactToolbox.tabsTabContentMod.TabContentTheme because var conflicts: active. Inlined tab */ @js.native
trait TabsTheme extends TabTheme {
  /**
    * Class used for arrows.
    */
  var arrow: js.UndefOr[String] = js.native
  /**
    * Class used for arrow container.
    */
  var arrowContainer: js.UndefOr[String] = js.native
  /**
    * Class used when 'disableAnimatedBottomBorder' is true.
    */
  var disableAnimation: js.UndefOr[String] = js.native
  /**
    * Used to make the 'fixed tabs'.
    */
  var fixed: js.UndefOr[String] = js.native
  /**
    * Used to invert the colors.
    */
  var inverse: js.UndefOr[String] = js.native
  /**
    * Used for the navigation element.
    */
  var navigation: js.UndefOr[String] = js.native
  /**
    * Used for navigation container.
    */
  var navigationContainer: js.UndefOr[String] = js.native
  /**
    * Used for the moving underline element.
    */
  var pointer: js.UndefOr[String] = js.native
  /**
    * Used for the tab content element.
    */
  var tab: js.UndefOr[String] = js.native
  /**
    * Used as a root classname for the component.
    */
  var tabs: js.UndefOr[String] = js.native
}

object TabsTheme {
  @scala.inline
  def apply(): TabsTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsTheme]
  }
  @scala.inline
  implicit class TabsThemeOps[Self <: TabsTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAnimation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withFixed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(js.undefined)
        ret
    }
    @scala.inline
    def withInverse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withPointer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointer")(js.undefined)
        ret
    }
    @scala.inline
    def withTab(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab")(js.undefined)
        ret
    }
    @scala.inline
    def withTabs(value: String): Self = {
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

