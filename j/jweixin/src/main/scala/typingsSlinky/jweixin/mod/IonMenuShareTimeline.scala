package typingsSlinky.jweixin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonMenuShareTimeline extends BaseParams {
   // 分享链接
  var imgUrl: String = js.native
   // 分享标题
  var link: String = js.native
  var title: String = js.native
  // 用户取消分享后执行的回调函数
  def cancel(): Unit = js.native
   // 分享图标
  // 用户确认分享后执行的回调函数
  @JSName("success")
  def success_MIonMenuShareTimeline(): Unit = js.native
}

object IonMenuShareTimeline {
  @scala.inline
  def apply(cancel: () => Unit, imgUrl: String, link: String, success: () => Unit, title: String): IonMenuShareTimeline = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), imgUrl = imgUrl.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], success = js.Any.fromFunction0(success), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonMenuShareTimeline]
  }
  @scala.inline
  implicit class IonMenuShareTimelineOps[Self <: IonMenuShareTimeline] (val x: Self) extends AnyVal {
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
  }
  
}

