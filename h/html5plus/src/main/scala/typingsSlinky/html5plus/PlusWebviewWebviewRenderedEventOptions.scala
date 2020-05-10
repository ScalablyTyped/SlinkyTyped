package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Webview窗口rendered事件参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebviewWebviewRenderedEventOptions extends js.Object {
  /**
    * 判断窗口渲染完成间隔时间
    * 单位为ms（毫秒），默认值为150ms。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var interval: js.UndefOr[Double] = js.native
  /**
    * 判断窗口渲染完成类型
    * 可取值：
    * 	"top"-从顶部向下偏移22px横线截屏检测渲染是否完成；
    * 	"bottom"-从底部向上偏移25px横线检测渲染是否完成；
    * 	"center"-从中间横线检测渲染是否完成；
    * 	"auto"为全屏检测（左、中、右三条竖线）。
    * 	默认值为"auto"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `type`: js.UndefOr[String] = js.native
}

object PlusWebviewWebviewRenderedEventOptions {
  @scala.inline
  def apply(): PlusWebviewWebviewRenderedEventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewRenderedEventOptions]
  }
  @scala.inline
  implicit class PlusWebviewWebviewRenderedEventOptionsOps[Self <: PlusWebviewWebviewRenderedEventOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

