package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Webview窗口回弹样式
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebviewWebviewBounceStyle extends js.Object {
  
  /**
    * Webview窗口回弹时停靠的位置
    * 开启窗口回弹效果后，当窗口中展现的内容滚动到头（顶部或底部）时，再拖拽时窗口整体内容将跟随移动，拖拽过程中将触发"dragBounce"事件，松开后自动回弹到停靠位置。
    *     支持以下属性：
    *     top：表示窗口顶部回弹时停靠的位置。
    *     属性值：用于指定窗口回弹的位置，可取百分比，如"5%"；像素值，如"100px"；自动计算值，如"auto"，默认为可拖拽的范围值的一半；
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var changeoffset: js.UndefOr[js.Any] = js.native
  
  /**
    * Webview窗口拖拽偏移的位置
    * 开启窗口回弹效果后，可以通过此属性值来主动设置拖拽的偏移位置，与手动操作拖拽至此偏移位置松开后的逻辑一致。
    *     支持以下属性：
    *     top：表示窗口顶部偏移的位置；
    *     left：表示窗口左侧偏移的位置；
    *     right：表示窗口右侧偏移的位置；
    *     bottom：表示窗口底部偏移的位置。
    *     属性值：用于指定偏移的位置，可取百分比，如"5%"；像素值，如"100px"；有效值范围为0到position属性定义的位置。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var offset: js.UndefOr[js.Any] = js.native
  
  /**
    * Webview窗口支持回弹效果的方向
    * 可通过此参数设置开启Webview哪个方向支持回弹效果。
    *     支持以下属性：
    *     top：表示窗口顶部支持回弹效果；
    *     left：表示窗口左侧支持回弹效果；
    *     right：表示窗口右侧支持回弹效果；
    *     bottom：表示窗口底部支持回弹效果。
    *     **目前仅支持top属性**
    *     属性值：用于指定可拖拽的范围，可取百分比，如"10%"；像素值，如"100px"；自动计算值，如"auto"；无回弹效果值，如"none"；
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var position: js.UndefOr[js.Any] = js.native
  
  /**
    * Webview窗口是否阻止touch事件传递给DOM元素
    * 设置为true表示阻止touch事件，设置为false表示不阻止touch事件。当开启侧滑功能（左侧滑和右侧滑）时默认值为true，否则为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var preventTouchEvent: js.UndefOr[Boolean] = js.native
  
  /**
    * Webview窗口侧滑时停靠的位置
    * 开启窗口回弹效果后，当窗口中展现的内容滚动到头（左侧或右侧）时，在拖拽时窗口整体内容将跟随移动，松开后自动停靠的侧滑位置，并触发"slideBounce"事件。
    *     支持以下属性：
    *     left：表示窗口左侧侧滑的位置；
    *     right：表示窗口右侧侧滑的位置。
    *     属性值：用于指定滑动后停靠的距离，可取百分比（left/right相对于窗口的宽度，top/bottom相对于窗口的高度），如"30%"；像素值，如"100px"；自动计算值，为可拖拽范围，如"auto"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var slideoffset: js.UndefOr[js.Any] = js.native
}
object PlusWebviewWebviewBounceStyle {
  
  @scala.inline
  def apply(): PlusWebviewWebviewBounceStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewBounceStyle]
  }
  
  @scala.inline
  implicit class PlusWebviewWebviewBounceStyleOps[Self <: PlusWebviewWebviewBounceStyle] (val x: Self) extends AnyVal {
    
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
    def setChangeoffset(value: js.Any): Self = this.set("changeoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeoffset: Self = this.set("changeoffset", js.undefined)
    
    @scala.inline
    def setOffset(value: js.Any): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPosition(value: js.Any): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setPreventTouchEvent(value: Boolean): Self = this.set("preventTouchEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventTouchEvent: Self = this.set("preventTouchEvent", js.undefined)
    
    @scala.inline
    def setSlideoffset(value: js.Any): Self = this.set("slideoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideoffset: Self = this.set("slideoffset", js.undefined)
  }
}
