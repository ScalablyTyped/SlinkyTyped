package typingsSlinky.baiduApp.swan

import typingsSlinky.baiduApp.AnonSwanid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwanIdTask extends js.Object {
  var data: AnonSwanid = js.native
  var errno: String = js.native
}

object SwanIdTask {
  @scala.inline
  def apply(data: AnonSwanid, errno: String): SwanIdTask = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errno = errno.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwanIdTask]
  }
  @scala.inline
  implicit class SwanIdTaskOps[Self <: SwanIdTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: AnonSwanid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrno(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errno")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

