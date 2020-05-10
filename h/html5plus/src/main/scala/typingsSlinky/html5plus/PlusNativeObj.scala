package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * nativeObj管理系统原生对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
@js.native
trait PlusNativeObj extends js.Object {
  /**
    * 原生动画参数
    * 指定动画的类型、持续时间等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var AnimationOptions: js.UndefOr[PlusNativeObjAnimationOptions] = js.native
  /**
    * 原生动画窗口样式
    * 指定动画窗口的样式，如背景图片，绘制的文字等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var AnimationViewStyles: js.UndefOr[PlusNativeObjAnimationViewStyles] = js.native
  /**
    * 原生图片对象
    * 原生图片对象会占用较大的内存资源，在使用时需谨慎管理，当图片不再使用时应该及时调用clear方法进行销毁。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var Bitmap: js.UndefOr[PlusNativeObjBitmap] = js.native
  /**
    * JSON对象，保存图片的参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var BitmapSaveOptions: js.UndefOr[PlusNativeObjBitmapSaveOptions] = js.native
  /**
    * 原生图片轮播控件对象
    * 原生图片轮播控件对象从原生View控件（plus.nativeObj.View）继承而来，用于绘制图片轮播内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var ImageSlider: js.UndefOr[PlusNativeObjImageSlider] = js.native
  /**
    * 图片轮播控件中图片项配置参数
    * 用于指定图片地址等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var ImageSliderImageStyles: js.UndefOr[PlusNativeObjImageSliderImageStyles] = js.native
  /**
    * 图片轮播控件样式
    * 从ViewStyles继承而来，扩展支持轮播图片等配置。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var ImageSliderStyles: js.UndefOr[PlusNativeObjImageSliderStyles] = js.native
  /**
    * 输入框样式
    * 用于定义输入框的显示样式，如字体大小，提示内容等信息。
    * 	输入文本内容在指定区域水平居左，垂直居中显示。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var InputStyles: js.UndefOr[PlusNativeObjInputStyles] = js.native
  /**
    * 区域信息对象
    * 包括位置、大小等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var Position: js.UndefOr[PlusNativeObjPosition] = js.native
  /**
    * 区域信息对象
    * 包括位置、大小等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var Rect: js.UndefOr[PlusNativeObjRect] = js.native
  /**
    * 绘制区域样式对象
    * 用于定义矩形区域的显示样式，如空心/实心样式、圆角等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var RectStyles: js.UndefOr[PlusNativeObjRectStyles] = js.native
  /**
    * 富文本样式
    * 用于定义富文本使用的默认使用的字体名称、字体文件路径等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var RichTextStyles: js.UndefOr[PlusNativeObjRichTextStyles] = js.native
  /**
    * 绘制文本样式对象
    * 用于定义文本的显示样式，如字体大小、字体颜色、字体粗细、字体样式、字体名称等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var TextStyles: js.UndefOr[PlusNativeObjTextStyles] = js.native
  /**
    * 原生控件对象
    * 原生控件对象可用于在屏幕上绘制图片或文本内容，当控件不再使用时需要调用close方法销毁控件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var View: js.UndefOr[PlusNativeObjView] = js.native
  /**
    * View控件动画参数
    * 指定动画的类型、持续时间等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var ViewAnimationOptions: js.UndefOr[PlusNativeObjViewAnimationOptions] = js.native
  /**
    * View控件绘制元素参数
    * 指定绘制图片、矩形区域、文本内容等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var ViewDrawTagStyles: js.UndefOr[PlusNativeObjViewDrawTagStyles] = js.native
  /**
    * View控件事件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var ViewEvents: js.UndefOr[PlusNativeObjViewEvents] = js.native
  /**
    * JSON对象，View控件的系统状态栏区域样式
    * 仅在应用设置为沉浸式状态栏样式下有效，非沉浸式状态栏样式下忽略此属性。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var ViewStatusbarStyles: js.UndefOr[PlusNativeObjViewStatusbarStyles] = js.native
  /**
    * View控件样式
    * 包括位置、大小等信息等，其中位置信息相对于父容器控件进行计算。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var ViewStyles: js.UndefOr[PlusNativeObjViewStyles] = js.native
}

object PlusNativeObj {
  @scala.inline
  def apply(): PlusNativeObj = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeObj]
  }
  @scala.inline
  implicit class PlusNativeObjOps[Self <: PlusNativeObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationOptions(value: PlusNativeObjAnimationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnimationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnimationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationViewStyles(value: PlusNativeObjAnimationViewStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnimationViewStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationViewStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnimationViewStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withBitmap(value: PlusNativeObjBitmap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bitmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitmap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bitmap")(js.undefined)
        ret
    }
    @scala.inline
    def withBitmapSaveOptions(value: PlusNativeObjBitmapSaveOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BitmapSaveOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitmapSaveOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BitmapSaveOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withImageSlider(value: PlusNativeObjImageSlider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageSlider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageSlider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageSlider")(js.undefined)
        ret
    }
    @scala.inline
    def withImageSliderImageStyles(value: PlusNativeObjImageSliderImageStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageSliderImageStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageSliderImageStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageSliderImageStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withImageSliderStyles(value: PlusNativeObjImageSliderStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageSliderStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageSliderStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageSliderStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withInputStyles(value: PlusNativeObjInputStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: PlusNativeObjPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position")(js.undefined)
        ret
    }
    @scala.inline
    def withRect(value: PlusNativeObjRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rect")(js.undefined)
        ret
    }
    @scala.inline
    def withRectStyles(value: PlusNativeObjRectStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RectStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRectStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RectStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withRichTextStyles(value: PlusNativeObjRichTextStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RichTextStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRichTextStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RichTextStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyles(value: PlusNativeObjTextStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: PlusNativeObjView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("View")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("View")(js.undefined)
        ret
    }
    @scala.inline
    def withViewAnimationOptions(value: PlusNativeObjViewAnimationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewAnimationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewAnimationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewAnimationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withViewDrawTagStyles(value: PlusNativeObjViewDrawTagStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewDrawTagStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewDrawTagStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewDrawTagStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withViewEvents(value: PlusNativeObjViewEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withViewStatusbarStyles(value: PlusNativeObjViewStatusbarStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewStatusbarStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewStatusbarStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewStatusbarStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withViewStyles(value: PlusNativeObjViewStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewStyles")(js.undefined)
        ret
    }
  }
  
}

