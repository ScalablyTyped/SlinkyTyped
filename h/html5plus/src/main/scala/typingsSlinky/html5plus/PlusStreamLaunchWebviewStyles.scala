package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，启动流应用的首页窗口属性
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
  */
@js.native
trait PlusStreamLaunchWebviewStyles extends js.Object {
  /**
    * 流应用首页是否阻塞网络图片的加载
    * true表示阻塞网络图片的加载，false表示不阻塞网络图片的加载。默认值为false。
    * 	设置后可通过Webview窗口对象的setBlockNetworkImage(false)方法修改设置来继续加载网络图片。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var blockNetworkImage: js.UndefOr[Boolean] = js.native
  /**
    * 指定首页Webview的id
    * 如果未指定id，则使用应用的appid作为首页Webview的id。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var id: js.UndefOr[String] = js.native
  /**
    * 指定流应用首页地址
    * 可使用网络地址（http://或https://开头），也可使用本地地址（相对应用资源路径）。
    * 	也可使用特定地址：
    * 	about:blank - 使用空白首页，仅加载内置注入的脚本（如all.js、wap2app.js、config.js等）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var launch_path: js.UndefOr[String] = js.native
  /**
    * 流应用首页是否显示
    * true表示显示，false表示不显示。默认值为true。
    * 	注意：流应用首页隐藏后，需要调用首页的setVisible方法显示，如plus.webview.getLaunchWebview().setVisible(true)。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object PlusStreamLaunchWebviewStyles {
  @scala.inline
  def apply(): PlusStreamLaunchWebviewStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusStreamLaunchWebviewStyles]
  }
  @scala.inline
  implicit class PlusStreamLaunchWebviewStylesOps[Self <: PlusStreamLaunchWebviewStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockNetworkImage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockNetworkImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockNetworkImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockNetworkImage")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunch_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launch_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunch_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launch_path")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

