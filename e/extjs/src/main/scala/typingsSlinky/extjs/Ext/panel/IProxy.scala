package typingsSlinky.extjs.Ext.panel

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.extjs.Ext.IBase
import typingsSlinky.extjs.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProxy extends IBase {
  /** [Method] Gets the proxy s element
  		* @returns Ext.Element The proxy's element
  		*/
  var getEl: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Gets the proxy s ghost Panel
  		* @returns Ext.panel.Panel The proxy's ghost Panel
  		*/
  var getGhost: js.UndefOr[js.Function0[IPanel]] = js.native
  /** [Method] Gets the proxy element
  		* @returns Ext.Element The proxy's element
  		*/
  var getProxy: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Hides the proxy */
  var hide: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var insertProxy: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var moveOnDrag: js.UndefOr[Boolean] = js.native
  /** [Method] Moves the proxy to a different position in the DOM
  		* @param parentNode HTMLElement The proxy's parent DOM node
  		* @param before HTMLElement The sibling node before which the proxy should be inserted. Defaults to the parent's last child if not specified.
  		*/
  var moveProxy: js.UndefOr[
    js.Function2[/* parentNode */ js.UndefOr[HTMLElement], /* before */ js.UndefOr[HTMLElement], Unit]
  ] = js.native
  /** [Property] (Ext.panel.Panel) */
  var panel: js.UndefOr[IPanel] = js.native
  /** [Method] Shows the proxy */
  var show: js.UndefOr[js.Function0[Unit]] = js.native
}

object IProxy {
  @scala.inline
  def apply(): IProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProxy]
  }
  @scala.inline
  implicit class IProxyOps[Self <: IProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetEl(value: () => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEl")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGhost(value: () => IPanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGhost")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetGhost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGhost")(js.undefined)
        ret
    }
    @scala.inline
    def withGetProxy(value: () => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProxy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertProxy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveOnDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveOnDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveOnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveOnDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveProxy(value: (/* parentNode */ js.UndefOr[HTMLElement], /* before */ js.UndefOr[HTMLElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveProxy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMoveProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withPanel(value: IPanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
  }
  
}

