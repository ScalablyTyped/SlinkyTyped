package typingsSlinky.officeUiFabricReact.progressIndicatorTypesMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.progressIndicatorBaseMod.ProgressIndicatorBase
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProgressIndicatorProps extends ClassAttributes[ProgressIndicatorBase] {
  /**
    * Text alternative of the progress status, used by screen readers for reading the value of the progress.
    */
  var ariaValueText: js.UndefOr[String] = js.native
  /**
    * Height of the ProgressIndicator
    * @defaultvalue 2
    */
  var barHeight: js.UndefOr[Double] = js.native
  /**
    * Additional css class to apply to the ProgressIndicator
    * @defaultvalue undefined
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Text describing or supplementing the operation. May be a string or React virtual elements.
    */
  var description: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Label to display above the control. May be a string or React virtual elements.
    */
  var label: js.UndefOr[TagMod[Any]] = js.native
  /**
    * A render override for the progress track.
    */
  var onRenderProgress: js.UndefOr[IRenderFunction[IProgressIndicatorProps]] = js.native
  /**
    * Percentage of the operation's completeness, numerically between 0 and 1. If this is not set,
    * the indeterminate progress animation will be shown instead.
    */
  var percentComplete: js.UndefOr[Double] = js.native
  /**
    * Whether or not to hide the progress state.
    */
  var progressHidden: js.UndefOr[Boolean] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IProgressIndicatorStyleProps, IProgressIndicatorStyles]] = js.native
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Deprecated at v0.43.0, to be removed at \>= v0.53.0. Use `label` instead.
    * @deprecated Use `label` instead.
    */
  var title: js.UndefOr[String] = js.native
}

object IProgressIndicatorProps {
  @scala.inline
  def apply(): IProgressIndicatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProgressIndicatorProps]
  }
  @scala.inline
  implicit class IProgressIndicatorPropsOps[Self <: IProgressIndicatorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaValueText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaValueText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaValueText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaValueText")(js.undefined)
        ret
    }
    @scala.inline
    def withBarHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barHeight")(js.undefined)
        ret
    }
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
    def withDescriptionReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderProgress(
      value: (/* props */ js.UndefOr[IProgressIndicatorProps], /* defaultRender */ js.UndefOr[
          js.Function1[/* props */ js.UndefOr[IProgressIndicatorProps], ReactElement | Null]
        ]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderProgress")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentComplete(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IProgressIndicatorStyleProps => Partial[IProgressIndicatorStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IProgressIndicatorStyleProps, IProgressIndicatorStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
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

