package typingsSlinky.extjs.Ext.layout.container

import typingsSlinky.extjs.Ext.layout.IContextItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAuto extends IContainer {
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
  		* @param ownerContext Object
  		*/
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IAuto: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Handles overflow processing for a container
  		* @param ownerContext Ext.layout.ContextItem
  		*/
  var calculateOverflow: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.native
  /** [Method] Called to perform the calculations for this layout
  		* @param ownerContext Object
  		*/
  @JSName("calculate")
  var calculate_IAuto: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] This method if implemented is called at the end of the cycle in which this layout completes by not setting done to
  		* @param ownerContext Object
  		*/
  @JSName("completeLayout")
  var completeLayout_IAuto: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] This method is called after all layouts are complete and their calculations flushed to the DOM
  		* @param ownerContext Object
  		*/
  @JSName("finishedLayout")
  var finishedLayout_IAuto: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns the overflow x style of the render target
  		* @param ownerContext Ext.layout.ContextItem
  		* @returns String
  		*/
  var getOverflowXStyle: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], String]] = js.native
  /** [Method] Returns the overflow y style of the render target
  		* @param ownerContext Ext.layout.ContextItem
  		* @returns String
  		*/
  var getOverflowYStyle: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], String]] = js.native
  /** [Property] (Boolean) */
  var manageOverflow: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var managePadding: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var reserveScrollbar: js.UndefOr[Boolean] = js.native
  /** [Method] This method sets the height and or width of the outerCt innerCt to adjust for the following browser specific issues
  		* @param ownerContext Ext.layout.ContextItem
  		* @param containerSize Object
  		*/
  var setCtSizeIfNeeded: js.UndefOr[
    js.Function2[
      /* ownerContext */ js.UndefOr[IContextItem], 
      /* containerSize */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}

object IAuto {
  @scala.inline
  def apply(): IAuto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAuto]
  }
  @scala.inline
  implicit class IAutoOps[Self <: IAuto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginLayoutCycle(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginLayoutCycle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeginLayoutCycle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginLayoutCycle")(js.undefined)
        ret
    }
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
    def withCalculateOverflow(value: /* ownerContext */ js.UndefOr[IContextItem] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateOverflow")(js.Any.fromFunction1(value))
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
    def withFinishedLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishedLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFinishedLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishedLayout")(js.undefined)
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
    def withManageOverflow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manageOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManageOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manageOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withManagePadding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagePadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managePadding")(js.undefined)
        ret
    }
    @scala.inline
    def withReserveScrollbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reserveScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReserveScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reserveScrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCtSizeIfNeeded(
      value: (/* ownerContext */ js.UndefOr[IContextItem], /* containerSize */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCtSizeIfNeeded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetCtSizeIfNeeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCtSizeIfNeeded")(js.undefined)
        ret
    }
  }
  
}

