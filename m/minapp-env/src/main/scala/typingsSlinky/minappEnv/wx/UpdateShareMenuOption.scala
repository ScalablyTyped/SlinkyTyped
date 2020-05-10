package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateShareMenuOption extends js.Object {
  /** 动态消息的 activityId。通过 [createActivityId]((createActivityId)) 接口获取
    *
    * 最低基础库： `2.4.0` */
  var activityId: js.UndefOr[String] = js.native
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[UpdateShareMenuCompleteCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[UpdateShareMenuFailCallback] = js.native
  /** 是否是动态消息，详见[动态消息]((updatable-message))
    *
    * 最低基础库： `2.4.0` */
  var isUpdatableMessage: js.UndefOr[Boolean] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[UpdateShareMenuSuccessCallback] = js.native
  /** 动态消息的模板信息
    *
    * 最低基础库： `2.4.0` */
  var templateInfo: js.UndefOr[UpdatableMessageFrontEndTemplateInfo] = js.native
  /** 是否使用带 shareTicket 的转发[详情]((转发#获取更多转发信息)) */
  var withShareTicket: js.UndefOr[Boolean] = js.native
}

object UpdateShareMenuOption {
  @scala.inline
  def apply(): UpdateShareMenuOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateShareMenuOption]
  }
  @scala.inline
  implicit class UpdateShareMenuOptionOps[Self <: UpdateShareMenuOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityId")(js.undefined)
        ret
    }
    @scala.inline
    def withComplete(value: /* res */ GeneralCallbackResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(value: /* res */ GeneralCallbackResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withIsUpdatableMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUpdatableMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsUpdatableMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUpdatableMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateInfo(value: UpdatableMessageFrontEndTemplateInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withWithShareTicket(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withShareTicket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithShareTicket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withShareTicket")(js.undefined)
        ret
    }
  }
  
}

