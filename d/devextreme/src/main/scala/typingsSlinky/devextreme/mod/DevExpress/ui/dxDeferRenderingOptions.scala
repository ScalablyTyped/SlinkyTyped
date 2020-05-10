package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.AnonComponentDxDeferRendering
import typingsSlinky.devextreme.mod.DevExpress.animationConfig
import typingsSlinky.devextreme.mod._Global_.JQueryPromise
import typingsSlinky.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDeferRenderingOptions extends WidgetOptions[dxDeferRendering] {
  /** Specifies the animation to be used to show the rendered content. */
  var animation: js.UndefOr[animationConfig] = js.native
  /** A function that is executed when the content is rendered but not yet displayed. */
  var onRendered: js.UndefOr[js.Function1[/* e */ AnonComponentDxDeferRendering, _]] = js.native
  /** A function that is executed when the content is displayed and animation is completed. */
  var onShown: js.UndefOr[js.Function1[/* e */ AnonComponentDxDeferRendering, _]] = js.native
  /** Specifies when the widget content is rendered. */
  var renderWhen: js.UndefOr[Promise[Unit] | JQueryPromise[Unit] | Boolean] = js.native
  /** Indicates if a load indicator should be shown until the widget's content is rendered. */
  var showLoadIndicator: js.UndefOr[Boolean] = js.native
  /** Specifies a jQuery selector of items that should be rendered using a staggered animation. */
  var staggerItemSelector: js.UndefOr[String] = js.native
}

object dxDeferRenderingOptions {
  @scala.inline
  def apply(): dxDeferRenderingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDeferRenderingOptions]
  }
  @scala.inline
  implicit class dxDeferRenderingOptionsOps[Self <: dxDeferRenderingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: animationConfig): Self = {
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
    def withOnRendered(value: /* e */ AnonComponentDxDeferRendering => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRendered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShown(value: /* e */ AnonComponentDxDeferRendering => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShown")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderWhen(value: Promise[Unit] | JQueryPromise[Unit] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderWhen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderWhen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderWhen")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLoadIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLoadIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLoadIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLoadIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withStaggerItemSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staggerItemSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaggerItemSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staggerItemSelector")(js.undefined)
        ret
    }
  }
  
}

