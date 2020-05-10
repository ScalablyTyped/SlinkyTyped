package typingsSlinky.extjs.Ext.chart

import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHighlight extends IBase {
  /** [Config Option] (Boolean/Object) */
  var highlight: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var highlightCfg: js.UndefOr[js.Any] = js.native
  /** [Method] Highlight the given series item
  		* @param item Object Info about the item; same format as returned by #getItemForPoint.
  		*/
  var highlightItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Un highlight any existing highlights */
  var unHighlightItem: js.UndefOr[js.Function0[Unit]] = js.native
}

object IHighlight {
  @scala.inline
  def apply(): IHighlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHighlight]
  }
  @scala.inline
  implicit class IHighlightOps[Self <: IHighlight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighlight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightCfg(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCfg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightCfg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCfg")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightItem(value: /* item */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withUnHighlightItem(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unHighlightItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUnHighlightItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unHighlightItem")(js.undefined)
        ret
    }
  }
  
}

