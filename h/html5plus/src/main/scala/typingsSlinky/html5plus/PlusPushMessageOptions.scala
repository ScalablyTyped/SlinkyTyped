package typingsSlinky.html5plus

import typingsSlinky.html5plus.html5plusStrings.none
import typingsSlinky.html5plus.html5plusStrings.system
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，获客户端创建本地消息的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
  */
@js.native
trait PlusPushMessageOptions extends js.Object {
  /**
    * 要启动流应用的appid
    * 默认值为当前流应用的appid。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var appid: js.UndefOr[String] = js.native
  /**
    * 是否覆盖上一次提示的消息
    * 可取值true或false，true为覆盖，false不覆盖，默认为permission中设置的cover值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var cover: js.UndefOr[Boolean] = js.native
  /**
    * 提示消息延迟显示的时间
    * 当设备接收到推送消息后，可不立即显示，而是延迟一段时间显示，延迟时间单位为s，默认为0s，立即显示。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * 推送消息的图标
    * 本地图片地址，相对路径 - 相对于当前页面的host位置，如"a.jpg"，注意当前页面为网络地址则不支持； 绝对路径 - 系统绝对路径，如Android平台"/sdcard/logo.png"，此类路径通常通过其它5+ API获取的； 扩展相对路径URL(RelativeURL) - 以"_"开头的相对路径，如"_www/a.jpg"； 本地路径URL - 以“file://”开头，后面跟随系统绝对路径。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * 推送消息的提示音
    * 显示消息时的播放的提示音，可取值：
    * 	“system”-表示使用系统通知提示音；
    * 	“none”-表示不使用提示音；
    * 	默认值为“system”。
    * - system: 使用系统通知提示音
    * - none: 不使用提示音
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var sound: js.UndefOr[system | none] = js.native
  /**
    * 推送消息的标题
    * 在系统消息中心显示的通知消息标题，默认值为程序的名称。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var title: js.UndefOr[String] = js.native
  /**
    * 消息上显示的提示时间
    * 默认为当前时间，如果延迟显示则使用延时后显示消息的时间。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var when: js.UndefOr[js.Date] = js.native
}

object PlusPushMessageOptions {
  @scala.inline
  def apply(): PlusPushMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusPushMessageOptions]
  }
  @scala.inline
  implicit class PlusPushMessageOptionsOps[Self <: PlusPushMessageOptions] (val x: Self) extends AnyVal {
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
    def withCover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
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
    def withSound(value: system | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(js.undefined)
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
    @scala.inline
    def withWhen(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("when")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("when")(js.undefined)
        ret
    }
  }
  
}

