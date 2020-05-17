package typingsSlinky.baiduApp.swan

import typingsSlinky.baiduApp.anon.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait verifyTask extends js.Object {
  var data: Result = js.native
  var errmsg: String = js.native
  var errno: String = js.native
}

object verifyTask {
  @scala.inline
  def apply(data: Result, errmsg: String, errno: String): verifyTask = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errmsg = errmsg.asInstanceOf[js.Any], errno = errno.asInstanceOf[js.Any])
    __obj.asInstanceOf[verifyTask]
  }
  @scala.inline
  implicit class verifyTaskOps[Self <: verifyTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Result): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrmsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errmsg")(value.asInstanceOf[js.Any])
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

