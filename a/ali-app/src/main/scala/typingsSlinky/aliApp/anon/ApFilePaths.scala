package typingsSlinky.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApFilePaths extends js.Object {
  /**
  			 * 图片文件描述
  			 */
  var apFilePaths: js.Array[String] = js.native
}

object ApFilePaths {
  @scala.inline
  def apply(apFilePaths: js.Array[String]): ApFilePaths = {
    val __obj = js.Dynamic.literal(apFilePaths = apFilePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApFilePaths]
  }
  @scala.inline
  implicit class ApFilePathsOps[Self <: ApFilePaths] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApFilePaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apFilePaths")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

