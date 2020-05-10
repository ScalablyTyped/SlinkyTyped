package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 媒体-----视频
@js.native
trait ChooseVideoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 前置或者后置摄像头，默认为前后都有，即：['front', 'back'] */
  var camera: js.UndefOr[CameraDevice] = js.native
  /** 是否压缩所选的视频源文件，默认值为true，需要压缩 */
  var compressed: js.UndefOr[Boolean] = js.native
  /** 拍摄视频最长拍摄时间，单位秒。最长支持60秒 */
  var maxDuration: js.UndefOr[Double] = js.native
  /** album 从相册选视频，camera 使用相机拍摄，默认为：['album', 'camera'] */
  var sourceType: js.UndefOr[js.Array[VideoSourceType]] = js.native
  /** 接口调用成功，返回视频文件的临时文件路径，详见返回参数说明 */
  @JSName("success")
  var success_ChooseVideoOptions: js.UndefOr[js.Function1[/* res */ VideoData, Unit]] = js.native
}

object ChooseVideoOptions {
  @scala.inline
  def apply(): ChooseVideoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseVideoOptions]
  }
  @scala.inline
  implicit class ChooseVideoOptionsOps[Self <: ChooseVideoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCamera(value: CameraDevice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCamera: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(js.undefined)
        ret
    }
    @scala.inline
    def withCompressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompressed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressed")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceType(value: js.Array[VideoSourceType]): Self = {
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
    def withSuccess(value: /* res */ VideoData => Unit): Self = {
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

