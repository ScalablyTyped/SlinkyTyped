package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.ModelAny
import typingsSlinky.devextreme.anon.ModelTitleElement
import typingsSlinky.devextreme.devextremeStrings.`left bottom`
import typingsSlinky.devextreme.devextremeStrings.`left top`
import typingsSlinky.devextreme.devextremeStrings.`right bottom`
import typingsSlinky.devextreme.devextremeStrings.`right top`
import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.top
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.positionConfig
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPopupOptions[T] extends dxOverlayOptions[T] {
  /** Configures widget visibility animations. This object contains two fields: show and hide. */
  @JSName("animation")
  var animation_dxPopupOptions: js.UndefOr[dxPopupAnimation] = js.native
  /** Specifies the container in which to place the widget. */
  var container: js.UndefOr[String | Element | JQuery] = js.native
  /** A Boolean value specifying whether or not to display the widget in full-screen mode. */
  var fullScreen: js.UndefOr[Boolean] = js.native
  /** A function that is executed each time the widget is resized by one pixel. */
  var onResize: js.UndefOr[js.Function1[/* e */ ModelAny[T], _]] = js.native
  /** A function that is executed when resizing ends. */
  var onResizeEnd: js.UndefOr[js.Function1[/* e */ ModelAny[T], _]] = js.native
  /** A function that is executed when resizing starts. */
  var onResizeStart: js.UndefOr[js.Function1[/* e */ ModelAny[T], _]] = js.native
  /** A function that is executed when the widget's title is rendered. */
  var onTitleRendered: js.UndefOr[js.Function1[/* e */ ModelTitleElement[T], _]] = js.native
  /** Positions the widget. */
  @JSName("position")
  var position_dxPopupOptions: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | positionConfig | js.Function
  ] = js.native
  /** Specifies whether or not an end user can resize the widget. */
  var resizeEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies whether or not the widget displays the Close button. */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  /** A Boolean value specifying whether or not to display the title in the popup window. */
  var showTitle: js.UndefOr[Boolean] = js.native
  /** The title in the overlay window. */
  var title: js.UndefOr[String] = js.native
  /** Specifies a custom template for the widget title. Does not apply if the title is defined. */
  var titleTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function1[/* titleElement */ dxElement, String | Element | JQuery])
  ] = js.native
  /** Configures toolbar items. */
  var toolbarItems: js.UndefOr[js.Array[dxPopupToolbarItem]] = js.native
}

object dxPopupOptions {
  @scala.inline
  def apply[T](): dxPopupOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPopupOptions[T]]
  }
  @scala.inline
  implicit class dxPopupOptionsOps[Self[t] <: dxPopupOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAnimation(value: dxPopupAnimation): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerElement(value: Element): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: String | Element | JQuery): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withFullScreen(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullScreen: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResize(value: /* e */ ModelAny[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResize: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResizeEnd(value: /* e */ ModelAny[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResizeEnd: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResizeStart(value: /* e */ ModelAny[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResizeStart: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTitleRendered(value: /* e */ ModelTitleElement[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTitleRendered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTitleRendered: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTitleRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(
      value: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | positionConfig | js.Function
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCloseButton(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCloseButton: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTitle(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTitle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleTemplateFunction1(value: /* titleElement */ dxElement => String | Element | JQuery): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTitleTemplateElement(value: Element): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function1[/* titleElement */ dxElement, String | Element | JQuery])
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleTemplate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarItems(value: js.Array[dxPopupToolbarItem]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarItems: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarItems")(js.undefined)
        ret
    }
  }
  
}

