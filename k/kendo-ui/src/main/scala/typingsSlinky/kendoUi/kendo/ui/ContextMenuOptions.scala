package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.kendo.data.HierarchicalDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenuOptions extends js.Object {
  var activate: js.UndefOr[js.Function1[/* e */ ContextMenuActivateEvent, Unit]] = js.native
  var alignToAnchor: js.UndefOr[Boolean] = js.native
  var animation: js.UndefOr[Boolean | ContextMenuAnimation] = js.native
  var appendTo: js.UndefOr[String | JQuery] = js.native
  var close: js.UndefOr[js.Function1[/* e */ ContextMenuCloseEvent, Unit]] = js.native
  var closeOnClick: js.UndefOr[Boolean] = js.native
  var copyAnchorStyles: js.UndefOr[Boolean] = js.native
  var dataContentField: js.UndefOr[String] = js.native
  var dataImageUrlField: js.UndefOr[String] = js.native
  var dataSource: js.UndefOr[js.Any | HierarchicalDataSource] = js.native
  var dataSpriteCssClassField: js.UndefOr[String] = js.native
  var dataTextField: js.UndefOr[String] = js.native
  var dataUrlField: js.UndefOr[String] = js.native
  var deactivate: js.UndefOr[js.Function1[/* e */ ContextMenuDeactivateEvent, Unit]] = js.native
  var direction: js.UndefOr[String] = js.native
  var filter: js.UndefOr[String] = js.native
  var hoverDelay: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var open: js.UndefOr[js.Function1[/* e */ ContextMenuOpenEvent, Unit]] = js.native
  var orientation: js.UndefOr[String] = js.native
  var popupCollision: js.UndefOr[String] = js.native
  var scrollable: js.UndefOr[Boolean | ContextMenuScrollable] = js.native
  var select: js.UndefOr[js.Function1[/* e */ ContextMenuSelectEvent, Unit]] = js.native
  var showOn: js.UndefOr[String] = js.native
  var target: js.UndefOr[String | JQuery] = js.native
}

object ContextMenuOptions {
  @scala.inline
  def apply(): ContextMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuOptions]
  }
  @scala.inline
  implicit class ContextMenuOptionsOps[Self <: ContextMenuOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivate(value: /* e */ ContextMenuActivateEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignToAnchor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignToAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignToAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignToAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: Boolean | ContextMenuAnimation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendTo(value: String | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(js.undefined)
        ret
    }
    @scala.inline
    def withClose(value: /* e */ ContextMenuCloseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyAnchorStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyAnchorStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyAnchorStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyAnchorStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withDataContentField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataContentField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataContentField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataContentField")(js.undefined)
        ret
    }
    @scala.inline
    def withDataImageUrlField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataImageUrlField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataImageUrlField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataImageUrlField")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any | HierarchicalDataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSpriteCssClassField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSpriteCssClassField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSpriteCssClassField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSpriteCssClassField")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTextField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTextField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTextField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTextField")(js.undefined)
        ret
    }
    @scala.inline
    def withDataUrlField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataUrlField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataUrlField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataUrlField")(js.undefined)
        ret
    }
    @scala.inline
    def withDeactivate(value: /* e */ ContextMenuDeactivateEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDeactivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivate")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: /* e */ ContextMenuOpenEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupCollision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupCollision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupCollision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupCollision")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollable(value: Boolean | ContextMenuScrollable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollable")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: /* e */ ContextMenuSelectEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOn")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

