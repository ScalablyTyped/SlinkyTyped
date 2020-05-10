package typingsSlinky.extjs.Ext.dd

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDragZone extends IDragSource {
  /** [Config Option] (Object/Boolean) */
  var containerScroll: js.UndefOr[js.Any] = js.native
  /** [Method] Called when a mousedown occurs in this container
  		* @param e Event The mouse down event
  		* @returns Object The dragData
  		*/
  @JSName("getDragData")
  var getDragData_IDragZone: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event_], _]] = js.native
  /** [Method] Called before a repair of an invalid drop to get the XY to animate to
  		* @param e Event The mouse up event
  		* @returns Number[] The xy location (e.g. [100, 200])
  		*/
  var getRepairXY: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event_], Array]] = js.native
  /** [Method] Called once drag threshold has been reached to initialize the proxy element
  		* @param x Number The x position of the click on the dragged object
  		* @param y Number The y position of the click on the dragged object
  		* @returns Boolean true to continue the drag, false to cancel
  		*/
  var onInitDrag: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Boolean]] = js.native
  /** [Config Option] (String/HTMLElement/Ext.dom.Element) */
  var scrollEl: js.UndefOr[js.Any] = js.native
}

object IDragZone {
  @scala.inline
  def apply(): IDragZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDragZone]
  }
  @scala.inline
  implicit class IDragZoneOps[Self <: IDragZone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerScroll(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDragData(value: /* e */ js.UndefOr[Event_] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDragData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetDragData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDragData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRepairXY(value: /* e */ js.UndefOr[Event_] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRepairXY")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetRepairXY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRepairXY")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInitDrag(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitDrag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnInitDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollEl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEl")(js.undefined)
        ret
    }
  }
  
}

