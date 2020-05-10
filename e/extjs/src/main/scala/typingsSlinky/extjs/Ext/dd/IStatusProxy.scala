package typingsSlinky.extjs.Ext.dd

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IComponent
import typingsSlinky.extjs.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStatusProxy extends IComponent {
  /** [Config Option] (String) */
  var dropAllowed: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var dropNotAllowed: js.UndefOr[String] = js.native
  /** [Method] Returns the ghost element
  		* @returns Ext.Element el
  		*/
  var getGhost: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Causes the proxy to return to its position of origin via an animation
  		* @param xy Number[] The XY position of the element ([x, y])
  		* @param callback Function The function to call after the repair is complete.
  		* @param scope Object The scope (this reference) in which the callback function is executed. Defaults to the browser window.
  		*/
  var repair: js.UndefOr[
    js.Function3[
      /* xy */ js.UndefOr[Array], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Resets the status indicator to the default dropNotAllowed value
  		* @param clearGhost Boolean True to also remove all content from the ghost, false to preserve it
  		*/
  var reset: js.UndefOr[js.Function1[/* clearGhost */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Updates the proxy s visual element to indicate the status of whether or not drop is allowed over the current target e
  		* @param cssClass String The css class for the new drop status indicator image
  		*/
  var setStatus: js.UndefOr[js.Function1[/* cssClass */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Stops the repair animation if it s currently running */
  var stop: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Force the Layer to sync its shadow and shim positions to the element */
  var sync: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Updates the contents of the ghost element
  		* @param html String/HTMLElement The html that will replace the current innerHTML of the ghost element, or a DOM node to append as the child of the ghost element (in which case the innerHTML will be cleared first).
  		*/
  @JSName("update")
  var update_IStatusProxy: js.UndefOr[js.Function1[/* html */ js.UndefOr[js.Any], Unit]] = js.native
}

object IStatusProxy {
  @scala.inline
  def apply(): IStatusProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStatusProxy]
  }
  @scala.inline
  implicit class IStatusProxyOps[Self <: IStatusProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDropAllowed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withDropNotAllowed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropNotAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropNotAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropNotAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGhost(value: () => IElement): Self = {
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
    def withRepair(
      value: (/* xy */ js.UndefOr[Array], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repair")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRepair: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repair")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: /* clearGhost */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStatus(value: /* cssClass */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStatus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.undefined)
        ret
    }
    @scala.inline
    def withSync(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: /* html */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

