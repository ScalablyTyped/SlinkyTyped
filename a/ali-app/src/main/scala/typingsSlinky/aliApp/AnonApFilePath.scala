package typingsSlinky.aliApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApFilePath extends js.Object {
  /** 文件路径 */
  var apFilePath: String = js.native
  /** 创建时间 */
  var createTime: Double = js.native
  /** 文件大小 */
  var size: Double = js.native
}

object AnonApFilePath {
  @scala.inline
  def apply(apFilePath: String, createTime: Double, size: Double): AnonApFilePath = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApFilePath]
  }
  @scala.inline
  implicit class AnonApFilePathOps[Self <: AnonApFilePath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apFilePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

