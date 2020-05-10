package typingsSlinky.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppendObjectResult extends js.Object {
  var name: String = js.native
  var nextAppendPosition: String = js.native
   // the url of oss
  var res: NormalSuccessResponse = js.native
  var url: String = js.native
}

object AppendObjectResult {
  @scala.inline
  def apply(name: String, nextAppendPosition: String, res: NormalSuccessResponse, url: String): AppendObjectResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nextAppendPosition = nextAppendPosition.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendObjectResult]
  }
  @scala.inline
  implicit class AppendObjectResultOps[Self <: AppendObjectResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextAppendPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextAppendPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRes(value: NormalSuccessResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

