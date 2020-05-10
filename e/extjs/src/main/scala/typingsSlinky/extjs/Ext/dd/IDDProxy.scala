package typingsSlinky.extjs.Ext.dd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDDProxy extends IDD {
  /** [Property] (Boolean) */
  var centerFrame: js.UndefOr[Boolean] = js.native
  /** [Method] Creates the proxy element if it does not yet exist */
  var createFrame: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (String) */
  var dragElId: js.UndefOr[String] = js.native
  /** [Method] overrides Ext dd DragDrop By default we try to move the element to the last location of the frame
  		* @param e Object
  		*/
  @JSName("endDrag")
  var endDrag_IDDProxy: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Initialization for the drag frame element  */
  var initFrame: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Boolean) */
  var resizeFrame: js.UndefOr[Boolean] = js.native
  /** [Method] toString method
  		* @returns String string representation of the dd obj
  		*/
  @JSName("toString")
  var toString_FIDDProxy: js.UndefOr[js.Function0[String]] = js.native
}

object IDDProxy {
  @scala.inline
  def apply(): IDDProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDDProxy]
  }
  @scala.inline
  implicit class IDDProxyOps[Self <: IDDProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenterFrame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateFrame(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFrame")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCreateFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withDragElId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragElId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragElId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragElId")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDrag(value: /* e */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEndDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withInitFrame(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initFrame")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInitFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeFrame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withToString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.undefined)
        ret
    }
  }
  
}

