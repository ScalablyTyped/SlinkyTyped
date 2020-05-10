package typingsSlinky.extjs.Ext.dd

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IElement
import typingsSlinky.extjs.Ext.IEventObject
import typingsSlinky.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDragTracker extends IObservable {
  /** [Property] (Boolean) */
  var active: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean/Number) */
  var autoStart: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Ext.util.Region/Ext.Element) */
  var constrainTo: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var delegate: js.UndefOr[String] = js.native
  /** [Property] (HTMLElement) */
  var dragTarget: js.UndefOr[HTMLElement] = js.native
  /** [Method] Returns the drag target
  		* @returns Ext.Element The element currently being tracked.
  		*/
  var getDragTarget: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Returns the X Y offset of the current mouse position from the mousedown point
  		* @param constrainMode String If omitted the true mouse position is returned. May be passed as point or dragTarget. See above.
  		* @returns Number[] The X, Y offset from the mousedown point, optionally constrained.
  		*/
  var getOffset: js.UndefOr[js.Function1[/* constrainMode */ js.UndefOr[String], Array]] = js.native
  /** [Method] Initializes the DragTracker on a given element
  		* @param el Ext.Element/HTMLElement The element
  		*/
  var initEl: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Template method which should be overridden by each DragTracker instance
  		* @param e Ext.EventObject The event object
  		*/
  var onBeforeStart: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.native
  /** [Method] Template method which should be overridden by each DragTracker instance
  		* @param e Ext.EventObject The event object
  		*/
  var onDrag: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.native
  /** [Method] Template method which should be overridden by each DragTracker instance
  		* @param e Ext.EventObject The event object
  		*/
  var onEnd: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.native
  /** [Method] Template method which should be overridden by each DragTracker instance
  		* @param e Ext.EventObject The event object
  		*/
  var onStart: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.native
  /** [Config Option] (String) */
  var overCls: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var preventDefault: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var stopEvent: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var tolerance: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var trackOver: js.UndefOr[Boolean] = js.native
}

object IDragTracker {
  @scala.inline
  def apply(): IDragTracker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDragTracker]
  }
  @scala.inline
  implicit class IDragTrackerOps[Self <: IDragTracker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoStart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrainTo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrainTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainTo")(js.undefined)
        ret
    }
    @scala.inline
    def withDelegate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelegate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegate")(js.undefined)
        ret
    }
    @scala.inline
    def withDragTarget(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDragTarget(value: () => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDragTarget")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDragTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDragTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOffset(value: /* constrainMode */ js.UndefOr[String] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withInitEl(value: /* el */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initEl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInitEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initEl")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeStart(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = {
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
    def withOnDrag(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = {
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
    def withOnEnd(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = {
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
    def withOnStart(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = {
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
    @scala.inline
    def withOverCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overCls")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withStopEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackOver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackOver")(js.undefined)
        ret
    }
  }
  
}

