package typingsSlinky.html5plus

import typingsSlinky.html5plus.html5plusStrings.bottom
import typingsSlinky.html5plus.html5plusStrings.center
import typingsSlinky.html5plus.html5plusStrings.left
import typingsSlinky.html5plus.html5plusStrings.middle
import typingsSlinky.html5plus.html5plusStrings.right
import typingsSlinky.html5plus.html5plusStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 图片轮播控件中图片项配置参数
  * 用于指定图片地址等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
@js.native
trait PlusNativeObjImageSliderImageStyles extends js.Object {
  
  /**
    * 图片水平对齐方式
    * 仅在图片显示的宽度与图片轮播控件宽度不一致时有效，可取值：
    *         "left" - 图片在轮播控件中水平居左对齐；
    *         "center" - 图片在轮播控件中水平居中对齐；
    *         "right" - 图片在轮播控件中水平居右对齐。
    *     默认值为"center"。
    * - left: 图片在轮播控件中水平居左对齐
    * - center: 图片在轮播控件中水平居中对齐
    * - right: 图片在轮播控件中水平居右对齐
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var align: js.UndefOr[left | center | right] = js.native
  
  /**
    * 图片显示的高度
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，现对于图片轮播控件的高度；
    *         自动计算"auto"，如果指定图片宽度（width），则按图片实际大小等比缩放图片高度值，如果没有指定宽度（width值为"auto"）则自动缩放图片至可完整显示。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var height: js.UndefOr[String] = js.native
  
  /**
    * 图片地址
    * 支持本地地址（相对地址、绝对路径、RelativeURL、本地路径URL）；
    *     也支持网络地址（http://或https://）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var src: js.UndefOr[String] = js.native
  
  /**
    * 图片垂直对齐方式
    * 仅在图片显示的高度与图片轮播控件宽度不一致时有效，可取值：
    *         "top" - 图片在轮播控件中垂直居顶对齐；
    *         "middle" - 图片在轮播控件中垂直居中对齐；
    *         "bottom" - 图片在轮播控件中垂直居底对齐。
    *     默认值为"middle"。
    * - top: 图片在轮播控件中垂直居顶对齐
    * - middle: 图片在轮播控件中垂直居中对齐
    * - bottom: 图片在轮播控件中垂直居底对齐
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var verticalAlign: js.UndefOr[top | middle | bottom] = js.native
  
  /**
    * 图片显示的宽度
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于图片轮播控件的宽度；
    *         自动计算"auto"，如果指定图片高度（height），则按图片实际大小等比缩放图片宽度值，如果没有指定高度（height值为"auto"）则自动缩放图片至可完整显示。
    *     默认值为"auto"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var width: js.UndefOr[String] = js.native
}
object PlusNativeObjImageSliderImageStyles {
  
  @scala.inline
  def apply(): PlusNativeObjImageSliderImageStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeObjImageSliderImageStyles]
  }
  
  @scala.inline
  implicit class PlusNativeObjImageSliderImageStylesOps[Self <: PlusNativeObjImageSliderImageStyles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlign(value: left | center | right): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: top | middle | bottom): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
