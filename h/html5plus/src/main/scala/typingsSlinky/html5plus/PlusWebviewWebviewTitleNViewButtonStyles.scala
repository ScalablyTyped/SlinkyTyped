package typingsSlinky.html5plus

import typingsSlinky.html5plus.html5plusStrings.back
import typingsSlinky.html5plus.html5plusStrings.bold
import typingsSlinky.html5plus.html5plusStrings.close
import typingsSlinky.html5plus.html5plusStrings.favorite
import typingsSlinky.html5plus.html5plusStrings.forward
import typingsSlinky.html5plus.html5plusStrings.home
import typingsSlinky.html5plus.html5plusStrings.left
import typingsSlinky.html5plus.html5plusStrings.menu
import typingsSlinky.html5plus.html5plusStrings.normal
import typingsSlinky.html5plus.html5plusStrings.right
import typingsSlinky.html5plus.html5plusStrings.share
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 窗口标题栏自定义按钮样式
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebviewWebviewTitleNViewButtonStyles extends js.Object {
  
  /**
    * 按钮的背景颜色
    * 仅在标题栏type=transparent时生效，当标题栏透明时按钮显示的背景颜色。
    *     可取值#RRGGBB和rgba格式颜色字符串，默认值为灰色半透明。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var background: js.UndefOr[String] = js.native
  
  /**
    * 按钮上显示的角标文本
    * 最多显示3个字符，超过则显示为...。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var badgeText: js.UndefOr[String] = js.native
  
  /**
    * 按钮上文字颜色
    * 可取值： "#RRGGBB"格式字符串，如"#FF0000"表示绘制红色返回键；
    *     "rgba(R,G,B,A)"，其中R/G/B分别代表红色值/绿色值/蓝色值，正整数类型，取值范围为0-255，A为透明度，浮点数类型，取值范围为0-1（0为全透明，1为不透明），如"rgba(255,0,0,0.5)"，表示红色半透明。
    *     默认值为窗口标题栏控件的标题文字颜色。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * 按下状态按钮文字颜色
    * 可取值： "#RRGGBB"格式字符串，如"#FF0000"表示绘制红色返回键；
    *     "rgba(R,G,B,A)"，其中R/G/B分别代表红色值/绿色值/蓝色值，正整数类型，取值范围为0-255，A为透明度，浮点数类型，取值范围为0-1（0为全透明，1为不透明），如"rgba(255,0,0,0.5)"，表示红色半透明。
    *     默认值为color属性值自动调整透明度为0.3。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var colorPressed: js.UndefOr[String] = js.native
  
  /**
    * 按钮在标题栏上的显示位置
    * 可取值：
    *         "right" - 在标题栏中靠右排列显示；
    *         "left" - 在标题栏中靠左侧排列显示（在返回键后）。
    *         默认值为"right"。
    * - right: 
    *     在标题栏中靠右排列显示
    *                                 
    * - left: 
    *     在标题栏中靠左侧排列显示（在返回键后）
    *                                 
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var float: js.UndefOr[right | left] = js.native
  
  /**
    * 按钮上文字大小
    * 可取值：字体高度像素值，数字加"px"格式字符串，如"22px"。 
    *     窗口标题栏为透明样式（type="transparent"）时，默认值为"22px"；
    *     窗口标题栏为默认样式（type="default"）时，默认值为"27px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var fontSize: js.UndefOr[String] = js.native
  
  /**
    * 按钮上文字使用的字体文件路径
    * 字体文件路径支持以下类型：
    *         相对路径 - 相对于当前页面的host位置，如"a.ttf"，注意当前页面为网络地址则不支持；
    *         绝对路径 - 系统绝对路径，如Android平台"/sdcard/a.ttf"，此类路径通常通过其它5+ API获取的；
    *         扩展相对路径URL(RelativeURL) - 以"_"开头的相对路径，如"_www/a.ttf"；
    *         本地路径URL - 以“file://”开头，后面跟随系统绝对路径。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var fontSrc: js.UndefOr[String] = js.native
  
  /**
    * 按钮上文字的粗细
    * 可取值：
    *         "normal" - 标准字体；
    *         "bold" - 加粗字体。
    *     默认值为"normal"。
    * - normal: 
    *     标准字体
    *                                 
    * - bold: 
    *     加粗字体
    *                                 
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var fontWeight: js.UndefOr[normal | bold] = js.native
  
  /**
    * 按钮点击后触发的回调函数
    * 回调函数中将返回此JSON对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var onclick: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.native
  
  /**
    * 按钮上是否显示红点
    * 设置为true则显示红点，false则不显示红点。默认值为false。
    *     注意：当设置了角标文本时红点不显示。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var redDot: js.UndefOr[Boolean] = js.native
  
  /**
    * 是否显示选择指示图标
    * 设置为true则显示选择指示图标（向下箭头），颜色与文字颜色一致；
    *     false则不显示。默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var select: js.UndefOr[Boolean] = js.native
  
  /**
    * 按钮上显示的文字
    * 推荐使用一个字符，超过一个字符可能无法正常显示，使用字体图标时unicode字符表示必须'\\u'开头，如"\\ue123"（注意不能写成"\e123"）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * 按钮样式
    * 运行环境中内置按钮样式直接使用，内置样式忽略fontSrc和text属性。
    *     可取值：
    *         "forward" - 前进按钮；
    *         "back" - 后退按钮；
    *         "share" - 分享按钮；
    *         "favorite" - 收藏按钮；
    *         "home" - 主页按钮；
    *         "menu" - 菜单按钮；
    *         "close" - 关闭按钮；
    *         "none" - 无样式。
    *     默认值为无样式（"none"），需通过text属性设置按钮上显示的内容、通过fontSrc属性设置使用的字体库。
    * - forward: 前进按钮
    * - back: 后退按钮
    * - share: 分享按钮
    * - favorite: 收藏按钮
    * - home: 主页按钮
    * - menu: 菜单按钮
    * - close: 关闭按钮
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `type`: js.UndefOr[forward | back | share | favorite | home | menu | close] = js.native
  
  /**
    * 按钮的宽度
    * 可取值：
    *         "*px" - 逻辑像素值，如"10px"表示10逻辑像素值，按钮的内容居中显示；
    *         "auto" - 自定计算宽度，根据内容自动调整按钮宽度。
    *     默认值为"44px"（适合字体图标）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var width: js.UndefOr[String] = js.native
}
object PlusWebviewWebviewTitleNViewButtonStyles {
  
  @scala.inline
  def apply(): PlusWebviewWebviewTitleNViewButtonStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewTitleNViewButtonStyles]
  }
  
  @scala.inline
  implicit class PlusWebviewWebviewTitleNViewButtonStylesOps[Self <: PlusWebviewWebviewTitleNViewButtonStyles] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBadgeText(value: String): Self = this.set("badgeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadgeText: Self = this.set("badgeText", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorPressed(value: String): Self = this.set("colorPressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorPressed: Self = this.set("colorPressed", js.undefined)
    
    @scala.inline
    def setFloat(value: right | left): Self = this.set("float", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloat: Self = this.set("float", js.undefined)
    
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontSrc(value: String): Self = this.set("fontSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSrc: Self = this.set("fontSrc", js.undefined)
    
    @scala.inline
    def setFontWeight(value: normal | bold): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setOnclick(value: /* result */ js.Any => Unit): Self = this.set("onclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnclick: Self = this.set("onclick", js.undefined)
    
    @scala.inline
    def setRedDot(value: Boolean): Self = this.set("redDot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedDot: Self = this.set("redDot", js.undefined)
    
    @scala.inline
    def setSelect(value: Boolean): Self = this.set("select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setType(value: forward | back | share | favorite | home | menu | close): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
