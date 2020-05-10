package typingsSlinky.jweixin.mod

import typingsSlinky.jweixin.jweixinStrings.link
import typingsSlinky.jweixin.jweixinStrings.music
import typingsSlinky.jweixin.jweixinStrings.video或link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonMenuShareAppMessage extends BaseParams {
  		// 分享类型,music、video或link，不填默认为link
  var dataUrl: js.UndefOr[String] = js.native
  	// 分享标题
  var desc: String = js.native
  	// 分享链接
  var imgUrl: String = js.native
  	// 分享描述
  var link: String = js.native
  var title: String = js.native
  	// 分享图标
  var `type`: js.UndefOr[music | video或link | link] = js.native
  // 用户取消分享后执行的回调函数
  def cancel(): Unit = js.native
   // 如果type是music或video，则要提供数据链接，默认为空
  // 用户确认分享后执行的回调函数
  @JSName("success")
  def success_MIonMenuShareAppMessage(): Unit = js.native
}

object IonMenuShareAppMessage {
  @scala.inline
  def apply(cancel: () => Unit, desc: String, imgUrl: String, link: String, success: () => Unit, title: String): IonMenuShareAppMessage = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), desc = desc.asInstanceOf[js.Any], imgUrl = imgUrl.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], success = js.Any.fromFunction0(success), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonMenuShareAppMessage]
  }
  @scala.inline
  implicit class IonMenuShareAppMessageOps[Self <: IonMenuShareAppMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImgUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: music | video或link | link): Self = {
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

