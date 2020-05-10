package typingsSlinky.extjs.Ext.grid

import typingsSlinky.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILockingView extends IObservable {
  /** [Property] (Boolean) */
  var isLockingView: js.UndefOr[Boolean] = js.native
}

object ILockingView {
  @scala.inline
  def apply(): ILockingView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILockingView]
  }
  @scala.inline
  implicit class ILockingViewOps[Self <: ILockingView] (val x: Self) extends AnyVal {
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

