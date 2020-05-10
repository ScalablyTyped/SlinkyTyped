package typingsSlinky.aliApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIndicate extends js.Object {
  /**
  					 * 该特征值是否支持 indicate 操作
  					 */
  var indicate: Boolean = js.native
  /**
  					 * 该特征值是否支持 notify 操作
  					 */
  @JSName("notify")
  var notify_FAnonIndicate: Boolean = js.native
  /**
  					 * 该特征值是否支持 read 操作
  					 */
  var read: Boolean = js.native
  /**
  					 * 该特征值是否支持 write 操作
  					 */
  var write: Boolean = js.native
}

object AnonIndicate {
  @scala.inline
  def apply(indicate: Boolean, notify: Boolean, read: Boolean, write: Boolean): AnonIndicate = {
    val __obj = js.Dynamic.literal(indicate = indicate.asInstanceOf[js.Any], notify = notify.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndicate]
  }
  @scala.inline
  implicit class AnonIndicateOps[Self <: AnonIndicate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndicate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

