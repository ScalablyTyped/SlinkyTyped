package typingsSlinky.extjs.Ext.resizer

import typingsSlinky.extjs.Ext.IElement
import typingsSlinky.extjs.Ext.dd.IDragTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResizeTracker extends IDragTracker {
  /** [Method] Create a proxy for this resizer
  		* @param target Ext.Component/Ext.Element The target
  		* @returns Ext.Element A proxy element
  		*/
  var createProxy: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], IElement]] = js.native
  /** [Method] Template method which should be overridden by each DragTracker instance
  		* @param e Object
  		*/
  @JSName("onBeforeStart")
  var onBeforeStart_IResizeTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Template method which should be overridden by each DragTracker instance
  		* @param e Object
  		*/
  @JSName("onDrag")
  var onDrag_IResizeTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Template method which should be overridden by each DragTracker instance
  		* @param e Object
  		*/
  @JSName("onEnd")
  var onEnd_IResizeTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Template method which should be overridden by each DragTracker instance
  		* @param e Object
  		*/
  @JSName("onStart")
  var onStart_IResizeTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
}

object IResizeTracker {
  @scala.inline
  def apply(): IResizeTracker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResizeTracker]
  }
  @scala.inline
  implicit class IResizeTrackerOps[Self <: IResizeTracker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateProxy(value: /* target */ js.UndefOr[js.Any] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createProxy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeStart(value: /* e */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrag(value: /* e */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnd(value: /* e */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStart(value: /* e */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.undefined)
        ret
    }
  }
  
}

