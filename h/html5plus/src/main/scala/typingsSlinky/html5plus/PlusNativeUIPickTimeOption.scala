package typingsSlinky.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，时间选择对话框的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
  */
@js.native
trait PlusNativeUIPickTimeOption extends StObject {
  
  /**
    * 是否24小时制模式
    * true表示使用24小时制模式显示，fale表示使用12小时制模式显示，默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var is24Hour: js.UndefOr[Boolean] = js.native
  
  /**
    * 日期选择对话框弹出指示区域
    * JSON类型对象，格式如{top:10;left:10;width:200;height:200;}，所有值为像素值，其值相对于容器webview的位置。
    *     如未设置此值，默认在屏幕居中显示。仅在iPad上有效，其它设备忽略此值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var popover: js.UndefOr[js.Any] = js.native
  
  /**
    * 时间选择对话框默认显示的时间
    * 如果未设置标题，则默认显示标题为当前选择的时间。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var time: js.UndefOr[js.Date] = js.native
  
  /**
    * 时间选择对话框显示的标题
    * 如果未设置标题，则默认显示标题为当前选择的时间。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var title: js.UndefOr[String] = js.native
}
object PlusNativeUIPickTimeOption {
  
  @scala.inline
  def apply(): PlusNativeUIPickTimeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeUIPickTimeOption]
  }
  
  @scala.inline
  implicit class PlusNativeUIPickTimeOptionMutableBuilder[Self <: PlusNativeUIPickTimeOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIs24Hour(value: Boolean): Self = StObject.set(x, "is24Hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs24HourUndefined: Self = StObject.set(x, "is24Hour", js.undefined)
    
    @scala.inline
    def setPopover(value: js.Any): Self = StObject.set(x, "popover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopoverUndefined: Self = StObject.set(x, "popover", js.undefined)
    
    @scala.inline
    def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
