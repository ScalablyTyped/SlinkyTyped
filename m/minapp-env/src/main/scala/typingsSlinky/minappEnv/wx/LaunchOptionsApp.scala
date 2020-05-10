package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 启动参数 */
@js.native
trait LaunchOptionsApp extends js.Object {
  /** 启动小程序的路径 */
  var path: String = js.native
  /** 启动小程序的 query 参数 */
  var query: js.Object = js.native
  /** 来源信息。从另一个小程序、公众号或 App 进入小程序时返回。否则返回 `{}`。(参见后文注意) */
  var referrerInfo: ReferrerInfo = js.native
  /** 启动小程序的[场景值]((scene)) */
  var scene: Double = js.native
  /** shareTicket，详见[获取更多转发信息]((转发#获取更多转发信息)) */
  var shareTicket: String = js.native
}

object LaunchOptionsApp {
  @scala.inline
  def apply(path: String, query: js.Object, referrerInfo: ReferrerInfo, scene: Double, shareTicket: String): LaunchOptionsApp = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], referrerInfo = referrerInfo.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchOptionsApp]
  }
  @scala.inline
  implicit class LaunchOptionsAppOps[Self <: LaunchOptionsApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferrerInfo(value: ReferrerInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrerInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScene(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShareTicket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareTicket")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

