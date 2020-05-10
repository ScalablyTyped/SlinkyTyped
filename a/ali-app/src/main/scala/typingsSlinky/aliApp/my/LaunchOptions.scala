package typingsSlinky.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchOptions extends js.Object {
  /**
  		 * 打开小程序的路径
  		 */
  var path: String = js.native
  /**
  		 * 打开小程序的query
  		 */
  var query: js.Object = js.native
  /**
  		 * 当场景为由从另一个小程序或公众号或App打开时，返回此字段
  		 */
  var referrerInfo: js.Object = js.native
  /**
  		 * 来源小程序或公众号或App的 appId，详见下方说明
  		 */
  @JSName("referrerInfo.appId")
  var referrerInfoDotappId: String = js.native
  /**
  		 * 来源小程序传过来的数据，scene=1037或1038时支持
  		 */
  @JSName("referrerInfo.extraData")
  var referrerInfoDotextraData: js.Object = js.native
  /**
  		 * 打开小程序的[场景值]
  		 */
  var scene: Double = js.native
  /**
  		 * shareTicket，详见 获取更多[转发信息]
  		 */
  var shareTicket: String = js.native
}

object LaunchOptions {
  @scala.inline
  def apply(
    path: String,
    query: js.Object,
    referrerInfo: js.Object,
    referrerInfoDotappId: String,
    referrerInfoDotextraData: js.Object,
    scene: Double,
    shareTicket: String
  ): LaunchOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], referrerInfo = referrerInfo.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
    __obj.updateDynamic("referrerInfo.appId")(referrerInfoDotappId.asInstanceOf[js.Any])
    __obj.updateDynamic("referrerInfo.extraData")(referrerInfoDotextraData.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchOptions]
  }
  @scala.inline
  implicit class LaunchOptionsOps[Self <: LaunchOptions] (val x: Self) extends AnyVal {
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
    def withReferrerInfo(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrerInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferrerInfoDotappId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrerInfo.appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferrerInfoDotextraData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrerInfo.extraData")(value.asInstanceOf[js.Any])
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

