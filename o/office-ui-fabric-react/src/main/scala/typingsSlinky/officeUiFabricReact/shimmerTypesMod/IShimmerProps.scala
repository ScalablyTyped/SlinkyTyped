package typingsSlinky.officeUiFabricReact.shimmerTypesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShimmerProps extends AllHTMLAttributes[HTMLElement] {
  /**
    * Localized string of the status label for screen reader
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * Optional callback to access the IShimmer interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IShimmer]] = js.native
  /**
    * Custom elements when necessary to build complex placeholder skeletons.
    */
  var customElementsGroup: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Controls when the shimmer is swapped with actual data through an animated transition.
    * @defaultvalue false
    */
  var isDataLoaded: js.UndefOr[Boolean] = js.native
  /**
    * Defines an object with possible colors to pass for Shimmer customization used on different backgrounds.
    */
  var shimmerColors: js.UndefOr[IShimmerColors] = js.native
  /**
    * Elements to render in one line of the Shimmer.
    */
  var shimmerElements: js.UndefOr[js.Array[IShimmerElement]] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IShimmerStyleProps, IShimmerStyles]] = js.native
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IShimmerProps {
  @scala.inline
  def apply(): IShimmerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShimmerProps]
  }
  @scala.inline
  implicit class IShimmerPropsOps[Self <: IShimmerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IShimmer | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IShimmer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IShimmer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomElementsGroupReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customElementsGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomElementsGroup(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customElementsGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomElementsGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customElementsGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDataLoaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDataLoaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDataLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDataLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withShimmerColors(value: IShimmerColors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimmerColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShimmerColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimmerColors")(js.undefined)
        ret
    }
    @scala.inline
    def withShimmerElements(value: js.Array[IShimmerElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimmerElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShimmerElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimmerElements")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IShimmerStyleProps => Partial[IShimmerStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IShimmerStyleProps, IShimmerStyles]): Self = {
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
  }
  
}

