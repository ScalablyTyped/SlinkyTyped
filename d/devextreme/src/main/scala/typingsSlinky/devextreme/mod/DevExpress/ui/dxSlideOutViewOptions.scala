package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.devextremeStrings.inverted
import typingsSlinky.devextreme.devextremeStrings.normal
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSlideOutViewOptions extends WidgetOptions[dxSlideOutView] {
  /** Specifies a custom template for the widget content. */
  var contentTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function1[/* contentElement */ dxElement, _])
  ] = js.native
  /** Specifies the current menu position. */
  var menuPosition: js.UndefOr[inverted | normal] = js.native
  /** Specifies a custom template for the menu content. */
  var menuTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function1[/* menuElement */ dxElement, _])
  ] = js.native
  /** Specifies whether or not the menu panel is visible. */
  var menuVisible: js.UndefOr[Boolean] = js.native
  /** Specifies whether or not the menu is shown when a user swipes the widget content. */
  var swipeEnabled: js.UndefOr[Boolean] = js.native
}

object dxSlideOutViewOptions {
  @scala.inline
  def apply(): dxSlideOutViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSlideOutViewOptions]
  }
  @scala.inline
  implicit class dxSlideOutViewOptionsOps[Self <: dxSlideOutViewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentTemplateFunction1(value: /* contentElement */ dxElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContentTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function1[/* contentElement */ dxElement, _])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuPosition(value: inverted | normal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuTemplateFunction1(value: /* menuElement */ dxElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuTemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMenuTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function1[/* menuElement */ dxElement, _])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeEnabled")(js.undefined)
        ret
    }
  }
  
}

