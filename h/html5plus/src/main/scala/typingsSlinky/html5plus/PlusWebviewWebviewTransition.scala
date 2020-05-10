package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 一组用于定义页面或控件转换效果的属性
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebviewWebviewTransition extends js.Object {
  /**
    * 变换持续的时间
    * 默认值为0，即无动画效果。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var duration: js.UndefOr[String] = js.native
  /**
    * 产生变换效果的属性
    * 默认值为"all"，暂不支持其它值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var property: js.UndefOr[String] = js.native
  /**
    * 窗口变换效果
    * 可取值：
    * 	"linear"：匀速变化，匀速动画效果；
    * 	"ease-in"：匀加速变化，逐渐变快的动画效果；
    * 	"ease-out"：匀减速变化，逐渐变慢的动画效果；
    * 	"ease-in-out"：先加速后减速变化，先变快后变慢的动画效果。
    * 	默认值为"ease-in-out"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var timingfunction: js.UndefOr[String] = js.native
}

object PlusWebviewWebviewTransition {
  @scala.inline
  def apply(): PlusWebviewWebviewTransition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewTransition]
  }
  @scala.inline
  implicit class PlusWebviewWebviewTransitionOps[Self <: PlusWebviewWebviewTransition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(js.undefined)
        ret
    }
    @scala.inline
    def withTimingfunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingfunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimingfunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingfunction")(js.undefined)
        ret
    }
  }
  
}

