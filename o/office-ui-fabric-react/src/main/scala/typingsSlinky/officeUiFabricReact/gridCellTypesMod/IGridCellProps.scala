package typingsSlinky.officeUiFabricReact.gridCellTypesMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.baseButtonClassNamesMod.IButtonClassNames
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridCellProps[T] extends js.Object {
  /**
    * Optional, the CSS class used for when the cell is disabled
    */
  var cellDisabledStyle: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional, the CSS class used for when the cell is selected
    */
  var cellIsSelectedStyle: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional, className(s) to apply
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Optional, if the this option should be diabled
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Method to provide the classnames to style a button.
    * The default value for this prop is the getClassnames func
    * defined in BaseButton.classnames.
    */
  var getClassNames: js.UndefOr[
    js.Function9[
      /* theme */ ITheme, 
      /* className */ String, 
      /* variantClassName */ String, 
      /* iconClassName */ js.UndefOr[String], 
      /* menuIconClassName */ js.UndefOr[String], 
      /* disabled */ Boolean, 
      /* checked */ Boolean, 
      /* expanded */ Boolean, 
      /* isSplit */ js.UndefOr[Boolean], 
      IButtonClassNames
    ]
  ] = js.native
  /**
    * Arbitrary unique string associated with this option
    */
  var id: String = js.native
  /**
    * Index for this option
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * The option that will be made available to the user
    */
  var item: T = js.native
  /**
    * The label for this item.
    * Visible text if this item is a header,
    * tooltip if is this item is normal
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The on click handler
    */
  var onClick: js.UndefOr[js.Function1[/* item */ T, Unit]] = js.native
  /**
    * Optional, the onFocus handler
    */
  var onFocus: js.UndefOr[js.Function1[/* item */ T, Unit]] = js.native
  /**
    * Optional, the onHover handler
    */
  var onHover: js.UndefOr[js.Function1[/* item */ js.UndefOr[T], Unit]] = js.native
  /**
    * Optional, onkeydown handler
    */
  var onKeyDown: js.UndefOr[js.Function1[/* ev */ SyntheticKeyboardEvent[HTMLButtonElement], Unit]] = js.native
  /**
    * Optional, mouseEnter handler.
    * @returns true if the event should be processed, false otherwise
    */
  var onMouseEnter: js.UndefOr[js.Function1[/* ev */ SyntheticMouseEvent[HTMLButtonElement], Boolean]] = js.native
  /**
    * Optional, mouseLeave handler
    */
  var onMouseLeave: js.UndefOr[js.Function1[/* ev */ SyntheticMouseEvent[HTMLButtonElement], Unit]] = js.native
  /**
    * Optional, mouseMove handler
    * @returns true if the event should be processed, false otherwise
    */
  var onMouseMove: js.UndefOr[js.Function1[/* ev */ SyntheticMouseEvent[HTMLButtonElement], Boolean]] = js.native
  /**
    * Optional, onWheel handler
    */
  var onWheel: js.UndefOr[js.Function1[/* ev */ SyntheticMouseEvent[HTMLButtonElement], Unit]] = js.native
  /**
    * The accessible role for this option
    */
  var role: js.UndefOr[String] = js.native
  /**
    * Optional, if the cell is currently selected
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * The render callback to handle rendering the item
    */
  def onRenderItem(item: T): ReactElement = js.native
}

object IGridCellProps {
  @scala.inline
  def apply[T](id: String, item: T, onRenderItem: T => ReactElement): IGridCellProps[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], onRenderItem = js.Any.fromFunction1(onRenderItem))
    __obj.asInstanceOf[IGridCellProps[T]]
  }
  @scala.inline
  implicit class IGridCellPropsOps[Self[t] <: IGridCellProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRenderItem(value: T => ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCellDisabledStyle(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDisabledStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellDisabledStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDisabledStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCellIsSelectedStyle(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellIsSelectedStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellIsSelectedStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellIsSelectedStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withGetClassNames(
      value: (/* theme */ ITheme, /* className */ String, /* variantClassName */ String, /* iconClassName */ js.UndefOr[String], /* menuIconClassName */ js.UndefOr[String], /* disabled */ Boolean, /* checked */ Boolean, /* expanded */ Boolean, /* isSplit */ js.UndefOr[Boolean]) => IButtonClassNames
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClassNames")(js.Any.fromFunction9(value))
        ret
    }
    @scala.inline
    def withoutGetClassNames: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClassNames")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* item */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: /* item */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHover(value: /* item */ js.UndefOr[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHover: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHover")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: /* ev */ SyntheticKeyboardEvent[HTMLButtonElement] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseEnter(value: /* ev */ SyntheticMouseEvent[HTMLButtonElement] => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseEnter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: /* ev */ SyntheticMouseEvent[HTMLButtonElement] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseLeave: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseMove(value: /* ev */ SyntheticMouseEvent[HTMLButtonElement] => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseMove: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWheel(value: /* ev */ SyntheticMouseEvent[HTMLButtonElement] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWheel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
  }
  
}

