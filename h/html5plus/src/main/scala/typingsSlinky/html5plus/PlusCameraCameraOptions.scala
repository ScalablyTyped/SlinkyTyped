package typingsSlinky.html5plus

import typingsSlinky.html5plus.html5plusStrings._docSlash
import typingsSlinky.html5plus.html5plusStrings._documentsSlash
import typingsSlinky.html5plus.html5plusStrings._downloadsSlash
import typingsSlinky.html5plus.html5plusStrings.`1`
import typingsSlinky.html5plus.html5plusStrings.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，调用摄像头的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
  */
@js.native
trait PlusCameraCameraOptions extends js.Object {
  /**
    * 拍照或摄像文件保存的路径
    * 可设置具体文件名（如"_doc/camera/a.jpg"）；也可只设置路径，以"/"结尾则表明是路径（如"_doc/camera/"）。
    * 	如未设置文件名称或设置的文件名冲突则文件名由程序程序自动生成。
    * - _doc/: 应用私有文档目录
    * - _documents/: 共享文档目录
    * - _downloads/: 共享下载目录
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var filename: js.UndefOr[_docSlash | _documentsSlash | _downloadsSlash] = js.native
  /**
    * 拍照或摄像的文件格式
    * 可通过Camera对象的supportedImageFormats或supportedVideoFormats获取，如果设置的参数无效则使用系统默认值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var format: js.UndefOr[String] = js.native
  /**
    * 拍照或摄像默认使用的摄像头
    * 拍照或摄像界面默认使用的摄像头编号，1表示主摄像头，2表示辅摄像头。
    * - 1: 使用设备主摄像头
    * - 2: 使用设备辅摄像头
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var index: js.UndefOr[`1` | `2`] = js.native
  /**
    * 是否优化图片
    * 自动调整图片的方向，在部分设备上可能出现图片方向不正确的问题，此参数将配置是否自动调整图片方向。
    * 	可取值：
    * 		true - 自动调整图片方向；
    * 		false - 不调整。
    * 	默认值为true。
    * 	注意：自动调整图片方向将消耗部分系统资源，可能会导致拍照后回调触发时机延迟，将此值设置为false则可避免延迟问题。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var optimize: js.UndefOr[Boolean] = js.native
  /**
    * 拍照或摄像界面弹出指示区域
    * 对于大屏幕设备如iPad，拍照或摄像界面为弹出窗口，此时可通过此参数设置弹出窗口位置，其为JSON对象，格式如{top:"10px",left:"10px",width:"200px",height:"200px"}，默认弹出位置为屏幕居中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var popover: js.UndefOr[PlusCameraPopPosition] = js.native
  /**
    * 拍照或摄像使用的分辨率
    * 可通过Camera对象的supportedImageResolutions或supportedVideoResolutions获取，如果设置的参数无效则使用系统默认值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var resolution: js.UndefOr[String] = js.native
  /**
    * 视频长度
    * 单位为秒（s），小于等于0表示不限定视频长度。
    * 	默认值为0（不限定视频长度）。
    * 	注意：仅在调用拍摄视频（startVideoCapture）时有效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var videoMaximumDuration: js.UndefOr[Double] = js.native
}

object PlusCameraCameraOptions {
  @scala.inline
  def apply(): PlusCameraCameraOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusCameraCameraOptions]
  }
  @scala.inline
  implicit class PlusCameraCameraOptionsOps[Self <: PlusCameraCameraOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilename(value: _docSlash | _documentsSlash | _downloadsSlash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimize")(js.undefined)
        ret
    }
    @scala.inline
    def withPopover(value: PlusCameraPopPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popover")(js.undefined)
        ret
    }
    @scala.inline
    def withResolution(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoMaximumDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoMaximumDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoMaximumDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoMaximumDuration")(js.undefined)
        ret
    }
  }
  
}

