package typingsSlinky.androiduix.android.widget.ProgressBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshData extends js.Object {
  var fromUser: Boolean = js.native
  var id: String = js.native
  var progress: Double = js.native
  def recycle(): Unit = js.native
}

object RefreshData {
  @scala.inline
  def apply(fromUser: Boolean, id: String, progress: Double, recycle: () => Unit): RefreshData = {
    val __obj = js.Dynamic.literal(fromUser = fromUser.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], recycle = js.Any.fromFunction0(recycle))
    __obj.asInstanceOf[RefreshData]
  }
  @scala.inline
  implicit class RefreshDataOps[Self <: RefreshData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecycle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recycle")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

