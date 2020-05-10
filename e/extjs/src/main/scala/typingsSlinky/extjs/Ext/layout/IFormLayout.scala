package typingsSlinky.extjs.Ext.layout

import typingsSlinky.extjs.Ext.layout.container.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFormLayout extends IContainer {
  /** [Method] Handles overflow processing for a container
  		* @param ownerContext Ext.layout.ContextItem
  		* @param containerSize Object
  		* @param dimensions Number A bit mask for the overflow managed dimensions. The 0-bit is for width and the 1-bit is for height. In other words, a value of 1 would be only width, 2 would be only height and 3 would be both.
  		*/
  var calculateOverflow: js.UndefOr[
    js.Function3[
      /* ownerContext */ js.UndefOr[IContextItem], 
      /* containerSize */ js.UndefOr[js.Any], 
      /* dimensions */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Called to perform the calculations for this layout
  		* @param ownerContext Object
  		*/
  @JSName("calculate")
  var calculate_IFormLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] This method if implemented is called at the end of the cycle in which this layout completes by not setting done to
  		* @param ownerContext Object
  		*/
  @JSName("completeLayout")
  var completeLayout_IFormLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Creates an element that makes bottom right body padding consistent across browsers
  		* @param out Object
  		* @param renderData Object
  		*/
  var doRenderPadder: js.UndefOr[
    js.Function2[/* out */ js.UndefOr[js.Any], /* renderData */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Returns the container size that of the target
  		* @param ownerContext Ext.layout.ContextItem The owner's context item.
  		* @param inDom Boolean True if the container size must be in the DOM.
  		* @param ignoreOverflow Boolean if true scrollbar size will not be subtracted from container size.
  		* @returns Object The size
  		*/
  @JSName("getContainerSize")
  var getContainerSize_IFormLayout: js.UndefOr[
    js.Function3[
      /* ownerContext */ js.UndefOr[IContextItem], 
      /* inDom */ js.UndefOr[Boolean], 
      /* ignoreOverflow */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  /** [Method] Returns an object describing how this layout manages the size of the given component
  		* @param item Object
  		* @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
  		*/
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IFormLayout: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], ISizePolicy]] = js.native
  /** [Method] returns the overflow x style of the render target
  		* @param ownerContext Ext.layout.ContextItem
  		* @returns String
  		*/
  var getOverflowXStyle: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], String]] = js.native
  /** [Method] returns the overflow y style of the render target
  		* @param ownerContext Ext.layout.ContextItem
  		* @returns String
  		*/
  var getOverflowYStyle: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], String]] = js.native
  /** [Property] (Object) */
  var getScrollRangeFlags: js.UndefOr[js.Any] = js.native
}

object IFormLayout {
  @scala.inline
  def apply(): IFormLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFormLayout]
  }
  @scala.inline
  implicit class IFormLayoutOps[Self <: IFormLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculate(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCalculate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculate")(js.undefined)
        ret
    }
    @scala.inline
    def withCalculateOverflow(
      value: (/* ownerContext */ js.UndefOr[IContextItem], /* containerSize */ js.UndefOr[js.Any], /* dimensions */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateOverflow")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCalculateOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withCompleteLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCompleteLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withDoRenderPadder(value: (/* out */ js.UndefOr[js.Any], /* renderData */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doRenderPadder")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDoRenderPadder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doRenderPadder")(js.undefined)
        ret
    }
    @scala.inline
    def withGetContainerSize(
      value: (/* ownerContext */ js.UndefOr[IContextItem], /* inDom */ js.UndefOr[Boolean], /* ignoreOverflow */ js.UndefOr[Boolean]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainerSize")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetContainerSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainerSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemSizePolicy(value: /* item */ js.UndefOr[js.Any] => ISizePolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemSizePolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetItemSizePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemSizePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOverflowXStyle(value: /* ownerContext */ js.UndefOr[IContextItem] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOverflowXStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetOverflowXStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOverflowXStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOverflowYStyle(value: /* ownerContext */ js.UndefOr[IContextItem] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOverflowYStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetOverflowYStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOverflowYStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withGetScrollRangeFlags(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollRangeFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetScrollRangeFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollRangeFlags")(js.undefined)
        ret
    }
  }
  
}

