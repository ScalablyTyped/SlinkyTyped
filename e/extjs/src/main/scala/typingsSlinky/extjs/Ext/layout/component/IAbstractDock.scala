package typingsSlinky.extjs.Ext.layout.component

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.layout.ISizePolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstractDock extends IComponent {
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
  		* @param ownerContext Object
  		*/
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IAbstractDock: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Called before any calculation cycles to prepare for layout
  		* @param ownerContext Object
  		*/
  @JSName("beginLayout")
  var beginLayout_IAbstractDock: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Called to perform the calculations for this layout
  		* @param ownerContext Object
  		*/
  @JSName("calculate")
  var calculate_IAbstractDock: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Retrieve an ordered and or filtered array of all docked Components
  		* @param order String The desired ordering of the items ('render' or 'visual').
  		* @param beforeBody Boolean An optional flag to limit the set of items to only those before the body (true) or after the body (false). All components are returned by default.
  		* @returns Ext.Component[] An array of components.
  		*/
  var getDockedItems: js.UndefOr[
    js.Function2[/* order */ js.UndefOr[String], /* beforeBody */ js.UndefOr[Boolean], Array]
  ] = js.native
  /** [Method] Returns an object describing how this layout manages the size of the given component
  		* @param item Object
  		* @param ownerSizeModel Object
  		* @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
  		*/
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IAbstractDock: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* ownerSizeModel */ js.UndefOr[js.Any], ISizePolicy]
  ] = js.native
  /** [Method] Returns an array containing all the visible docked items inside this layout s owner Panel
  		* @returns Array An array containing all the visible docked items of the Panel
  		*/
  @JSName("getLayoutItems")
  var getLayoutItems_IAbstractDock: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] The default weighting of docked items produces this arrangement
  		* @param ownerContext Object
  		* @param horz Object
  		* @param vert Object
  		*/
  var invalidateAxes: js.UndefOr[
    js.Function3[
      /* ownerContext */ js.UndefOr[js.Any], 
      /* horz */ js.UndefOr[js.Any], 
      /* vert */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}

object IAbstractDock {
  @scala.inline
  def apply(): IAbstractDock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractDock]
  }
  @scala.inline
  implicit class IAbstractDockOps[Self <: IAbstractDock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeginLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginLayout")(js.undefined)
        ret
    }
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
    def withGetDockedItems(value: (/* order */ js.UndefOr[String], /* beforeBody */ js.UndefOr[Boolean]) => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDockedItems")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetDockedItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDockedItems")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemSizePolicy(value: (/* item */ js.UndefOr[js.Any], /* ownerSizeModel */ js.UndefOr[js.Any]) => ISizePolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemSizePolicy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetItemSizePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemSizePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLayoutItems(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayoutItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLayoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayoutItems")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidateAxes(
      value: (/* ownerContext */ js.UndefOr[js.Any], /* horz */ js.UndefOr[js.Any], /* vert */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidateAxes")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInvalidateAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidateAxes")(js.undefined)
        ret
    }
  }
  
}

