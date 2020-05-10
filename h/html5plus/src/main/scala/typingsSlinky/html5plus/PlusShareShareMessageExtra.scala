package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，保存分享消息扩展信息
  * ShareMessageExtra对象用于保存各分享平台扩展的参数，用于自定义分享功能。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
  */
@js.native
trait PlusShareShareMessageExtra extends js.Object {
  /**
    * 微信分享场景，仅微信分享平台有效
    * 可取值：
    * 	"WXSceneSession"分享到微信的“我的好友”；
    * 	"WXSceneTimeline"分享到微信的“朋友圈”中；
    * 	"WXSceneFavorite"分享到微信的“我的收藏”中。
    * 	默认值为"WXSceneSession"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var scene: js.UndefOr[String] = js.native
}

object PlusShareShareMessageExtra {
  @scala.inline
  def apply(): PlusShareShareMessageExtra = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusShareShareMessageExtra]
  }
  @scala.inline
  implicit class PlusShareShareMessageExtraOps[Self <: PlusShareShareMessageExtra] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScene(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScene: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(js.undefined)
        ret
    }
  }
  
}

