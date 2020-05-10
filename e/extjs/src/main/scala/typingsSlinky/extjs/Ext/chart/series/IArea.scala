package typingsSlinky.extjs.Ext.chart.series

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IArea extends ICartesian {
  /** [Method] Draws the series for the current chart  */
  var drawSeries: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Highlight this entire series
  		* @param item Object Info about the item; same format as returned by getItemForPoint.
  		*/
  var highlightSeries: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.native
  /** [Method] Un highlights the specified item
  		* @param item Object Info about the item; same format as returned by getItemForPoint
  		*/
  @JSName("unHighlightItem")
  var unHighlightItem_IArea: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] UnHighlight this entire series
  		* @param item Object Info about the item; same format as returned by getItemForPoint.
  		*/
  var unHighlightSeries: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.native
}

object IArea {
  @scala.inline
  def apply(): IArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IArea]
  }
  @scala.inline
  implicit class IAreaOps[Self <: IArea] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawSeries(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawSeries")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDrawSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightSeries(value: /* item */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSeries")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHighlightSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withUnHighlightItem(value: /* item */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unHighlightItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnHighlightItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unHighlightItem")(js.undefined)
        ret
    }
    @scala.inline
    def withUnHighlightSeries(value: /* item */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unHighlightSeries")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnHighlightSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unHighlightSeries")(js.undefined)
        ret
    }
  }
  
}

