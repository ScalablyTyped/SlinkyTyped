package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 绘制区域样式对象
  * 用于定义矩形区域的显示样式，如空心/实心样式、圆角等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
@js.native
trait PlusNativeObjRectStyles extends js.Object {
  
  /**
    * 矩形边框颜色
    * 绘制矩形边框的颜色，可取值：
    *     "#RRGGBB"格式字符串，如"#FF0000"表示绘制红色区域；
    *     "rgba(R,G,B,A)"，其中R/G/B分别代表红色值/绿色值/蓝色值，正整数类型，取值范围为0-255，A为透明度，浮点数类型，取值范围为0-1（0为全透明，1为不透明），如"rgba(255,0,0,0.5)"，表示红色半透明。
    *     默认值为矩形填充区域颜色（color属性值）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var borderColor: js.UndefOr[String] = js.native
  
  /**
    * 矩形边框宽度
    * 可取值：像素值，数字加"px"格式字符串，如"2px"。
    *     默认值为"0px"（无边框）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var borderWidth: js.UndefOr[String] = js.native
  
  /**
    * 绘制颜色
    * 矩形填充区域的颜色，可取值：
    *     "#RRGGBB"格式字符串，如"#FF0000"表示绘制红色区域；
    *     "rgba(R,G,B,A)"，其中R/G/B分别代表红色值/绿色值/蓝色值，正整数类型，取值范围为0-255，A为透明度，浮点数类型，取值范围为0-1（0为全透明，1为不透明），如"rgba(255,0,0,0.5)"，表示红色半透明。
    *     默认值为"#FFFFFF"（白色）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * 矩形区域的圆角半径
    * 可取值：圆角半径像素值，数字加"px"格式字符串，如"6px"。
    *     默认值为"0px"（矩形无圆角）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var radius: js.UndefOr[String] = js.native
}
object PlusNativeObjRectStyles {
  
  @scala.inline
  def apply(): PlusNativeObjRectStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeObjRectStyles]
  }
  
  @scala.inline
  implicit class PlusNativeObjRectStylesOps[Self <: PlusNativeObjRectStyles] (val x: Self) extends AnyVal {
    
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
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: String): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setRadius(value: String): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
  }
}
