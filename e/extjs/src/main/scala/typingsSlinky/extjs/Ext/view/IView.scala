package typingsSlinky.extjs.Ext.view

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.extjs.Ext.data.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IView extends IAbstractView {
  /** [Method] Un highlights the currently highlighted item if any  */
  var clearHighlight: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Focuses a node in the view
  		* @param rec Ext.data.Model The record associated to the node that is to be focused.
  		*/
  var focusNode: js.UndefOr[js.Function1[/* rec */ js.UndefOr[IModel], Unit]] = js.native
  /** [Method] Highlights a given item in the View
  		* @param item HTMLElement The item to highlight
  		*/
  var highlightItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[HTMLElement], Unit]] = js.native
  /** [Config Option] (Number) */
  var mouseOverOutBuffer: js.UndefOr[Double] = js.native
}

object IView {
  @scala.inline
  def apply(): IView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IView]
  }
  @scala.inline
  implicit class IViewOps[Self <: IView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearHighlight(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearHighlight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClearHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearHighlight")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusNode(value: /* rec */ js.UndefOr[IModel] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFocusNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusNode")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightItem(value: /* item */ js.UndefOr[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHighlightItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightItem")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseOverOutBuffer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOverOutBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseOverOutBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOverOutBuffer")(js.undefined)
        ret
    }
  }
  
}

