package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: js.Object): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerInfo(value: ReferrerInfo): Self = this.set("referrerInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScene(value: Double): Self = this.set("scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareTicket(value: String): Self = this.set("shareTicket", value.asInstanceOf[js.Any])
  }
}
