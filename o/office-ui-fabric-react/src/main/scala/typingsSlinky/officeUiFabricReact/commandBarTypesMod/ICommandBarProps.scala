package typingsSlinky.officeUiFabricReact.commandBarTypesMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.commandBarBaseMod.ICommandBarData
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.icomponentasMod.IComponentAs
import typingsSlinky.uifabricUtilities.icomponentasMod.IComponentAsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommandBarProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Accessibility text to be read by the screen reader when the user's
    * focus enters the command bar. The screen reader will read this text
    * after reading information about the first focusable item in the command bar.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * Custom component for the near and far item buttons. Not used for overflow menu items.
    */
  var buttonAs: js.UndefOr[IComponentAs[IButtonProps]] = js.native
  /**
    * Optional callback to access the ICommandBar interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ICommandBar]] = js.native
  /**
    * Function to be called every time data is rendered. It provides the data that was actually rendered.
    * A use case would be adding telemetry when a particular control is shown in an overflow or dropped
    * as a result of `onReduceData`, or to count the number of renders that an implementation of
    * `onReduceData` triggers.
    */
  var dataDidRender: js.UndefOr[js.Function1[/* renderedData */ js.Any, Unit]] = js.native
  /**
    * Items to render on the right side (or left, in RTL). ICommandBarItemProps extends IContextualMenuItem.
    */
  var farItems: js.UndefOr[js.Array[ICommandBarItemProps]] = js.native
  /**
    * Items to render. ICommandBarItemProps extends IContextualMenuItem.
    */
  var items: js.Array[ICommandBarItemProps] = js.native
  /**
    * Callback invoked when data has been grown.
    */
  var onDataGrown: js.UndefOr[js.Function1[/* movedItem */ ICommandBarItemProps, Unit]] = js.native
  /**
    * Callback invoked when data has been reduced.
    */
  var onDataReduced: js.UndefOr[js.Function1[/* movedItem */ ICommandBarItemProps, Unit]] = js.native
  /**
    * Custom function to grow data if items are too small for the given space.
    * Return `undefined` if no more steps can be taken to avoid infinate loop.
    */
  var onGrowData: js.UndefOr[js.Function1[/* data */ ICommandBarData, js.UndefOr[ICommandBarData]]] = js.native
  /**
    * Custom function to reduce data if items do not fit in given space.
    * Return `undefined` if no more steps can be taken to avoid infinate loop.
    */
  var onReduceData: js.UndefOr[js.Function1[/* data */ ICommandBarData, js.UndefOr[ICommandBarData]]] = js.native
  /**
    * Custom component for the overflow button.
    */
  var overflowButtonAs: js.UndefOr[IComponentAs[IButtonProps]] = js.native
  /**
    * Props to be passed to overflow button.
    * If `menuProps` are passed through this prop, any items provided will be prepended to any
    * computed overflow items.
    */
  var overflowButtonProps: js.UndefOr[IButtonProps] = js.native
  /**
    * Default items to have in the overflow menu. ICommandBarItemProps extends IContextualMenuItem.
    */
  var overflowItems: js.UndefOr[js.Array[ICommandBarItemProps]] = js.native
  /**
    * When true, items will be 'shifted' off the front of the array when reduced, and unshifted during grow.
    */
  var shiftOnReduce: js.UndefOr[Boolean] = js.native
  /**
    * Customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ICommandBarStyleProps, ICommandBarStyles]] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object ICommandBarProps {
  @scala.inline
  def apply(items: js.Array[ICommandBarItemProps]): ICommandBarProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommandBarProps]
  }
  @scala.inline
  implicit class ICommandBarPropsOps[Self <: ICommandBarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[ICommandBarItemProps]): Self = {
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
    def withButtonAsFunctionComponent(value: ReactComponentClass[IComponentAsProps[IButtonProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonAsComponentClass(value: ReactComponentClass[IComponentAsProps[IButtonProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonAs(value: IComponentAs[IButtonProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonAs")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ ICommandBar | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[ICommandBar]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[ICommandBar]): Self = {
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
    def withDataDidRender(value: /* renderedData */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDidRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataDidRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDidRender")(js.undefined)
        ret
    }
    @scala.inline
    def withFarItems(value: js.Array[ICommandBarItemProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("farItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFarItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("farItems")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDataGrown(value: /* movedItem */ ICommandBarItemProps => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDataGrown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDataGrown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDataGrown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDataReduced(value: /* movedItem */ ICommandBarItemProps => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDataReduced")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDataReduced: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDataReduced")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGrowData(value: /* data */ ICommandBarData => js.UndefOr[ICommandBarData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGrowData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGrowData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGrowData")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReduceData(value: /* data */ ICommandBarData => js.UndefOr[ICommandBarData]): Self = {
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
    def withOverflowButtonAsFunctionComponent(value: ReactComponentClass[IComponentAsProps[IButtonProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowButtonAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverflowButtonAsComponentClass(value: ReactComponentClass[IComponentAsProps[IButtonProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowButtonAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverflowButtonAs(value: IComponentAs[IButtonProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowButtonAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowButtonAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowButtonAs")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowButtonProps(value: IButtonProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowButtonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowButtonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowItems(value: js.Array[ICommandBarItemProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowItems")(js.undefined)
        ret
    }
    @scala.inline
    def withShiftOnReduce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftOnReduce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShiftOnReduce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftOnReduce")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: ICommandBarStyleProps => Partial[ICommandBarStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[ICommandBarStyleProps, ICommandBarStyles]): Self = {
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

