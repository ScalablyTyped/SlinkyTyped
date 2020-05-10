package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，微信小程序信息
  * 用于配置分享小程序的参数，如小程序标识、页面路径等。
  * 	注意：分享的小程序需要在微信开放平台关联的开发者账号下，否则会分享失败。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
  */
@js.native
trait PlusShareWeixinMiniProgramOptions extends js.Object {
  /**
    * 微信小程序ID
    * 注意：是微信小程序的原始ID（"g_"开头的字符串）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var id: js.UndefOr[String] = js.native
  /**
    * 微信小程序打开的页面路径
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var path: js.UndefOr[String] = js.native
  /**
    * 微信小程序版本类型
    * 可取值：
    * 	0-正式版；
    * 	1-测试版；
    * 	2-体验版。
    * 	默认值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var `type`: js.UndefOr[Double] = js.native
  /**
    * 兼容低版本的网页链接
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var webUrl: js.UndefOr[String] = js.native
}

object PlusShareWeixinMiniProgramOptions {
  @scala.inline
  def apply(): PlusShareWeixinMiniProgramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusShareWeixinMiniProgramOptions]
  }
  @scala.inline
  implicit class PlusShareWeixinMiniProgramOptionsOps[Self <: PlusShareWeixinMiniProgramOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
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
    @scala.inline
    def withWebUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webUrl")(js.undefined)
        ret
    }
  }
  
}

