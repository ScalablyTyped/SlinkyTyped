package typingsSlinky.extjs.Ext.grid.locking

import typingsSlinky.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IView extends IObservable {
  /** [Property] (Boolean) */
  var isLockingView: js.UndefOr[Boolean] = js.native
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
    def withIsLockingView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLockingView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLockingView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLockingView")(js.undefined)
        ret
    }
  }
  
}

