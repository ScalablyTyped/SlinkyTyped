package typingsSlinky.officeUiFabricReact.breadcrumbTypesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.tooltipHostTypesMod.ITooltipHostProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.icomponentasMod.IComponentAs
import typingsSlinky.uifabricUtilities.icomponentasMod.IComponentAsProps
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBreadcrumbProps extends HTMLAttributes[HTMLElement] {
  /**
    * Aria label for the root element of the breadcrumb (which is a navigation landmark).
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * Optional callback to access the IBreadcrumb interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IBreadcrumb]] = js.native
  /**
    * Render a custom divider in place of the default chevron `>`
    */
  var dividerAs: js.UndefOr[IComponentAs[IDividerAsProps]] = js.native
  /**
    * Extra props for the root FocusZone.
    */
  var focusZoneProps: js.UndefOr[IFocusZoneProps] = js.native
  /**
    * Collection of breadcrumbs to render
    */
  var items: js.Array[IBreadcrumbItem] = js.native
  /**
    * The maximum number of breadcrumbs to display before coalescing.
    * If not specified, all breadcrumbs will be rendered.
    */
  var maxDisplayedItems: js.UndefOr[Double] = js.native
  /**
    * Method that determines how to reduce the length of the breadcrumb.
    * Return undefined to never reduce breadcrumb length.
    */
  var onReduceData: js.UndefOr[js.Function1[/* data */ IBreadcrumbData, js.UndefOr[IBreadcrumbData]]] = js.native
  /** Custom render function for each breadcrumb item. */
  var onRenderItem: js.UndefOr[IRenderFunction[IBreadcrumbItem]] = js.native
  /**
    * Render a custom overflow icon in place of the default icon `...`
    */
  var onRenderOverflowIcon: js.UndefOr[IRenderFunction[IButtonProps]] = js.native
  /**
    * Aria label for the overflow button.
    */
  var overflowAriaLabel: js.UndefOr[String] = js.native
  /**
    * Optional index where overflow items will be collapsed. Defaults to 0.
    */
  var overflowIndex: js.UndefOr[Double] = js.native
  var styles: js.UndefOr[IStyleFunctionOrObject[IBreadcrumbStyleProps, IBreadcrumbStyles]] = js.native
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Extra props for the TooltipHost which wraps each breadcrumb item.
    */
  var tooltipHostProps: js.UndefOr[ITooltipHostProps] = js.native
}

object IBreadcrumbProps {
  @scala.inline
  def apply(items: js.Array[IBreadcrumbItem]): IBreadcrumbProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBreadcrumbProps]
  }
  @scala.inline
  implicit class IBreadcrumbPropsOps[Self <: IBreadcrumbProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[IBreadcrumbItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withComponentRefFunction1(value: /* ref */ IBreadcrumb | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IBreadcrumb]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IBreadcrumb]): Self = {
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
    def withDividerAsFunctionComponent(value: ReactComponentClass[IComponentAsProps[IDividerAsProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dividerAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDividerAsComponentClass(value: ReactComponentClass[IComponentAsProps[IDividerAsProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dividerAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDividerAs(value: IComponentAs[IDividerAsProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dividerAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDividerAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dividerAs")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusZoneProps(value: IFocusZoneProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusZoneProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusZoneProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusZoneProps")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDisplayedItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDisplayedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDisplayedItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDisplayedItems")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReduceData(value: /* data */ IBreadcrumbData => js.UndefOr[IBreadcrumbData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReduceData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReduceData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReduceData")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderItem(
      value: (/* props */ js.UndefOr[IBreadcrumbItem], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IBreadcrumbItem], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderItem")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderOverflowIcon(
      value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderOverflowIcon")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderOverflowIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderOverflowIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IBreadcrumbStyleProps => Partial[IBreadcrumbStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IBreadcrumbStyleProps, IBreadcrumbStyles]): Self = {
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
    def withTooltipHostProps(value: ITooltipHostProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipHostProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipHostProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipHostProps")(js.undefined)
        ret
    }
  }
  
}

