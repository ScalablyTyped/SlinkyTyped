package typingsSlinky.extjs.Ext.layout

import typingsSlinky.extjs.Ext.layout.container.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBoxLayout extends IContainer {
  /** [Method] This method is called to re cache our understanding of flexes
  		* @param ownerContext Object
  		*/
  var cacheFlexes: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Called to perform the calculations for this layout
  		* @param ownerContext Object
  		*/
  @JSName("calculate")
  var calculate_IBoxLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] This method if implemented is called at the end of the cycle in which this layout completes by not setting done to
  		* @param ownerContext Object
  		*/
  @JSName("completeLayout")
  var completeLayout_IBoxLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Object) */
  var defaultMargins: js.UndefOr[js.Any] = js.native
  /** [Method] This method is called after all layouts are complete and their calculations flushed to the DOM
  		* @param ownerContext Object
  		*/
  @JSName("finishedLayout")
  var finishedLayout_IBoxLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Number) */
  var flex: js.UndefOr[Double] = js.native
  /** [Method] Returns an object describing how this layout manages the size of the given component
  		* @param item Object
  		* @param ownerSizeModel Object
  		* @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
  		*/
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IBoxLayout: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* ownerSizeModel */ js.UndefOr[js.Any], ISizePolicy]
  ] = js.native
  /** [Config Option] (String) */
  var pack: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var padding: js.UndefOr[String] = js.native
  /** [Config Option] (String/Ext.Component) */
  var stretchMaxPartner: js.UndefOr[js.Any] = js.native
}

object IBoxLayout {
  @scala.inline
  def apply(): IBoxLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBoxLayout]
  }
  @scala.inline
  implicit class IBoxLayoutOps[Self <: IBoxLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheFlexes(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheFlexes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCacheFlexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheFlexes")(js.undefined)
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
    def withFlex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex")(js.undefined)
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
    def withPack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pack")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withStretchMaxPartner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchMaxPartner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStretchMaxPartner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchMaxPartner")(js.undefined)
        ret
    }
  }
  
}

