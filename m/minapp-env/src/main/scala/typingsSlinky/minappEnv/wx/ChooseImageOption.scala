package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.Array
import typingsSlinky.minappEnv.minappEnvStrings.album
import typingsSlinky.minappEnv.minappEnvStrings.camera
import typingsSlinky.minappEnv.minappEnvStrings.compressed
import typingsSlinky.minappEnv.minappEnvStrings.original
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseImageOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ChooseImageCompleteCallback] = js.native
  /** 最多可以选择的图片张数 */
  var count: js.UndefOr[Double] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ChooseImageFailCallback] = js.native
  /** 所选的图片的尺寸
    *
    * 可选值：
    * - 'original': 原图;
    * - 'compressed': 压缩图; */
  var sizeType: js.UndefOr[Array[original | compressed]] = js.native
  /** 选择图片的来源
    *
    * 可选值：
    * - 'album': 从相册选图;
    * - 'camera': 使用相机; */
  var sourceType: js.UndefOr[Array[album | camera]] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ChooseImageSuccessCallback] = js.native
}

object ChooseImageOption {
  @scala.inline
  def apply(): ChooseImageOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseImageOption]
  }
  @scala.inline
  implicit class ChooseImageOptionOps[Self <: ChooseImageOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: /* res */ GeneralCallbackResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(value: /* res */ GeneralCallbackResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeType(value: Array[original | compressed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeType")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceType(value: Array[album | camera]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* result */ ChooseImageSuccessCallbackResult => Unit): Self = {
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

