package typingsSlinky.html5plus

import typingsSlinky.html5plus.html5plusStrings.auto
import typingsSlinky.html5plus.html5plusStrings.editable
import typingsSlinky.html5plus.html5plusStrings.slient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，分享消息对象
  * ShareMessage对象用于表示分享消息内容，在JS中为JSON对象，用于向系统发送分享信息操作。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
  */
@js.native
trait PlusShareShareMessage extends js.Object {
  /**
    * 分享消息的文字内容
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var content: js.UndefOr[String] = js.native
  /**
    * 分享消息扩展参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var extra: js.UndefOr[PlusShareShareMessageExtra] = js.native
  /**
    * 分享消息中包含的用户地理信息数据
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var geo: js.UndefOr[PlusShareGeoPosition] = js.native
  /**
    * 分享独立的链接
    * 分享资源地址，仅支持网络地址（以http://或https://开头）。
    * 	如果未指定type类型，优先级顺序为：href&gt;pictures&gt;content（即设置了href则认为分享网页类型）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var href: js.UndefOr[String] = js.native
  /**
    * 分享消息的模式
    * 可取值：
    *     "auto" - 自动选择，如果已经安装微博客户端则采用编辑界面进行分享，否则采用无界面分享；
    *     "slient" - 静默分享，采用无界面模式进行分享；
    *     "editable" - 进入编辑界面，用户确认分享内容后发送，如果当前未安装微博客户端则触发错误回调。
    *     默认值为"auto"。
    *     （仅新浪微博分享时生效）
    * - auto: 
    * 	自动选择，如果已经安装微博客户端则采用编辑界面进行分享，否则采用无界面分享
    * 								
    * - slient: 
    * 	静默分享，采用无界面模式进行分享
    * 								
    * - editable: 
    * 	进入编辑界面，用户确认分享内容后发送，如果当前未安装微博客户端则触发错误回调
    * 								
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var interface: js.UndefOr[auto | slient | editable] = js.native
  /**
    * 分享的多媒体资源
    * 分享的多媒体资源地址，当type值为"music"、"video"时有效。
    * 	注意：
    * 		微信分享平台支持音乐、视频类型，仅支持网络地址（以http://或https://开头）；
    * 		QQ分享平台支持音乐类型，仅支持网络路径（以http://或https://开头）；
    * 		新浪微博分享平台支持视频类型，仅支持本地文件路径。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var media: js.UndefOr[String] = js.native
  /**
    * 分享微信小程序参数
    * 仅微信分享小程序类型时支持。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var miniProgram: js.UndefOr[PlusShareWeixinMiniProgramOptions] = js.native
  /**
    * 分享消息的图片
    * 分享消息中包含的图片路径，仅支持本地路径。
    * 	若分享平台仅支持提交一张图片，传入多张图片则仅提交第一张图片。
    * 	如果未指定type类型，优先级顺序为：pictures&gt;content（即设置了pictures则认为分享图片类型）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var pictures: js.UndefOr[js.Array[_]] = js.native
  /**
    * 分享消息的缩略图
    * 分享消息中包含的缩略图路径，支持本地路径及网络路径。
    * 	若分享平台仅支持提交一张图片，传入多张图片则仅提交第一张图片。
    * 	如果分享平台的信息不支持缩略图，若没有设置消息的图片（pictures）则使用缩略图，否则忽略其属性值。
    * 	注意：图片有大小限制，推荐图片小于20Kb。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var thumbs: js.UndefOr[js.Array[_]] = js.native
  /**
    * 分享消息的标题
    * 仅微信分享网页、音频、视频、小程序类型时支持。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var title: js.UndefOr[String] = js.native
  /**
    * 分享消息的类型
    * 
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var `type`: js.UndefOr[String] = js.native
}

object PlusShareShareMessage {
  @scala.inline
  def apply(): PlusShareShareMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusShareShareMessage]
  }
  @scala.inline
  implicit class PlusShareShareMessageOps[Self <: PlusShareShareMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withExtra(value: PlusShareShareMessageExtra): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(js.undefined)
        ret
    }
    @scala.inline
    def withGeo(value: PlusShareGeoPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geo")(js.undefined)
        ret
    }
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(js.undefined)
        ret
    }
    @scala.inline
    def withInterface(value: auto | slient | editable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interface")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(js.undefined)
        ret
    }
    @scala.inline
    def withMiniProgram(value: PlusShareWeixinMiniProgramOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miniProgram")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiniProgram: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miniProgram")(js.undefined)
        ret
    }
    @scala.inline
    def withPictures(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pictures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPictures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pictures")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbs(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbs")(js.undefined)
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

