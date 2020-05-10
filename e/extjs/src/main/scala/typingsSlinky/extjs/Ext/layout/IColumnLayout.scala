package typingsSlinky.extjs.Ext.layout

import typingsSlinky.extjs.Ext.layout.container.IAuto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnLayout extends IAuto {
  /** [Method] Returns an object describing how this layout manages the size of the given component
  		* @param item Object
  		* @param ownerSizeModel Object
  		* @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
  		*/
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IColumnLayout: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* ownerSizeModel */ js.UndefOr[js.Any], ISizePolicy]
  ] = js.native
  /** [Method] This method sets the height and or width of the outerCt innerCt to adjust for the following browser specific issues
  		* @param ownerContext Object
  		* @param containerSize Object
  		*/
  @JSName("setCtSizeIfNeeded")
  var setCtSizeIfNeeded_IColumnLayout: js.UndefOr[
    js.Function2[/* ownerContext */ js.UndefOr[js.Any], /* containerSize */ js.UndefOr[js.Any], Unit]
  ] = js.native
}

object IColumnLayout {
  @scala.inline
  def apply(): IColumnLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnLayout]
  }
  @scala.inline
  implicit class IColumnLayoutOps[Self <: IColumnLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withSetCtSizeIfNeeded(value: (/* ownerContext */ js.UndefOr[js.Any], /* containerSize */ js.UndefOr[js.Any]) => Unit): Self = {
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

