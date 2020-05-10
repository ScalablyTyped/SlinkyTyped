package typingsSlinky.materialUi.MaterialUI

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppBarProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var iconClassNameLeft: js.UndefOr[String] = js.native
  var iconClassNameRight: js.UndefOr[String] = js.native
  var iconElementLeft: js.UndefOr[ReactElement] = js.native
  var iconElementRight: js.UndefOr[ReactElement] = js.native
  var iconStyleLeft: js.UndefOr[CSSProperties] = js.native
  var iconStyleRight: js.UndefOr[CSSProperties] = js.native
  var onLeftIconButtonClick: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  var onRightIconButtonClick: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  var onTitleClick: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  var showMenuIconButton: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var title: js.UndefOr[TagMod[Any]] = js.native
  var titleStyle: js.UndefOr[CSSProperties] = js.native
  var zDepth: js.UndefOr[Double] = js.native
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
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withIconClassNameLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClassNameLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconClassNameLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClassNameLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withIconClassNameRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClassNameRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconClassNameRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClassNameRight")(js.undefined)
        ret
    }
    @scala.inline
    def withIconElementLeft(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconElementLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconElementLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconElementLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withIconElementRight(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconElementRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconElementRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconElementRight")(js.undefined)
        ret
    }
    @scala.inline
    def withIconStyleLeft(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconStyleLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconStyleLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconStyleLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withIconStyleRight(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconStyleRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconStyleRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconStyleRight")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLeftIconButtonClick(value: SyntheticMouseEvent[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeftIconButtonClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLeftIconButtonClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeftIconButtonClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRightIconButtonClick(value: SyntheticMouseEvent[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRightIconButtonClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRightIconButtonClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRightIconButtonClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTitleClick(value: SyntheticMouseEvent[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTitleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTitleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTitleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMenuIconButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMenuIconButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMenuIconButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMenuIconButton")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: TagMod[Any]): Self = {
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
    @scala.inline
    def withTitleStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withZDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zDepth")(js.undefined)
        ret
    }
  }
  
}

