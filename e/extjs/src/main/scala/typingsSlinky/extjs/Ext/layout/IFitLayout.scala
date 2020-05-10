package typingsSlinky.extjs.Ext.layout

import typingsSlinky.extjs.Ext.layout.container.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFitLayout extends IContainer {
  /** [Method] Called to perform the calculations for this layout
  		* @param ownerContext Object
  		*/
  @JSName("calculate")
  var calculate_IFitLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Object) */
  var defaultMargins: js.UndefOr[js.Any] = js.native
  /** [Method] Returns an object describing how this layout manages the size of the given component
  		* @param item Object
  		* @param ownerSizeModel Object
  		* @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
  		*/
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IFitLayout: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* ownerSizeModel */ js.UndefOr[js.Any], ISizePolicy]
  ] = js.native
}

object IFitLayout {
  @scala.inline
  def apply(): IFitLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFitLayout]
  }
  @scala.inline
  implicit class IFitLayoutOps[Self <: IFitLayout] (val x: Self) extends AnyVal {
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
    def withDefaultMargins(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMargins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultMargins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMargins")(js.undefined)
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
  }
  
}

