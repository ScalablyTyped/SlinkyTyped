package typingsSlinky.reactToolbox.appBarAppBarMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactToolbox.componentsMod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppBarProps extends Props {
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Determine if the bar should have position fixed or relative.
    * @default false
    */
  var fixed: js.UndefOr[Boolean] = js.native
  /**
    * If true, the AppBar doesn't show a shadow.
    * @default false
    */
  var flat: js.UndefOr[Boolean] = js.native
  /**
    * If it exists it is used as the AppBar left icon
    */
  var leftIcon: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Called when the left icon is clicked
    */
  var onLeftIconClick: js.UndefOr[js.Function] = js.native
  /**
    * Called when the righticon is clicked
    */
  var onRightIconClick: js.UndefOr[js.Function] = js.native
  /**
    * If it exists it is used as the AppBar right icon
    */
  var rightIcon: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Whether AppBar should be hidden during scroll.
    * @default false
    */
  var scrollHide: js.UndefOr[Boolean] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[AppBarTheme] = js.native
  /**
    * If it exists it is used as the AppBar title
    */
  var title: js.UndefOr[String] = js.native
}

object AppBarProps {
  @scala.inline
  def apply(): AppBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppBarProps]
  }
  @scala.inline
  implicit class AppBarPropsOps[Self <: AppBarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withFixed(value: Boolean): Self = {
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
    def withFlat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftIcon(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLeftIconClick(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeftIconClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLeftIconClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeftIconClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRightIconClick(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRightIconClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnRightIconClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRightIconClick")(js.undefined)
        ret
    }
    @scala.inline
    def withRightIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightIcon(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHide")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: AppBarTheme): Self = {
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

