package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，图片预览的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
  */
@js.native
trait PlusNativeUIPreviewImageOptions extends js.Object {
  /**
    * 图片预览的背景颜色
    * 颜色值格式为"#RRGGBB"，如"#FF0000"表示为红色背景。
    * 	默认值为黑色（"#000000"）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var background: js.UndefOr[String] = js.native
  /**
    * 默认显示图片的索引值
    * 索引值从0开始，默认值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var current: js.UndefOr[Double] = js.native
  /**
    * 图片指示器样式
    * 可取值：
    * 		"default" - 默认指示器（底部圆点样式）；
    * 		"number" - 顶部数字指示器（顶部居中显示，文字为%当前图片索引值（从1开始）%/%图片总数%）；
    * 		"none" - 不显示指示器。
    * 	默认值为"default"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var indicator: js.UndefOr[String] = js.native
  /**
    * 是否可循环预览
    * 可取值：
    * 		"true" - 支持循环预览；
    * 		"false" - 不支持循环预览。
    * 	默认值为"false"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var loop: js.UndefOr[Boolean] = js.native
}

object PlusNativeUIPreviewImageOptions {
  @scala.inline
  def apply(): PlusNativeUIPreviewImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeUIPreviewImageOptions]
  }
  @scala.inline
  implicit class PlusNativeUIPreviewImageOptionsOps[Self <: PlusNativeUIPreviewImageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicator")(js.undefined)
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
  }
  
}

