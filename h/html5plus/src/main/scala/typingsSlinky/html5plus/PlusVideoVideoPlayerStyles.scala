package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 视频播放控件参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
  */
@js.native
trait PlusVideoVideoPlayerStyles extends js.Object {
  /**
    * 是否自动播放
    * 默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var autoplay: js.UndefOr[Boolean] = js.native
  /**
    * 是否显示默认播放控件
    * 默认值为true。
    * 	包括播放/暂停按钮、播放进度、时间等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var controls: js.UndefOr[Boolean] = js.native
  /**
    * 是否显示弹幕按钮
    * 默认值为false。
    * 	注意：仅在控件构造时设置有效，不能动态更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `danmu-btn`: js.UndefOr[Boolean] = js.native
  /**
    * 弹幕列表
    * 弹幕JSON对象包括属性：text（String类型，弹幕文本类容），color（String类型，弹幕颜色，格式为#RRGGBB），time（Number类型，弹幕出现的时间，单位为秒）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `danmu-list`: js.UndefOr[js.Array[_]] = js.native
  /**
    * 设置全屏时视频的方向
    * 不指定则根据宽高比自动判断。
    * 	有效值为： 0（正常竖向）, 90（屏幕逆时针90度）, -90（屏幕顺时针90度）。
    * 	默认值为-90。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var direction: js.UndefOr[Double] = js.native
  /**
    * 视频长度
    * 单位为秒（s）。
    * 	注意：仅在视频开始播放前设置有效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * 是否展示弹幕
    * 默认值为false。
    * 	注意：仅在控件构造时设置有效，不能动态更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `enable-danmu`: js.UndefOr[Boolean] = js.native
  /**
    * 是否开启控制进度的手势
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `enable-progress-gesture`: js.UndefOr[Boolean] = js.native
  /**
    * VideoPlayer控件的高度
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，相对于父Webview窗口的高度。
    * 	默认值为"100%"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var height: js.UndefOr[String] = js.native
  /**
    * 视频初始播放位置
    * 单位为秒（s）。
    * 	注意：仅在视频开始播放前设置有效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `initial-time`: js.UndefOr[Double] = js.native
  /**
    * VideoPlayer控件左上角的水平偏移量
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，相对于父Webview窗口的宽度；
    * 		自动计算，如"auto"，根据width值自动计算，相对于父Webview窗口水平居中。
    * 	默认值为"0px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var left: js.UndefOr[String] = js.native
  /**
    * 是否循环播放
    * 默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var loop: js.UndefOr[Boolean] = js.native
  /**
    * 是否静音播放
    * 默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var muted: js.UndefOr[Boolean] = js.native
  /**
    * 当视频大小与 video 容器大小不一致时，视频的表现形式
    * 有效值为：contain（包含），fill（填充），cover（覆盖）。
    * 	默认值为contain。
    * 	仅Android平台支持。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var objectFit: js.UndefOr[String] = js.native
  /**
    * VideoPlayer控件在Webview窗口的布局模式
    * 可取值：
    * 		"static" - 静态布局模式，如果页面存在滚动条则随窗口内容滚动；
    * 		"absolute" - 绝对布局模式，如果页面存在滚动条不随窗口内容滚动；
    * 	默认值为"static"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var position: js.UndefOr[String] = js.native
  /**
    * 视频封面的图片网络资源地址
    * 如果 controls 属性值为 false 则设置 poster 无效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var poster: js.UndefOr[String] = js.native
  /**
    * 是否显示视频中间的播放按钮
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `show-center-play-btn`: js.UndefOr[Boolean] = js.native
  /**
    * 是否显示全屏按钮
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `show-fullscreen-btn`: js.UndefOr[Boolean] = js.native
  /**
    * 是否显示视频底部控制栏的播放按钮
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `show-play-btn`: js.UndefOr[Boolean] = js.native
  /**
    * 是否显示播放进度
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `show-progress`: js.UndefOr[Boolean] = js.native
  /**
    * 视频资源地址
    * 支持本地地址，也支持网络地址及直播流（RTMP）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var src: js.UndefOr[String] = js.native
  /**
    * VideoPlayer控件左上角的垂直偏移量
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，相对于父Webview窗口的高度；
    * 		自动计算，如"auto",根据height值自动计算，相对于父Webview窗口垂直居中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var top: js.UndefOr[String] = js.native
  /**
    * VideoPlayer控件的宽度
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，相对于父Webview窗口的宽度。
    * 	默认值为"100%"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var width: js.UndefOr[String] = js.native
}

object PlusVideoVideoPlayerStyles {
  @scala.inline
  def apply(): PlusVideoVideoPlayerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusVideoVideoPlayerStyles]
  }
  @scala.inline
  implicit class PlusVideoVideoPlayerStylesOps[Self <: PlusVideoVideoPlayerStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(js.undefined)
        ret
    }
    @scala.inline
    def withControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def `withDanmu-btn`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("danmu-btn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDanmu-btn`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("danmu-btn")(js.undefined)
        ret
    }
    @scala.inline
    def `withDanmu-list`(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("danmu-list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDanmu-list`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("danmu-list")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def `withEnable-danmu`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable-danmu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutEnable-danmu`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable-danmu")(js.undefined)
        ret
    }
    @scala.inline
    def `withEnable-progress-gesture`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable-progress-gesture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutEnable-progress-gesture`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable-progress-gesture")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def `withInitial-time`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial-time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInitial-time`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial-time")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withMuted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMuted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectFit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectFit")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withPoster(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poster")(js.undefined)
        ret
    }
    @scala.inline
    def `withShow-center-play-btn`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-center-play-btn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutShow-center-play-btn`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-center-play-btn")(js.undefined)
        ret
    }
    @scala.inline
    def `withShow-fullscreen-btn`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-fullscreen-btn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutShow-fullscreen-btn`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-fullscreen-btn")(js.undefined)
        ret
    }
    @scala.inline
    def `withShow-play-btn`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-play-btn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutShow-play-btn`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-play-btn")(js.undefined)
        ret
    }
    @scala.inline
    def `withShow-progress`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutShow-progress`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-progress")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

