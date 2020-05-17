package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.aliAppNumbers.`0`
import typingsSlinky.aliApp.aliAppNumbers.`1`
import typingsSlinky.aliApp.aliAppNumbers.`2`
import typingsSlinky.aliApp.aliAppNumbers.`3`
import typingsSlinky.aliApp.aliAppNumbers.`4`
import typingsSlinky.aliApp.anon.ApFilePaths
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompressImageOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 要压缩的图片地址数组
  		 */
  var apFilePaths: js.Array[String] = js.native
  /**
  		 * 压缩级别，支持 0 ~ 4 的整数，默认 4。详见「compressLevel表 说明表」
  		 * compressLevel表
  		 * compressLevel | 说明
  		 * --------------|-----
  		 * 0 | 低质量
  		 * 1 | 中等质量
  		 * 2 | 高质量
  		 * 3 | 不压缩
  		 * 4 | 根据网络适应
  		 */
  var compressLevel: js.UndefOr[`0` | `1` | `2` | `3` | `4`] = js.native
  @JSName("success")
  var success_CompressImageOptions: js.UndefOr[js.Function1[/* res */ ApFilePaths, Unit]] = js.native
}

object CompressImageOptions {
  @scala.inline
  def apply(apFilePaths: js.Array[String]): CompressImageOptions = {
    val __obj = js.Dynamic.literal(apFilePaths = apFilePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressImageOptions]
  }
  @scala.inline
  implicit class CompressImageOptionsOps[Self <: CompressImageOptions] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withCompressLevel(value: `0` | `1` | `2` | `3` | `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompressLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ ApFilePaths => Unit): Self = {
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

