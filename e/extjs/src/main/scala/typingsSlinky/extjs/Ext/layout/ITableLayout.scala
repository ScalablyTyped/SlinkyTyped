package typingsSlinky.extjs.Ext.layout

import typingsSlinky.extjs.Ext.layout.container.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITableLayout extends IContainer {
  /** [Method] Called to perform the calculations for this layout
  		* @param ownerContext Object
  		*/
  @JSName("calculate")
  var calculate_ITableLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Number) */
  var columns: js.UndefOr[Double] = js.native
  /** [Method] This method if implemented is called after all layouts have completed  */
  @JSName("finalizeLayout")
  var finalizeLayout_ITableLayout: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Validates item is in the proper place in the dom
  		* @param item Object
  		* @param target Object
  		* @param rowIdx Object
  		* @param cellIdx Object
  		*/
  @JSName("isValidParent")
  var isValidParent_ITableLayout: js.UndefOr[
    js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* target */ js.UndefOr[js.Any], 
      /* rowIdx */ js.UndefOr[js.Any], 
      /* cellIdx */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (Object) */
  var tableAttrs: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var tdAttrs: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var trAttrs: js.UndefOr[js.Any] = js.native
}

object ITableLayout {
  @scala.inline
  def apply(): ITableLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITableLayout]
  }
  @scala.inline
  implicit class ITableLayoutOps[Self <: ITableLayout] (val x: Self) extends AnyVal {
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
    def withColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalizeLayout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalizeLayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFinalizeLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalizeLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withIsValidParent(
      value: (/* item */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], /* rowIdx */ js.UndefOr[js.Any], /* cellIdx */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidParent")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutIsValidParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidParent")(js.undefined)
        ret
    }
    @scala.inline
    def withTableAttrs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableAttrs")(js.undefined)
        ret
    }
    @scala.inline
    def withTdAttrs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tdAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTdAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tdAttrs")(js.undefined)
        ret
    }
    @scala.inline
    def withTrAttrs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trAttrs")(js.undefined)
        ret
    }
  }
  
}

