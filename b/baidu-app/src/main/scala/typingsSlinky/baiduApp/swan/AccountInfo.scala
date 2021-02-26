package typingsSlinky.baiduApp.swan

import typingsSlinky.baiduApp.anon.AppId
import typingsSlinky.baiduApp.anon.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #region App里的onLaunch、onShow回调参数
// #region Account
@js.native
trait AccountInfo extends StObject {
  
  /* 小程序账号信息 */
  var miniProgram: AppId = js.native
  
  /* 插件账号信息（仅在插件中调用时包含这一项）     */
  var plugin: js.UndefOr[Version] = js.native
}
object AccountInfo {
  
  @scala.inline
  def apply(miniProgram: AppId): AccountInfo = {
    val __obj = js.Dynamic.literal(miniProgram = miniProgram.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
  
  @scala.inline
  implicit class AccountInfoMutableBuilder[Self <: AccountInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMiniProgram(value: AppId): Self = StObject.set(x, "miniProgram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlugin(value: Version): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
  }
}
