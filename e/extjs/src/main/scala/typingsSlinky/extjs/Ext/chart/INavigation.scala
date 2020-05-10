package typingsSlinky.extjs.Ext.chart

import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INavigation extends IBase {
  /** [Method] Restores the zoom to the original value  */
  var restoreZoom: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Zooms the chart to the specified selection range
  		* @param zoomConfig Object
  		*/
  var setZoom: js.UndefOr[js.Function1[/* zoomConfig */ js.UndefOr[js.Any], Unit]] = js.native
}

object INavigation {
  @scala.inline
  def apply(): INavigation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INavigation]
  }
  @scala.inline
  implicit class INavigationOps[Self <: INavigation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRestoreZoom(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreZoom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRestoreZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withSetZoom(value: /* zoomConfig */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setZoom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setZoom")(js.undefined)
        ret
    }
  }
  
}

