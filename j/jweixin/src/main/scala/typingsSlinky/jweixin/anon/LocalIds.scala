package typingsSlinky.jweixin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalIds extends js.Object {
  var errMsg: String = js.native
  	// weixin album camera
  var localIds: js.Array[String] = js.native
  var sourceType: String = js.native
}

object LocalIds {
  @scala.inline
  def apply(errMsg: String, localIds: js.Array[String], sourceType: String): LocalIds = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], localIds = localIds.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalIds]
  }
  @scala.inline
  implicit class LocalIdsOps[Self <: LocalIds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

