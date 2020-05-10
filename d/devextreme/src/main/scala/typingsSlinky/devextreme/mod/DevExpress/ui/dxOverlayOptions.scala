package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.AnonCancelComponentElementModel
import typingsSlinky.devextreme.AnonElementDxElement
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.event
import typingsSlinky.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxOverlayOptions[T] extends WidgetOptions[T] {
  /** Configures widget visibility animations. This object contains two fields: show and hide. */
  var animation: js.UndefOr[dxOverlayAnimation] = js.native
  /** Specifies whether to close the widget if a user clicks outside it. */
  var closeOnOutsideClick: js.UndefOr[Boolean | (js.Function1[/* event */ event, Boolean])] = js.native
  /** Specifies a custom template for the widget content. */
  var contentTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function1[/* contentElement */ dxElement, String | Element | JQuery])
  ] = js.native
  /** Specifies whether to render the widget's content when it is displayed. If false, the content is rendered immediately. */
  var deferRendering: js.UndefOr[Boolean] = js.native
  /** Specifies whether or not an end-user can drag the widget. */
  var dragEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies the maximum height the widget can reach while resizing. */
  var maxHeight: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.native
  /** Specifies the maximum width the widget can reach while resizing. */
  var maxWidth: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.native
  /** Specifies the minimum height the widget can reach while resizing. */
  var minHeight: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.native
  /** Specifies the minimum width the widget can reach while resizing. */
  var minWidth: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.native
  /** A function that is executed after the widget is hidden. */
  var onHidden: js.UndefOr[js.Function1[/* e */ AnonElementDxElement[T], _]] = js.native
  /** A function that is executed before the widget is hidden. */
  var onHiding: js.UndefOr[js.Function1[/* e */ AnonCancelComponentElementModel[T], _]] = js.native
  /** A function that is executed before the widget is displayed. */
  var onShowing: js.UndefOr[js.Function1[/* e */ AnonElementDxElement[T], _]] = js.native
  /** A function that is executed after the widget is displayed. */
  var onShown: js.UndefOr[js.Function1[/* e */ AnonElementDxElement[T], _]] = js.native
  /** Positions the widget. */
  var position: js.UndefOr[js.Any] = js.native
  /** Specifies whether to shade the background when the widget is active. */
  var shading: js.UndefOr[Boolean] = js.native
  /** Specifies the shading color. */
  var shadingColor: js.UndefOr[String] = js.native
}

object dxOverlayOptions {
  @scala.inline
  def apply[T](): dxOverlayOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxOverlayOptions[T]]
  }
  @scala.inline
  implicit class dxOverlayOptionsOps[Self[t] <: dxOverlayOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAnimation(value: dxOverlayAnimation): Self[T] = {
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
    def withCloseOnOutsideClickFunction1(value: /* event */ event => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnOutsideClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCloseOnOutsideClick(value: Boolean | (js.Function1[/* event */ event, Boolean])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnOutsideClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnOutsideClick: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnOutsideClick")(js.undefined)
        ret
    }
    @scala.inline
    def withContentTemplateFunction1(value: /* contentElement */ dxElement => String | Element | JQuery): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContentTemplateElement(value: Element): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function1[/* contentElement */ dxElement, String | Element | JQuery])
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentTemplate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferRendering(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferRendering: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withDragEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeightFunction0(value: () => Double | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double | String | (js.Function0[Double | String])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidthFunction0(value: () => Double | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double | String | (js.Function0[Double | String])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeightFunction0(value: () => Double | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMinHeight(value: Double | String | (js.Function0[Double | String])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidthFunction0(value: () => Double | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMinWidth(value: Double | String | (js.Function0[Double | String])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHidden(value: /* e */ AnonElementDxElement[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHidden")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHidden: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHiding(value: /* e */ AnonCancelComponentElementModel[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHiding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHiding: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHiding")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShowing(value: /* e */ AnonElementDxElement[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShowing: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShown(value: /* e */ AnonElementDxElement[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShown: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShown")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: js.Any): Self[T] = {
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
    def withShading(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShading: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shading")(js.undefined)
        ret
    }
    @scala.inline
    def withShadingColor(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadingColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadingColor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadingColor")(js.undefined)
        ret
    }
  }
  
}

