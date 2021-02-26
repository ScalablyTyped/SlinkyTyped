package typingsSlinky.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * View控件样式
  * 包括位置、大小等信息等，其中位置信息相对于父容器控件进行计算。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
@js.native
trait PlusNativeObjViewStyles extends StObject {
  
  /**
    * 区域背景颜色
    * 可取值：
    *     #RRGGBB"格式字符串，如"#FF0000"表示绘制红色区域；
    *     "rgba(R,G,B,A)"，其中R/G/B分别代表红色值/绿色值/蓝色值，正整数类型，取值范围为0-255，A为透明度，浮点数类型，取值范围为0-1（0为全透明，1为不透明），如"rgba(255,0,0,0.5)"，表示红色半透明。 默认值为"#FFFFFF"（白色）。 "rgba(R,G,B,A)"，其中R/G/B分别代表红色值/绿色值/蓝色值，正整数类型，取值范围为0-255，A为透明度，浮点数类型，取值范围为0-1（0为全透明，1为不透明），如"rgba(255,0,0,0.5)"，表示红色半透明。 默认值为"#FFFFFF"（白色）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * View控件垂直向上的偏移量
    * 现对于父容器底部的距离，可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于父容器的高度，如果没有父容器则相对于屏幕高度。
    *     当设置了top和height值时，忽略此属性值；
    *     未设置height值时，可通过top和bottom属性值来确定View控件的高度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var bottom: js.UndefOr[String] = js.native
  
  /**
    * View控件的停靠方式
    * 仅当View控件添加到Webview窗口对象中并且position属性值设置为"dock"时才生效，此时View控件挤压Webview窗口的大小。
    *     可取值：
    *         "top"，控件停靠则页面顶部；
    *         "bottom"，控件停靠在页面底部；
    *         "right"，控件停靠在页面右侧；
    *         "left"，控件停靠在页面左侧。
    *     默认值为"top"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var dock: js.UndefOr[String] = js.native
  
  /**
    * 区域的高度
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于父容器的高度，如果没有父容器则相对于屏幕高度；
    *         内容自适应，如"wrap_content"，根据内容计算控件的高度。
    *     默认值为"100%"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var height: js.UndefOr[String] = js.native
  
  /**
    * 区域左上角的水平偏移量
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于父控件的宽度；
    *         自动计算，如"auto"，根据width值自动计算，相对于父控件水平居中。
    *     默认值为"0px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var left: js.UndefOr[String] = js.native
  
  /**
    * View控件的不透明度
    * 取值范围为0-1，0为全透明，1为不透明，默认值为1，即不透明。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * View控件的排版方式
    * 仅当View控件添加到Webview窗口对象中时才生效。
    *     可取值：
    *     "static"，View控件在页面中正常定位，如果页面存在滚动条则随窗口内容滚动；
    *     "absolute"，Veiw控件在页面中绝对定位，如果页面存在滚动条不随窗口内容滚动；
    *     "dock"，View控件在页面中停靠，停靠的位置由dock属性值决定。
    *     默认值为"absolute"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var position: js.UndefOr[String] = js.native
  
  /**
    * View控件的状态栏样式
    * 仅在应用设置为沉浸式状态栏样式下有效，设置此属性后将自动保留系统状态栏区域不被View控件占用（即View控件非沉浸式样式显示）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var statusbar: js.UndefOr[PlusNativeObjViewStatusbarStyles] = js.native
  
  /**
    * View控件左上角的垂直偏移量
    * 可取值：像素值，如"100px"；百分比，如"10%"，相对于父控件的高度；自动计算，如"auto",根据height值自动计算，相对于父控件垂直居中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var top: js.UndefOr[String] = js.native
  
  /**
    * 区域的宽度
    * 可取值：像素值，如"100px";百分比，如"10%"，相对于父控件的宽度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var width: js.UndefOr[String] = js.native
}
object PlusNativeObjViewStyles {
  
  @scala.inline
  def apply(): PlusNativeObjViewStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeObjViewStyles]
  }
  
  @scala.inline
  implicit class PlusNativeObjViewStylesMutableBuilder[Self <: PlusNativeObjViewStyles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setDock(value: String): Self = StObject.set(x, "dock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockUndefined: Self = StObject.set(x, "dock", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setStatusbar(value: PlusNativeObjViewStatusbarStyles): Self = StObject.set(x, "statusbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusbarUndefined: Self = StObject.set(x, "statusbar", js.undefined)
    
    @scala.inline
    def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
