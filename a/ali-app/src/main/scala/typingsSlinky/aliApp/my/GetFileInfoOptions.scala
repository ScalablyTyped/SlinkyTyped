package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.aliAppStrings.md5
import typingsSlinky.aliApp.aliAppStrings.sha1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFileInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 文件路径 */
  var apFilePath: String = js.native
  /** 摘要算法，支持md5和sha1，默认为md5 */
  var digestAlgorithm: js.UndefOr[md5 | sha1] = js.native
  @JSName("success")
  var success_GetFileInfoOptions: js.UndefOr[js.Function1[/* options */ GetFileInfoSuccess, Unit]] = js.native
}

object GetFileInfoOptions {
  @scala.inline
  def apply(apFilePath: String): GetFileInfoOptions = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileInfoOptions]
  }
  @scala.inline
  implicit class GetFileInfoOptionsOps[Self <: GetFileInfoOptions] (val x: Self) extends AnyVal {
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
    def withDigestAlgorithm(value: md5 | sha1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digestAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigestAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digestAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* options */ GetFileInfoSuccess => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

