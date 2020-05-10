package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReaddirSuccessCallbackResult extends js.Object {
  /** 指定目录下的文件名数组。 */
  var files: Array[String] = js.native
}

object ReaddirSuccessCallbackResult {
  @scala.inline
  def apply(files: Array[String]): ReaddirSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaddirSuccessCallbackResult]
  }
  @scala.inline
  implicit class ReaddirSuccessCallbackResultOps[Self <: ReaddirSuccessCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiles(value: Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

