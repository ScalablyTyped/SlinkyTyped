package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 原生动画窗口样式
  * 指定动画窗口的样式，如背景图片，绘制的文字等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
@js.native
trait PlusNativeObjAnimationViewStyles extends js.Object {
  /**
    * 动画窗口上绘制的背景图片
    * 图片可以通过Webview对象的draw方法截图，也可以通过Bitmap的API从本地文件中加载。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var bitmap: js.UndefOr[PlusNativeObjBitmap] = js.native
  /**
    * 动画窗口上绘制的文本内容
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var text: js.UndefOr[String] = js.native
  /**
    * 动画窗口上绘制的文本区域
    * 默认值为{top:'0px',left:'0px',width:'100%',height:'44px'}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var textRect: js.UndefOr[PlusNativeObjRect] = js.native
  /**
    * 动画窗口上绘制的文本样式
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var textStyles: js.UndefOr[PlusNativeObjTextStyles] = js.native
}

object PlusNativeObjAnimationViewStyles {
  @scala.inline
  def apply(): PlusNativeObjAnimationViewStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeObjAnimationViewStyles]
  }
  @scala.inline
  implicit class PlusNativeObjAnimationViewStylesOps[Self <: PlusNativeObjAnimationViewStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitmap(value: PlusNativeObjBitmap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitmap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitmap")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextRect(value: PlusNativeObjRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRect")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyles(value: PlusNativeObjTextStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyles")(js.undefined)
        ret
    }
  }
  
}

