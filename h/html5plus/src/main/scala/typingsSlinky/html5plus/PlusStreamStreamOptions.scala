package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，启动流应用参数
  * 指定要启动的流应用标识、名称、图标、参数等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
  */
@js.native
trait PlusStreamStreamOptions extends js.Object {
  /**
    * 流应用标识
    * 流应用唯一字符串标识。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var appid: js.UndefOr[String] = js.native
  /**
    * 流应用运行模式
    * 可取值："test"表示测试版模式运行，其它值则为正式版本模式。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var appmode: js.UndefOr[String] = js.native
  /**
    * 启动流应用的直达页面链接地址
    * 可在应用中通过plus.runtime.processDirectPage()方法获取。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var direct_page: js.UndefOr[String] = js.native
  /**
    * 流应用运行参数
    * 启动流应用的扩展参数，可在流应用中通过plus.runtime.arguments获取。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var extras: js.UndefOr[js.Any] = js.native
  /**
    * 流应用图标
    * 流应用显示的图标路径（仅支持本地路径），在启动提示界面中显示。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * 流应用启动类型
    * 流应用的启动类型，可在流应用中通过plus.runtime.launcher获取，默认值为“stream”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var launcher: js.UndefOr[String] = js.native
  /**
    * 启动流应用的快捷方式逻辑
    * 可取值：
    * 		"auto" - 检查并引导用户打开快捷方式权限，自动创建桌面快捷方式，在不支持快捷方式滤重的系统上仅创建一次；
    *         "force" - 检查并引导用户打开快捷方式权限，自动创建桌面快捷方式，在不支持快捷方式滤重的系统上每次都尝试创建；
    *         "none" - 不检查快捷方式权限，不创建桌面快捷方式（与从桌面快捷方式启动的流程一致）；
    *         "query" - 弹出询问提示框（底部显示），用户点击确定后创建桌面快捷方式（检查并引导用户打开快捷方式权限）；
    *         "tipOnce" - 业务逻辑与"auto"类似，差别是只会引导用户打开快捷方式权限一次、toast提示一次。
    * 	默认值为"force"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var shortcut: js.UndefOr[String] = js.native
  /**
    * 退出流应用的快捷方式逻辑
    * 可取值：
    * 		"query" - 应用退出时检查是否创建桌面快捷方式，如果查询到没有创建则弹出询问框，用户点击确定后创建桌面快捷方式（检查并引导用户打开快捷方式权限）；
    *         "queryOnce" - 仅应用第一次退出检查，检查逻辑同query；
    *         "none" - 应用退出时不检查是否创建桌面快捷方式。
    * 	默认值为"none"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var shortcutQuit: js.UndefOr[String] = js.native
  /**
    * 应用启动界面样式
    * 可取值：
    * 	"auto"：自动选择启动界面，如果splash图片已经下载则显示splash图片，否则使用默认加载流应用界面；
    * 	"default"：使用默认加载流应用界面（如在360浏览器环境中在标题栏下显示加载进度条）。
    * 	默认值为"auto"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var splash: js.UndefOr[String] = js.native
  /**
    * 流应用首页窗口对象样式
    * 如果流应用已经运行，从后台激活到前台时忽略此属性。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var styles: js.UndefOr[PlusStreamLaunchWebviewStyles] = js.native
  /**
    * 流应用名称
    * 流应用显示的标题，在启动提示界面中显示。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var title: js.UndefOr[String] = js.native
}

object PlusStreamStreamOptions {
  @scala.inline
  def apply(): PlusStreamStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusStreamStreamOptions]
  }
  @scala.inline
  implicit class PlusStreamStreamOptionsOps[Self <: PlusStreamStreamOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appid")(js.undefined)
        ret
    }
    @scala.inline
    def withAppmode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppmode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appmode")(js.undefined)
        ret
    }
    @scala.inline
    def withDirect_page(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direct_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirect_page: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direct_page")(js.undefined)
        ret
    }
    @scala.inline
    def withExtras(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extras")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtras: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extras")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withLauncher(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLauncher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launcher")(js.undefined)
        ret
    }
    @scala.inline
    def withShortcut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortcut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcut")(js.undefined)
        ret
    }
    @scala.inline
    def withShortcutQuit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcutQuit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortcutQuit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcutQuit")(js.undefined)
        ret
    }
    @scala.inline
    def withSplash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splash")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: PlusStreamLaunchWebviewStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

