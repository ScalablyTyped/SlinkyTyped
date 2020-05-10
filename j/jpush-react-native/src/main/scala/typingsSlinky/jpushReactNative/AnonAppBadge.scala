package typingsSlinky.jpushReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAppBadge extends js.Object {
  /**
    * iOS 用来标记应用程序状态的一个数字,出现在程序图标右上角。设置的值小于0时，sdk不作处理。
    */
  var appBadge: Double = js.native
  /**
    * Push封装badge功能,允许应用上传 badge 值至 JPush 服务器,由 JPush 后台帮助管理每个用户所对应的推送 badge 值,简化了设置推送 badge 的操作。设置的值小于0时，sdk时不作处理。
    */
  var badge: Double = js.native
}

object AnonAppBadge {
  @scala.inline
  def apply(appBadge: Double, badge: Double): AnonAppBadge = {
    val __obj = js.Dynamic.literal(appBadge = appBadge.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppBadge]
  }
  @scala.inline
  implicit class AnonAppBadgeOps[Self <: AnonAppBadge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppBadge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBadge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBadge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

