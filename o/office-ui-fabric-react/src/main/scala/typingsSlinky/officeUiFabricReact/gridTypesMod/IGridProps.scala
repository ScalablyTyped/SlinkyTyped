package typingsSlinky.officeUiFabricReact.gridTypesMod

import org.scalajs.dom.raw.HTMLTableElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.TableHTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridProps extends TableHTMLAttributes[HTMLTableElement] {
  /**
    * Position this grid is in the parent set (index in a parent menu, for example)
    */
  var ariaPosInSet: js.UndefOr[Double] = js.native
  /**
    * Size of the parent set (size of parent menu, for example)
    */
  var ariaSetSize: js.UndefOr[Double] = js.native
  /**
    * The number of columns
    */
  var columnCount: Double = js.native
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IGrid]] = js.native
  /**
    * Class name for the FocusZone container for the grid.
    * @deprecated Use `styles.focusedContainer` to define styling for the focus zone container
    */
  var containerClassName: js.UndefOr[String] = js.native
  /**
    * If false (the default), the grid is contained inside a FocusZone.
    * If true, a FocusZone is not used.
    * @default false
    */
  var doNotContainWithinFocusZone: js.UndefOr[Boolean] = js.native
  /**
    * Items to display in a grid with the specified number of columns
    */
  var items: js.Array[_] = js.native
  /**
    * Handler for when focus leaves the grid.
    */
  @JSName("onBlur")
  var onBlur_IGridProps: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * @deprecated Use `ariaPosInSet`
    */
  var positionInSet: js.UndefOr[Double] = js.native
  /**
    * @deprecated Use `ariaSetSize`
    */
  var setSize: js.UndefOr[Double] = js.native
  /**
    * Whether focus should cycle back to the beginning once the user navigates past the end (and vice versa).
    * Only relevant if `doNotContainWithinFocusZone` is not true.
    */
  var shouldFocusCircularNavigate: js.UndefOr[Boolean] = js.native
  /**
    * Optional styles for the component.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IGridStyleProps, IGridStyles]] = js.native
  /**
    * Theme to apply to the component.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Custom renderer for the individual items
    */
  def onRenderItem(item: js.Any, index: Double): ReactElement = js.native
}

object IGridProps {
  @scala.inline
  def apply(columnCount: Double, items: js.Array[_], onRenderItem: (js.Any, Double) => ReactElement): IGridProps = {
    val __obj = js.Dynamic.literal(columnCount = columnCount.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], onRenderItem = js.Any.fromFunction2(onRenderItem))
    __obj.asInstanceOf[IGridProps]
  }
  @scala.inline
  implicit class IGridPropsOps[Self <: IGridProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRenderItem(value: (js.Any, Double) => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAriaPosInSet(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaPosInSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaPosInSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaPosInSet")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaSetSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaSetSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaSetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaSetSize")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IGrid | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IGrid]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IGrid]): Self = {
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
    def withContainerClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withDoNotContainWithinFocusZone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotContainWithinFocusZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoNotContainWithinFocusZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotContainWithinFocusZone")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionInSet(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionInSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionInSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionInSet")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldFocusCircularNavigate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFocusCircularNavigate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldFocusCircularNavigate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFocusCircularNavigate")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IGridStyleProps => Partial[IGridStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IGridStyleProps, IGridStyles]): Self = {
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

