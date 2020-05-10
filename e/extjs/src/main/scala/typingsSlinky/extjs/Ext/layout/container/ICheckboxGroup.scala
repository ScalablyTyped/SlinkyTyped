package typingsSlinky.extjs.Ext.layout.container

import typingsSlinky.extjs.Ext.layout.ISizePolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckboxGroup extends IContainer {
  /** [Config Option] (Boolean) */
  var autoFlex: js.UndefOr[Boolean] = js.native
  /** [Method] Just wait for the child items to all lay themselves out in the width we are configured to make available to them
  		* @param ownerContext Object
  		*/
  @JSName("calculate")
  var calculate_ICheckboxGroup: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns an object describing how this layout manages the size of the given component
  		* @param item Object
  		* @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
  		*/
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_ICheckboxGroup: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], ISizePolicy]] = js.native
  /** [Method] Always valid  */
  @JSName("isValidParent")
  var isValidParent_ICheckboxGroup: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Iterates over all passed items ensuring they are rendered
  		* @param items Object
  		*/
  @JSName("renderItems")
  var renderItems_ICheckboxGroup: js.UndefOr[js.Function1[/* items */ js.UndefOr[js.Any], Unit]] = js.native
}

object ICheckboxGroup {
  @scala.inline
  def apply(): ICheckboxGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckboxGroup]
  }
  @scala.inline
  implicit class ICheckboxGroupOps[Self <: ICheckboxGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFlex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFlex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFlex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFlex")(js.undefined)
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
    def withIsValidParent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidParent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsValidParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidParent")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderItems(value: /* items */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItems")(js.undefined)
        ret
    }
  }
  
}

